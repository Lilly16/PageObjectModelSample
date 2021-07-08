package javaPrograms1;

import java.util.Scanner;

public class Ex9LargestOfThreeNumbers {

	public static void main(String[] args) {
		
// First Method:
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter first number");
		int a=sc.nextInt();
		
		System.out.println("Enter second number");
		int b=sc.nextInt();
		
		System.out.println("Enter third number");
		int c=sc.nextInt();
		
		/*if(a>b && a>c) {
			System.out.println("The largest number is "+a);
		} 
		else if(b>a && b>c){
			System.out.println("The largest number is "+b);	
		}
		else {
			System.out.println("The largest number is "+c);
		}  */
		
// second method: Using TERNARY OPERATOR;
		
		//int large1= a>b?a:b; 
/*In "a>b" suppose "a" is largest then a:b will give "a" is the largest number. otherwise in "a>b", "b" is largest 
then "a:b" will give "b" is the largest number.*/
		
		//int large2= c>large1?c:large1;
/* In "c>large1" suppose "c" is largest "c:large1" will give "c" is the largest number.
otherwise in "c>large1", "large1" is largest then"c:large1" will give "large1" is the 
largest number. */
		
		//combainning above two you can write like this ie)
		
		int large= c>(a>b?a:b)?c:(a>b?a:b);
		
		System.out.println("The largest of three number is "+large);
	}

}
