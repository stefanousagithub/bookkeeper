package org.apache.bookkeeper.bookie;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.Unpooled;
import io.netty.buffer.UnpooledByteBufAllocator;

@RunWith(Enclosed.class)
public class BufferedChannelTest {
	
	@RunWith(Parameterized.class)
	public static class WriteTest {
		// BufferChannel parameters
		private BufferedChannel bc;
		private long unpersistedBytesBound;
		private int writeCapacity;
		
		// Method parameters and outputs
		private ByteBuf src;
		
		// Test support parameters
		private int len;
		private FileChannel fc;
		private byte[] randomArray;
				
		@Parameters
		public static Collection<Object[]> data() {
	        return Arrays.asList(new Object[][] {
//	            {10, -1, 0}, 	// 0 error because src null
//	            { 0, 1, 0},   	// 1 infinite loop
 	            { 1, 0, 0},   	// 2
	            { 1, 1, 0},		// 3
	            { 1, 2, 0},		// 4
	            { 10, 0, 0},	// 5
	            { 10, 9, 0},	// 6
	            { 10, 10, 0},	// 7
	            { 10, 11, 0},	// 8
	            { 20, 10, 9},	// 9
	            { 20, 10, 10},	// 10
	            { 20, 10, 11},	// 11
	            
	            { 10, 0, 1}, 	// 12 Added for Ba-dua analysis
	        });
	    }
		
		public WriteTest(int capacity, int len, int unpersistedBytesBound) {
			configure(capacity, len, unpersistedBytesBound);
		}
		
