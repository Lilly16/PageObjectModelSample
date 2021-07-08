package test8FileReading;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UsingBufferedToReadingfiles {
	
	public static void main(String args[]) throws IOException {
		
		String location="UsingBufferWriter.txt";
		
		FileReader file=new FileReader(location);
		BufferedReader reader= new BufferedReader(file);
		
		//if you have single line we can use below code
		//Sting content=reader.readLine();
		//System.out.println(content);
		
		String content;
		while( (content=reader.readLine())!=null) {
			System.out.println(content);
		}
	}

}
