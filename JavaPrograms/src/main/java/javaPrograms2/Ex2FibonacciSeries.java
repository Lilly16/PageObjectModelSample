package javaPrograms2;

import java.util.Scanner;

public class Ex2FibonacciSeries {

	public static void main(String[] args) {
		
		// 0 1 1 2 3 5 8 13 21 34 .......
		
// Approach 1:
				int n1=0;
				int n2=1;
				int sum=0;
				
				System.out.print(n1+","+n2);	//n1=0,n2=1	
				
				for(int i=0; i<10; i++) {		//i=0			i=1			i=2			i=3
					
					sum=n1+n2;					// sum=0+1=1	sum=1+1=2	sum=1+2=3	sum=2+3=5
					n1=n2;						// n1=1			n1=1		n1=2		n1=3	
					n2=sum;						// n2=1			n2=2		n2=3		n2=5
					System.out.print(","+ sum);	// 1			2			3			5
				}
				System.out.println("\n");
				
//Approach 2:
				System.out.println("Enter a fibo Number");
				Scanner sc=new Scanner(System.in);
				int num1=sc.nextInt();
				int nu1=1;
				int nu2=0;
				int sum1=0;
				if(num1>=0) {
					for(int i=0;i<=num1;i++) {
						sum1=nu1+nu2;
						nu1=nu2;
						nu2=sum1;
						System.out.print(nu1+",");
					}
				}
				
					
// Approach 3:				
				
				System.out.println("Enter the number you want to give:");
				
				Scanner sc1=new Scanner(System.in);
				int s=sc1.nextInt();
				
				fibonacci(s);
				
				
				}
	
				
				static void fibonacci(int num) {
					
					int first_num=1;	/*Here note we're assigning first_num=1,and 
					                      secon_num=0  then only we can get the answer like 
					                      0,1,1,2,3,5,8,13,21 */
					int secon_num=0;
					int third_num=0;
					int count=1;
					
					while(count<=num) {
					
						System.out.print(third_num+",");
						third_num=first_num + secon_num;
						first_num=secon_num;
						secon_num=third_num;
						count++;
					}
					
				}
				
				
	}

	


