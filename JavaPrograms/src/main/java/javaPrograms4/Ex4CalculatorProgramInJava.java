package javaPrograms4;

import java.util.Scanner;

public class Ex4CalculatorProgramInJava {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int a=s.nextInt();
		
		System.out.println("Enter the second number");
		int b=s.nextInt();
		
		System.out.println("Enter the third number");
		char c=s.next().charAt(0);
		
		if(c=='+'|| c=='-'||c=='*'||c=='/') {
			
			int result=calculate(a,b,c);
			
			System.out.println("first no "+ c+"second no "+"="+result);
		}
		else {
			
			System.out.println(" Please provide the operator '+' or '-' or '*' or '/' ");
		}
		
		
		
			
		}
	
	static int calculate(int x,int y,char z) {
		
		int res=0;
		
		switch(z) {
		
		case '+':
			res=x+y;
			break;
			
		case '-':
			res=x-y;
			break;
			
		case '*':
			res=x*y;
			break;
			
		case '/':
			res=x/y;
			break;
	
	}
		return res;
		
		
	}
}


