package test7FileWritingOperations;

import java.io.FileWriter;
import java.io.IOException;

import com.google.common.io.Files;

public class UsingFileWriter {

	public static void main(String[] args) throws IOException {
	
		//1. file location 2. content
// straight forward,direct intraction with files,less performance
//you can see results in "test-output" folder ->UsingFileWriter.txt
//1.file writer has direct contact with Files
//2.it's kind of costliest one.
//3.it will give less performance when we write more lines in "content".
		
		String location = "UsingFileWriter.txt";
		String content = "learning java is very easy!!";
		
		FileWriter filewriter = new FileWriter(location);
		filewriter.write(content);
		filewriter.close();
		
		
		
	}

}