		public void configure(int capacity, int len, int unpersistedBytesBound) {
			this.writeCapacity = capacity;
			this.len = len;
			this.unpersistedBytesBound = unpersistedBytesBound;
			
			// Define src ByteBuff
			if(len < 0) {
				this.src = null;
				this.len = 0;
			}
			else if (len == 0) {
				this.randomArray = new byte[len];			
				this.src = Unpooled.EMPTY_BUFFER;
			}
			else {
		        this.randomArray = new byte[len];
		        Random random = new Random();
		        random.nextBytes(randomArray);
		        this.src = Unpooled.buffer();
		        this.src.writeBytes(randomArray);				
			}
			
			// Define BufferChannel
			File testLogFile;
			try {
				testLogFile = File.createTempFile("test", "t");
				testLogFile.deleteOnExit();
		        RandomAccessFile randomAccessFile = new RandomAccessFile(testLogFile, "rw");
		        fc = randomAccessFile.getChannel();
				this.bc = new BufferedChannel(UnpooledByteBufAllocator.DEFAULT, fc, capacity, this.unpersistedBytesBound);
				bc.readBuffer.markReaderIndex();
				bc.writeBuffer.markWriterIndex();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		@Test(timeout=1000)
		public void writeTest() throws IOException {
			int flushes=0;
			int lenWB=0;
			int lenFC=0;
			byte[] bytesWB;
			byte[] bytesFC;
			byte[] bytesTemp;
			ByteBuffer buff;
			
			// Write operation
			try{
				bc.write(src);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			// Calculate dimensions
			// Exceed capacity
			if(len>=writeCapacity) {
				flushes = len/writeCapacity;
				lenFC = flushes*writeCapacity;
				lenWB= len-lenFC;
			}
			else lenWB = len;
			
			// Exceed unpersistedBytesBound
			if(lenWB >= unpersistedBytesBound && unpersistedBytesBound > 0) {
				lenFC += lenWB;
				lenWB = 0;
			}
			
			// Verify content in Write Buffer
	        bytesWB = new byte[lenWB];
	        bc.writeBuffer.getBytes(0,bytesWB);
	        bytesTemp = Arrays.copyOfRange(randomArray, randomArray.length - lenWB, randomArray.length);
	        Assert.assertEquals(Arrays.toString(bytesTemp),Arrays.toString(bytesWB));

			// Verify content in File Channel
	        buff  = ByteBuffer.allocate(lenFC);
	        fc.position(0);
	        fc.read(buff);
	        bytesFC = buff.array();
	        bytesTemp = Arrays.copyOfRange(randomArray, 0, lenFC);
	        Assert.assertEquals(Arrays.toString(bytesTemp),Arrays.toString(bytesFC));
		}
		
		
	    @After
	    public void clear() throws IOException {
            this.bc.clear();
            this.bc.close();
	        this.fc.close();
	    }

	}
	
	
	@RunWith(Parameterized.class)
	public static class ReadTest {
		// BufferChannel parameters
		private ByteBuf buffDest;
		private int writeBufferStartPosition;
		private int pos;
		private int lenght;
		private String expectedOutput;
		
		// Test support parameters
		private ByteBuf temp;
		private FileChannel fc;
		private BufferedChannel bc;
		private int capacity = 10;       // default capacity to 10 (changable parameter)
		private byte[] randomArray;
				
		@Parameters
		public static Collection<Object[]> data() {
	        return Arrays.asList(new Object[][] {
	            {5, 5, 0, -1, "0"},       			// 0
	            {5, 5, 0, 0, "0"},					// 1
	            {5, 5, 0, 5, "5"},					// 2
	            {5, 5, 0, 6, "Read past EOF"},		// 3
	            {5, 5, -1, 5, "Negative position"},	// 4 IllegalArgumentException: Negative position
	            {5, 5, 4, 5, "Read past EOF"},		// 5
	            {5, 5, 5, 5, "Read past EOF"},		// 6
	            {5, 4, 0, 5, "Read past EOF"},		// 7
	            {5, 0, 0, 5, "Read past EOF"},		// 8
	            // {5, -1, 0, 5, "\"dest\" is null"},	// 9 NullPointerException: dest is null
	            {0, 5, 0, 5, "Read past EOF"},	   	// 10
	            {-1, 5, 0, 5, "Read past EOF"},		// 11
	            
	            {6, 5, 0, 5, "5"},					// 2

	        });
	    }
		
		public ReadTest(int writeBufferStartPosition, int dest, int pos, int lenght, String expectedOutput){
			configure(writeBufferStartPosition, dest, pos, lenght, expectedOutput);
		}
		
		public void configure(int writeBufferStartPosition, int dest, int pos, int lenght, String expectedOutput) {
			this.writeBufferStartPosition = writeBufferStartPosition;
			this.pos = pos;
			this.lenght = lenght;
			this.expectedOutput = expectedOutput;
			
			// initialize dest buffer
			if(dest < 0) this.buffDest = null;
			else if (dest == 0) this.buffDest = Unpooled.EMPTY_BUFFER;
			else this.buffDest = Unpooled.buffer(dest, dest);
			
			// Define BufferChannel
			File testLogFile;
			try {
				testLogFile = File.createTempFile("test", "t");
				testLogFile.deleteOnExit();
		        RandomAccessFile randomAccessFile = new RandomAccessFile(testLogFile, "rw");
		        fc = randomAccessFile.getChannel();
				this.bc = new BufferedChannel(UnpooledByteBufAllocator.DEFAULT, fc, capacity, 0);
				bc.readBuffer.markReaderIndex();
				bc.writeBuffer.markWriterIndex();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			// Write random characters inside WriteBuffer bc
			if(writeBufferStartPosition < 0) {
				this.temp = null;
				return;                     // don't write content because the bc is null		
			}
			else if (writeBufferStartPosition == 0) {
				this.randomArray = new byte[writeBufferStartPosition];			
				this.temp = Unpooled.EMPTY_BUFFER;
			}
			else {
		        this.randomArray = new byte[writeBufferStartPosition];
		        Random random = new Random();
		        random.nextBytes(randomArray);
		        this.temp = Unpooled.buffer();
		        this.temp.writeBytes(randomArray);				
			}
			
			try{
				bc.write(temp);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		@Test(timeout=1000)
		public void readTest() throws IOException {
			byte[] bytesTemp;
			byte[] bytesDest;			
			int ret = -1;
			
			// Read write buffer
			try {
				ret = bc.read(buffDest, pos, lenght);
			} catch (IOException e) {
				Assert.assertTrue(e.getMessage().startsWith(expectedOutput));
				return;
			} catch (IllegalArgumentException e) {
				Assert.assertTrue(e.getMessage().startsWith(expectedOutput));		
				return;
			} catch (NullPointerException e) {
				Assert.assertTrue(e.getMessage().contains(expectedOutput));	
				return;
			}
			// verify return value
	        Assert.assertEquals(ret, Integer.parseInt(expectedOutput));
	        System.out.println("ret: " +  ret + ", expectedRet: " + expectedOutput);

			// verify content is written correctly. This checks depends to the last check
	        bytesTemp = Arrays.copyOfRange(randomArray, pos, ret);
	        bytesDest = new byte[ret];
	        buffDest.getBytes(pos, bytesDest);
	        Assert.assertEquals(Arrays.toString(bytesTemp), Arrays.toString(bytesDest));
	        System.out.println("src: " +  Arrays.toString(bytesTemp) + ", dest: " + Arrays.toString(bytesDest));

		}
		
	    @After
	    public void clear() throws IOException {
            this.bc.clear();
            this.bc.close();
	        this.fc.close();
	    }

	}
}