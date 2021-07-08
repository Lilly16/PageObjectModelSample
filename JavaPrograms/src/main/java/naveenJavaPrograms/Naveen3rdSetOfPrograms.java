package naveenJavaPrograms;

import java.util.Scanner;

public class Naveen3rdSetOfPrograms {

	public static void main(String[] args) {
		
		
// 1. Calculate Power of a number:
		
		int base=3;
		int exponent=4;
		int result=1;
		
		while(exponent!=0) {		//4!=0		3!=0		2!=0		1!=0		0=0 exit loop
			
			result=result*base;		//re=1*3=3	re=3*3=9	re=9*3=27	re=27*3=81
			exponent--;				//ex=3		ex=2		ex=1		ex=0
			
			 
		}
		System.out.println("The power of the given number is: "+result);
		
//2. Calculate the given Number is Palindrome or not:
		
		int num=12021; // num=2343200,0023432 ??????????,12021
		int rev=0;
		int actu_num=num;
		
		while(num!=0) {
			
			rev=rev *10 +num%10;
			num=num/10;
		}
		System.out.println("The reverse of given num is "+rev);
		
		if(actu_num==rev) {
			
			System.out.println(actu_num+" is a palindrome num");
		}else {
			
			System.out.println(actu_num+" is not a palindrome num");
		}
		
//3. Calculate given number is prime or not:
		
		int num1=8;
		int count=0;
		
		for(int i=1; i<=num1; i++) {
			
			if(num1%i==0) {
				
				count++;
			}
		}
			if(count>=2) {
				
				System.out.println(num1+ " is not a prime number");
			}else {
				
				System.out.println(num1+ " is a prime number");
			}
	// 2nd Solution:
			
			int num2=1;
			boolean flag=true;
						
			for(int i=2;i<=num2/2; i++) {
						
				if(num2%i==0) {
					
					flag= false;
					break;
				}
			}
			if(flag) {
				
				System.out.println(num2+" is a prime number");
			}else {
				
				System.out.println(num2+" is not a prime number");
			}
			
//4. Display Prime numbers between "two intervals":
			
			int low=20;
			int high=50;
			
			while(low<high) {
				
				boolean fl=true;
				
				for(int i=2;i<=low/2; i++) {
					
					if(low%i==0) {
						
						fl=false;
						break;
					}
				}
				if(fl) {
					System.out.print(low+ " ");
				}low++;
				
			}
			
//5. Check Armstrong Number:
			
			int t=150;
			int actual_num=t;
			double reminder=0;
			
			while(t!=0) {
				
				int n=t%10;
				//reminder=reminder+Math.pow(n,3 );
				reminder=reminder+(n*n*n); 
				t=t/10;
			}System.out.println("reminder"+reminder);
			
			if(actual_num==reminder) {
				
				System.out.println("The given number is an Armstrong number");
			}
			else {
				System.out.println("The given number is not an Armstrong number");
			}
			
// Display Armstrong numbers between two intervals:
			
			
			
			// not a right solution for this program.
			int low1 = 100;
	        int high1 = 440;
	        double result1 = 0;

	        while(low1<=high1){
	            int changednum=low;
	            while(changednum!=0) {
	                int n = changednum % 10;
	                result1 = result1 + Math.pow(n, 3);
	                changednum = changednum / 10;

	                if(result1==low1){
	                    System.out.println(result1);
	                    break;
	                }
	            }

	            low1++;
	            result1 =0;
	        }
	        
// Display factors of a number:
	        
	       // the factors of 10= 1,2,5,10.
	       // the factors of 60=1,2,4,5,6,10,12,15,20,30,60. 
	        
	        int number=60;
	        
	        for(int i=1;i<=number;i++) {
	        	
	        	if(number%i==0) {
	        		
	        		System.out.println(i);
	        	}
	        }
	        System.out.println("-----------------------------------");
	        
	  
// Make a simple calculator using "Switch cases":
	        
	        System.out.println("enter two Numbers:");
	        Scanner sc=new Scanner(System.in);
	        
	        double first= sc.nextDouble();
	        double second= sc.nextDouble();
	        
	        System.out.println("Enter the Operators like '+','-','*','/'");
	        char operator =sc.next().charAt(0);
	        
	        double result2=0;
	        
	        switch(operator) {
	        
	        case '+':
	        	result2=first+second;
	        	break;
	        case '-':
	        	result2=first-second;
	        	break;
	        case '*':
	        	result2=first*second;
	        	break;
	        case '/':
	        	result2=first/second;
	        	break;
	        default:
	        	System.out.println("Please enter the correct operator");
	        	break;
	        }
	        System.out.println(result2);
	        
	        
	        
	        
	        
	        
	        
	        
	        
	  
		
			

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
