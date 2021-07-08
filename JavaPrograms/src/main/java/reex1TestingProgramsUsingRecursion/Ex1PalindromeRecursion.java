package reex1TestingProgramsUsingRecursion;

import java.util.Scanner;

public class Ex1PalindromeRecursion {

	public static void main(String[] args) {
		
		System.out.println("Enter the string: ");
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		String s1=palindrome(s);
		
		if(s.equals(s1)) {
			
			System.out.println("The given string is palindrome");
		}
		else {
			
			System.out.println("The given string is not palindrome");
		}
		
		

	}
	
	static String palindrome(String s) {
		
		String rev="";
		
		for(int i=s.length()-1; i>=0; i--) {
			
			rev=rev+s.charAt(i);
		}
		System.out.println("The reverse of the string is: "+rev);
		return rev;
	}

}
