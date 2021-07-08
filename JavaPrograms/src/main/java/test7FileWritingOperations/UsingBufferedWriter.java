package test7FileWritingOperations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class UsingBufferedWriter {

	public static void main(String[] args) throws IOException {
//Easiest way, performance wise better and widely used.
		// 1.If we want to improve the performance we can use the
//		the buffered Writer.
//		2.write all contents and stored in bufferedwriter then use
//		that buffered to store in file.
		String location = "UsingBufferWriter.txt";
		String content = "I am using buffered writer.";
		
		FileWriter filewriter = new FileWriter(location);
		BufferedWriter bufferedwriter = new BufferedWriter
											(filewriter);
		bufferedwriter.write(content);
		bufferedwriter.close();
		
		
	}

}
