package org.apache.bookkeeper.bookie;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Enclosed.class)
public class FileInfoTest {
	
	@RunWith(Parameterized.class)
	public static class MoveToNewLocationTest {
		
		private File newFile;
		
		private long size;		
		private String expectedResult;
	
		private FileInfo fi;
		
		@Parameters
		public static Collection<Object[]> data() throws IOException {
	        return Arrays.asList(new Object[][] {
	        	{File.createTempFile("origin","file"), -1, true, true, "true" },
	        	{File.createTempFile("origin","file"), 0, true, true, "true" }, 
	        	{File.createTempFile("origin","file"), 10, true, false, "true" }, 
	        	{File.createTempFile("origin","file"), 10, true, true, "true" },
	        	{File.createTempFile("origin","file"), 11, true, true, "true" },
	        	{File.createTempFile("origin","file"), Integer.MAX_VALUE, true, true, "true" },
	        	// {null, 10, true, null}, Errore perche il file deve esistere. Altrimenti viene lanciata un eccezione
	        	{new File("/tmp/original"), 10, true, true, "true" },
	        });
	    }
		
		public MoveToNewLocationTest(File newFile, long size, boolean create, boolean permiss, String expectedResult) {
				configure(newFile, size, create, permiss, expectedResult);
		}
		
		public void configure(File newFile, long size, boolean create, boolean permiss, String expectedResult) {
			byte[] masterKey = {'a', 'b', 'c'};
			File oldFile = new File("/tmp/original");
			try {
				fi = new FileInfo(oldFile, masterKey, 1);
				fi.checkOpen(create);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			if(!permiss) {
				newFile.setWritable(false); //can't write the file
				newFile.setReadable(false);
			}
			
			this.newFile = newFile;
			this.size = size;
			this.expectedResult = expectedResult;
			
		}
		
		@Test
		public void moveToNewLocationTest() {
			try {
				fi.moveToNewLocation(newFile, size);
				Assert.assertEquals(expectedResult, String.valueOf(fi.isSameFile(newFile)));
			} catch (IOException e) {
				Assert.assertEquals(expectedResult, e.getMessage());
			} catch (NullPointerException e) {
				Assert.assertEquals(expectedResult, e.getMessage());
			}
		}
	}	
	
	/**
	 * The tested method is ReadAbsolute, but since that ReadAbsolute is private, it is used
	 * read as entrypoint
	 * 
	 * 
	 */
	@RunWith(Parameterized.class)
	public static class ReadAbsoluteTest {
		
		private ByteBuffer bb; 
		private long start;
		private boolean bestEffort;
		private String expectedResult;
		
		private FileInfo fi;
		
		@Parameters
		public static Collection<Object[]> data() {
	        return Arrays.asList(new Object[][] {
	        	{ ByteBuffer.wrap("abcde".getBytes()), ByteBuffer.allocate(5), -1, true, "5" },
	        	{ ByteBuffer.wrap("abcde".getBytes()), ByteBuffer.allocate(5), 0, true, "5" },
	        	{ ByteBuffer.wrap("abcde".getBytes()), ByteBuffer.allocate(4), 0, true, "4" },
	        	{ ByteBuffer.wrap("abcde".getBytes()), ByteBuffer.allocate(5), 4, true, "1" },
	        	{ ByteBuffer.wrap("abcde".getBytes()), ByteBuffer.allocate(5), 5, true, "0" },
	        	{ ByteBuffer.wrap("abcde".getBytes()), ByteBuffer.allocate(0), 0, true, "0" },
	        	{ ByteBuffer.wrap("abcde".getBytes()), null, 0, true, "NullPointerException" },
	        	{ ByteBuffer.wrap("abcde".getBytes()), ByteBuffer.allocate(5), 4, false, "Short read" },
	        	{ null, ByteBuffer.allocate(5), 0, true, "0" },
	        	{ ByteBuffer.allocate(10000), ByteBuffer.allocate(10000), 0, true, "10000" },
	        });
	    }
		
		public ReadAbsoluteTest(ByteBuffer content, ByteBuffer bb, long start, boolean bestEffort, String expectedResult) {
			configure(content, bb, start, bestEffort, expectedResult);
		}
		
		@After
		public void tearDownEnvironment() {
			try {
				fi.delete();
				fi.close(true);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		public void configure(ByteBuffer content, ByteBuffer bb, long start, boolean bestEffort, String expectedResult) {
			byte[] masterKey = {'a', 'b', 'c'};
			
			try {
				fi = new FileInfo(new File("/tmp/file"), masterKey, 1);
				
				if (content != null) {
					ByteBuffer[] array = new ByteBuffer[1];
					array[0] = content;
					
					fi.write(array, 0);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			this.bb = bb;
			this.start = start;
			this.bestEffort = bestEffort;
			this.expectedResult = expectedResult;
		}
		
		@Test
		public void readAbsoluteTest() {
			try {
				Assert.assertEquals(expectedResult, Integer.toString(fi.read(bb, start, bestEffort)));
			} catch (IOException e) {
				Assert.assertTrue(e.getMessage().startsWith(expectedResult));
			} catch (NullPointerException e) {
				Assert.assertTrue(e.getClass().toString().contains(expectedResult));
			} catch (IllegalArgumentException e) {
				Assert.assertEquals(expectedResult, e.getMessage());
			} 
		} 
	}
	
}
