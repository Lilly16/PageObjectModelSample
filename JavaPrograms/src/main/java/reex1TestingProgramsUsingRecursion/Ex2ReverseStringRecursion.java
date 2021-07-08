package reex1TestingProgramsUsingRecursion;

import java.util.Scanner;

public class Ex2ReverseStringRecursion {

	public static void main(String[] args) {
		
		System.out.println("Enter a string: ");
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		//calling method 1
		Ex2ReverseStringRecursion rs=new Ex2ReverseStringRecursion();
		String st=rs.reverseString(s);
		System.out.println("The reverse of the given string is like: "+ st);
		System.out.println("--------------------------");
		
		//calling method 2
		
		String s1="asdfgh ghj jkl";
		String st1=reverse(s1);
		System.out.println("The reverse of the given string is: "+ st1);

	}
// Method 1:	
	String reverseString(String s) {
		String rev="";
		for(int i=s.length()-1; i>=0; i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		return rev;
	}
	
// Method 2:
	static String reverse(String s1) {
		String[] s2=s1.split(" ");
		String rev1="";
		for(String temp: s2) {
			StringBuilder sb=new StringBuilder(temp);
			rev1=rev1+sb.reverse()+" ";
		}
		System.out.println(rev1);
		return rev1;	
	}
	
}
