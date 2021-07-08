package javaPrograms3;

import java.util.Scanner;

public class Ex9CountNumberOfWordsInAString {

	public static void main(String[] args) {
		
// Approach 1:
		
		/*System.out.println("Enter some lines");
		Scanner s= new Scanner(System.in);
		String st=s.nextLine();*/
		
		String s="Jesus I am Learning Java Bless me";
		int count=1;
		for(int i=0;i<s.length();i++) {
			
			if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' ')) {
				
				count++;
			}
			
		}
		
		System.out.println("Number of words in a string is: "+count); 
		
// Approach 2:
		
		String s1="Welcome to java tutorials";
		String [] s2=s1.split(" ");
		
		System.out.println("Number of words in a string is: "+ s2.length);
		
	}

}
