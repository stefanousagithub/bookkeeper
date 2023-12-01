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
		
		static  private int  count = 0;
		
		@Parameters
		public static Collection<Object[]> data() {
	        return Arrays.asList(new Object[][] {
//	            {10, -1, 0}, 	// error because src null
//	            { 0, 1, 0},   	// infinite loop
 	            { 1, 0, 0},   	
	            { 1, 1, 0},
	            { 1, 2, 0},
	            { 10, 0, 0},	
	            { 10, 9, 0},
	            { 10, 10, 0},
	            { 10, 11, 0},
	            { 20, 10, 9},
	            { 20, 10, 10},
	            { 20, 10, 11},
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
			System.out.println(count);
			count++;
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
	        System.out.println("randomArray: " + Arrays.toString(Arrays.copyOfRange(randomArray, 0, randomArray.length)));	        
	        bytesWB = new byte[lenWB];
	        bc.writeBuffer.getBytes(0,bytesWB);
	        bytesTemp = Arrays.copyOfRange(randomArray, randomArray.length - lenWB, randomArray.length);
	        Assert.assertEquals(Arrays.toString(bytesTemp),Arrays.toString(bytesWB));
	        System.out.println("temp: " +  Arrays.toString(bytesTemp) + ", wb: " + Arrays.toString(bytesWB));

			// Verify content in File Channel
	        buff  = ByteBuffer.allocate(lenFC);
	        fc.position(0);
	        fc.read(buff);
	        bytesFC = buff.array();
	        bytesTemp = Arrays.copyOfRange(randomArray, 0, lenFC);
	        System.out.println("temp: " +  Arrays.toString(bytesTemp) + ", fc: " + Arrays.toString(bytesFC));
	        System.out.println("");
		}
		
		
	    @After
	    public void clear() throws IOException {
            this.bc.clear();
            this.bc.close();
	        this.fc.close();
	    }

	}
}