package javaPrograms1;

import java.util.Scanner;

public class Ex2ReverseANumber {

	public static void main(String[] args) {
		
// First Method Using while loop:
		
		/*Scanner s= new Scanner(System.in);
		System.out.println("Enter the numbers");
		int num=s.nextInt();*/
		
		int num=1234;
		int rev=0;
		
		while(num!=0) {
			rev= rev*10 + num%10;
			num=num /10;
		}
		System.out.println("Reverse number is= "+ rev);
		
// Using StringBuffer Method:
		
		int num1=4567;
		StringBuffer sb= new StringBuffer(String.valueOf(num1));
		StringBuffer s1=sb.reverse();
		System.out.println("Reverse number is= "+ s1);
		
// Using StringBuilder Method:
		
		int num2=789;
		StringBuilder sbl=new StringBuilder();
		sbl.append(num2);
		StringBuilder rev1=sbl.reverse();
		System.out.println("Reverse number is= "+ rev1);
		
		
	}

}
