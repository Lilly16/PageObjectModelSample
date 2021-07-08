package javaPrograms4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ex2HowToReadDataFromTextFile {

	public static void main(String[] args) throws IOException {
		
// Approach 1: Using FileReader and Buffered Reader:
		
		FileReader fr=new FileReader("/Users/arockiasamyjebamalai/Downloads/lilly.text");
		
		BufferedReader br=new BufferedReader(fr);
		
		String str;
		
		while((str=br.readLine())!=null) {
			
			System.out.println(str);
		}
		
		br.close(); 
		System.out.println("---------------------------------------");
		
// Approach 2: Using File and scanner class:
		
		File f=new File("/Users/arockiasamyjebamalai/Downloads/lilly.text");
		Scanner s= new Scanner(f);
		
		// Loop statement
		while(s.hasNextLine()) {
			
			System.out.println(s.nextLine());
		}
		
		s.close();
		//System.out.println("---------------------------------------");
		
// Approach 3:Using useDelimiter:
		
		File f1=new File("/Users/arockiasamyjebamalai/Downloads/sometext.txt");
		Scanner sc=new Scanner(f1);
		sc.useDelimiter("\\z");
		System.out.println(sc.next());
		sc.close();
	}
	
}
