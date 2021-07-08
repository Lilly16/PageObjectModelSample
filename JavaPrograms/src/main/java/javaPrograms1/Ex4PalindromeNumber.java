package javaPrograms1;

import java.util.Scanner;

public class Ex4PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=s.nextInt(); 		// 12421
		int rev=0;
		int ori_num=num;
		
		while(num!=0) {
			rev=rev*10+num%10;	// 1 12 124 1242 12421
			num=num/10;			// 1242 124 12 1
		}
		System.out.println("The reverse of the number is: "+rev);
		
		if(ori_num==rev) {
			System.out.println("The given number is palindrome");
		}else {
			System.out.println("The given number is not palindrome");
		}
	}

}
