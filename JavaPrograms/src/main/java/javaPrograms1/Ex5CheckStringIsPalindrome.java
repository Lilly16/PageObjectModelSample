package javaPrograms1;

import java.util.Scanner;

public class Ex5CheckStringIsPalindrome {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a string");
		String st=s.next();
		
		String org_string=st;
		String rev=" ";
		
		for(int i=0;i<st.length();i++) {
			rev=st.charAt(i)+rev;
		}
        System.out.println("The reverse of the string is "+rev);
        
        if(org_string.equals(rev)) {
        	System.out.println("The given string is a palindrome ");
        }
        else {
        	System.out.println("The given string is not a palindrome ");

        }
	}

}
