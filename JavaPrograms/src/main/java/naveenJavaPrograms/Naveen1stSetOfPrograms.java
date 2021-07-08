package naveenJavaPrograms;

import java.util.Scanner;

public class Naveen1stSetOfPrograms {

	public static void main(String[] args) {
		
		
//1. Print an Integer entered by the user :
				System.out.println("Please enter an Integer: ");
				Scanner sc=new Scanner(System.in);
				int s=sc.nextInt();
				System.out.println("The given integer is: "+s);
				System.out.println("pro1 ending.....................................");
				
//2. Java Program to add to integer:
				
				int x=10; int y=80; int z;
				z=x+y;
				System.out.println("the addition of two integers are: "+z);
				System.out.println("pro2 ending.....................................");
//3. Multiply two floating numbers: 
				
				float f1=4.5f; float f2= 5.7f;
				System.out.println("the multiplication of two given floating numbers are: "+(f1*f2));
				System.out.println("pro3 ending.....................................");

//4. Find ASCII value of the character: 
				
				char c='$'; //you can give 'a','A','0''$' etc.......
				int ascii=c; /* first way to find is: store your character into an integer is 
				one way to find ascii value. */
				
				int ascii_num=(int)c;/* the second way is: convert your character into an 
				integer then store it in an integer.*/
				
				System.out.println(ascii);
				System.out.println(ascii_num);
				System.out.println("pro4 ending.....................................");
				
//5. find Quotient and reminder:
				
				int a=30; int b=6;
				int quotient=a/b;
				int reminder=a%b;
				System.out.println("The quotien of a/b is: "+quotient);
				System.out.println("The reminder of a/b is: "+reminder);
				System.out.println("pro5 ending.....................................");
				
//6. Swap two numbers:
				int x1=20; int y1=40;
				int z1;
				
				System.out.println("before swapping x1= :"+x1);
				System.out.println("before swapping y1= :"+y1);
				z1=x1;
				x1=y1;
				y1=z1;
				
				System.out.println("after swapping x1= :"+x1);
				System.out.println("after swapping y1= :"+y1);
				System.out.println("pro6 ending.....................................");
				
				int a1=4; int b1=5;
				
				a1=a1+b1; //9		//a1=a1*b1; 20		// a1=a1^b1;
				b1=a1-b1;//4		//b1=a1/b1; 4 		// b1=a1^b1;
				a1=a1-b1;//5		//a1=a1/b1; 5		// a1=a1^b1;
				
// 7. given Number is even or odd: 
				
				int i=7;
				
				if(i%2==0) {
					System.out.println("the given number is even.");
				}
				else {
					System.out.println("the given number is not even.");
				}
				System.out.println("pro7 ending.....................................");
				
// 8. check the Alphabet is vowels or consonant: vowels are a,e,i,o,u
				
	// Using if statement
				
				char c1= 'z';
				
				if(c1=='a'|| c1=='e'||c1=='i'||c1=='o'||c1=='u') {
					
					System.out.println("The given character is the vowel ");
				}else {
					
					System.out.println("The given character is not the vowel ");
				}
				
	// Using "Switch" cases:
				
				char ch='b';
				
				switch(ch) {
				
				case 'a':	
				case 'e':	
				case 'i':
				case 'o':
				case 'u':
					System.out.println("this is an vowel");
					break;
					
				default:
					System.out.println("this is not an vowel");
				}
				System.out.println("pro8 ending.....................................");
				
// 9. Find largest among these numbers:
				
				int j=10; int k=40; int l=35;
				
				if(j>=k && j>=l) {
					
					System.out.println("j is the largest among three numbers ");
					
				} else if(k>=j && k>=l) {
					
					System.out.println("k is the largest among three numbers ");
				}else {
					
					System.out.println("l is the largest among three numbers ");
				}
				
	// Using only if and else condition:
				
				int j1=400; int k1=600; int l1=700;
				
				if(j1>=k1) {
					
					if(j1>=l1) {
						
						System.out.println("j1 is the largest number");
					} else {
						
						System.out.println("l1 is the largest number");
					}
				} else {
					
					if(k1>=l1) {
						
						System.out.println("k1 is the largest number");
					}
					else {
						
						System.out.println("l1 is the largest number");
					}
				}
				System.out.println("pro9 ending.....................................");
				
// 10.Finding Leap year:
				
				/* Leap Year is:
				 * 1. divisible by 4 for all the century years....ie) ending with 00
				 * 2. the century leap is completely divisible by 400
				 * 3. but 1900 is not leap year. because it's not divisible by 400
				 * 4. but 2012 is leap year because it's completely divisible by 4  */
				
				int year=2012;
				boolean flag =false;
				
				if(year%4==0) {
					
					if(year%100==0) {
						
						if(year%400==0) {
							
							flag=true;
						}else {
							flag=false;
						}	
					}else {
						
						flag=true;
					}
				}else {
					
					flag=false;
				}
				
				if(flag) {
					
					System.out.println(year+" is a leap year");
				}else {
					
					System.out.println(year+" is not a leap year");
				}
				System.out.println("pro10 ending.....................................");

	}

}
