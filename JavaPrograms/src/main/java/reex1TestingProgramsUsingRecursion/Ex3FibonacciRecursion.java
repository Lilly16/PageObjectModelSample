package reex1TestingProgramsUsingRecursion;

import java.util.Scanner;

public class Ex3FibonacciRecursion {

	public static void main(String[] args) {
		
		System.out.println("Enater a number: ");
		System.out.println("Enater a second number: ");
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int s1=sc.nextInt();
		
		fibonacci(s);
		fibonacci1(s1);
		

	}
	
// 1st solution:
	
		static void fibonacci(int num) {
			
			int a=0; int b=1;
			int z=0;
			System.out.print(a+",");
			System.out.print(b+",");
			
			for(int i=1; i<=num; i++) {
				
				z=a+b;
				a=b;
				b=z;
				System.out.print(z+",");
			}
			System.out.println();
			}
		
//  2nd solution:
			
			static void fibonacci1(int num) {
				
				int t1=0,t2=1;
				for(int i=1;i<=num;i++) {
				System.out.print(t1+" ");
				int sum=t1+t2;
				t1=t2;
				t2=sum;
				}
				
			}
		}

