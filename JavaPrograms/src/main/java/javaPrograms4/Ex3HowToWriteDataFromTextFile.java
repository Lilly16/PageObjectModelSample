package javaPrograms4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex3HowToWriteDataFromTextFile {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw=new FileWriter("/Users/arockiasamyjebamalai/Downloads/filewriterex.txt");
		
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("I am Lilly. ");
		bw.write("I believe in only Jesus. ");
		bw.write("Jesus will bless and save my family. ");
		System.out.println("finished!!!!");
		
		bw.close();
	}

}
