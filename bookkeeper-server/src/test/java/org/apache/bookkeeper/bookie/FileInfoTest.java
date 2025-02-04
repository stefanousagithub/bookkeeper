package org.apache.bookkeeper.bookie;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.Collection;

import org.apache.bookkeeper.bookie.FileInfo.FileInfoDeletedException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.mockito.Mockito;
import org.powermock.reflect.Whitebox;

import static org.mockito.Mockito.*;

@RunWith(Enclosed.class)
public class FileInfoTest {
	
	@RunWith(Parameterized.class)
	public static class MoveToNewLocationTest {
		private File newFile;
		
		private long size;		
		private String expectedResult;
	
		private FileInfo fi;
		private FileInfo spyFi;
		private FileChannel mockFc;
		private byte[] masterKey = {'a', 'b', 'c'};
		
		@Parameters
		public static Collection<Object[]> data() throws IOException {
	        return Arrays.asList(new Object[][] {
	        	{File.createTempFile("origin","file"), -1, 0, "10" },    				// 0
	        	{File.createTempFile("origin","file"), 0, 0, "10" }, 					// 1
	        	{File.createTempFile("origin","file"), 1, 0, "10" },					// 2
	        	{File.createTempFile("origin","file"), 10, 0, "10" },					// 3
	        	{File.createTempFile("origin","file"), 11, 0, "10" },					// 4
	        	{File.createTempFile("origin","file"), Integer.MAX_VALUE, 0, "10" },	// 5
	        	// {null, 10, 0, null},													// Error because new file is null
	        	{new File("/tmp/file"), 10, 0, "false" },								// 6
	        	{File.createTempFile("origin","file"), 10, 1, "IOException" },			// 7: Mocking delete method
	        	
	        	{File.createTempFile("origin","file"), 10, 2, "10" },			// 8: change origin path
	        });
	    }
		
		public MoveToNewLocationTest(File newFile, long size, int mocking, String expectedResult) throws IOException {
				configure(newFile, size, mocking, expectedResult);
		}
		
		public void configure(File newFile, long size, int mocking, String expectedResult) throws IOException {
			File oldFile = new File("/tmp/file");
			try {
				fi = new FileInfo(oldFile, masterKey, 1);
				
				// fill the FileInfo with 10 characters
				ByteBuffer content = ByteBuffer.wrap("abcdefghil".getBytes());
				ByteBuffer[] array = new ByteBuffer[1];
				array[0] = content;
				fi.write(array, 0);
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
			this.newFile = newFile;
			this.size = size;
			this.expectedResult = expectedResult;
			
			// Mocking
			spyFi = Mockito.spy(fi);
			switch(mocking) {
				case 0:
					break;
				case 1:
					// mock delete method: always return false.
					doReturn(false).when(spyFi).delete();
					break;
				case 2:
					spyFi.moveToNewLocation(File.createTempFile("otherOrigin","file"), size);
			}
		}
		
		@Test(timeout=1000)
		public void moveToNewLocationTest() {
			boolean flag = false;
			try {
				spyFi.moveToNewLocation(newFile, size);
				if("true" == String.valueOf(spyFi.isSameFile(newFile)) && Long.toString(spyFi.size()).equals(expectedResult)) flag = true;
				if(expectedResult.equals("false")) flag = true;
				if(masterKey.length != spyFi.getMasterKey().length) flag = false;
				Assert.assertTrue(flag);
			} catch (Exception e) {
				Assert.assertTrue(e.getClass().toString().contains(expectedResult));
			}
		}
	}	
	
	/**
	 * The tested method is ReadAbsolute, but since that ReadAbsolute is private, it is used
	 * read as entrypoint
	 * *
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
	        	{ ByteBuffer.wrap("abcde".getBytes()), ByteBuffer.allocate(5), -1, true, false, "5" },						// 0
	        	{ ByteBuffer.wrap("abcde".getBytes()), ByteBuffer.allocate(5), 0, true, false, "5" },						// 1
	        	{ ByteBuffer.wrap("abcde".getBytes()), ByteBuffer.allocate(5), 4, true, false, "1" },						// 2
	        	{ ByteBuffer.wrap("abcde".getBytes()), ByteBuffer.allocate(5), 5, true, false, "0" },						// 3
	        	{ ByteBuffer.wrap("abcde".getBytes()), ByteBuffer.allocate(0), 0, true, false, "0" },						// 4
	        	{ ByteBuffer.wrap("abcde".getBytes()), null, 0, true, false, "NullPointerException" },						// 5 Exception: No bb buffer
	        	{ ByteBuffer.wrap("abcde".getBytes()), ByteBuffer.allocate(5), 4, false, false, "Short read" },				// 6 Short Read
	        	{ null, ByteBuffer.allocate(5), 0, true, false, "0" },														// 7 null fileChannel
	        	{ ByteBuffer.wrap("abcde".getBytes()), ByteBuffer.allocate(5), 0, true, true, "FileInfoDeletedException" },	// 8 FileChannel deleted
	        	
	        	
	        	{ ByteBuffer.wrap("abcde".getBytes()), ByteBuffer.allocate(6), 0, true, false, "5" },						// 1
	        	{ ByteBuffer.wrap("abc".getBytes()), ByteBuffer.allocate(6), 0, true, false, "3" },						// 1

	        	
	        });
	    }
		
		public ReadAbsoluteTest(ByteBuffer content, ByteBuffer bb, long start, boolean bestEffort, boolean deleted, String expectedResult) {
			configure(content, bb, start, bestEffort, deleted, expectedResult);
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
		
		public void configure(ByteBuffer content, ByteBuffer bb, long start, boolean bestEffort, boolean deleted, String expectedResult) {
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
			
			if(deleted) {
				fi.delete();
			}
		}
		
		@Test(timeout=1000)
		public void readAbsoluteTest() {
			try {
				Assert.assertEquals(expectedResult, Integer.toString(fi.read(bb, start, bestEffort)));
			} catch (FileInfoDeletedException e) {
				Assert.assertTrue(e.getClass().toString().contains(expectedResult));
			} catch (NullPointerException e) {
				Assert.assertTrue(e.getClass().toString().contains(expectedResult));
			} catch (IOException e) {
				Assert.assertTrue(e.getMessage().startsWith(expectedResult));
			} catch (IllegalArgumentException e) {
				Assert.assertEquals(expectedResult, e.getMessage());
			} 
		} 
	}
	
}