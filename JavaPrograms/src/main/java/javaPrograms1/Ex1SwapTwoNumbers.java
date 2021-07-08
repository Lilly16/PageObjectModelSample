package javaPrograms1;
/* 1.prime no 2. fibonacci series, 3. both array are equal4. aabbcc-> abc*/

public class Ex1SwapTwoNumbers {

	public static void main(String[] args) {
		
//1. using third variable
		
		int a=4; int b=5; int t;
		
		 System.out.println("Before swapping the value of a is "+a);
		 System.out.println("Before swapping the value of b is "+b);

		 t=a;
		 a=b;
		 b=t;
		 System.out.println("The value of a is "+a);
		 System.out.println("The value of a is "+b);

// 2. using + and - operators:
		 
		 int x=6; int y=7;
		 
		 System.out.println("Before swapping the value of a is "+x);
		 System.out.println("Before swapping the value of b is "+y);
		 
		 x=x+y;		//x=6+7=13
		 y=x-y;		//y=13-7=6
		 x=x-y;		//x=13-6=7
		 
		 System.out.println("The value of a is "+x);
		 System.out.println("The value of a is "+y);
		 
// 3. using * and / operators but both numbers must not be zero:
		 
		 int p=2; int q=4;
		 
		 System.out.println("Before swapping the value of a is "+p);
		 System.out.println("Before swapping the value of b is "+q); 
		 
		 p=p*q;		//p*q=8
		 q=p/q;		//8/4=2
		 p=p/q;		//8//4=2
		 
		 System.out.println("The value of a is "+p);
		 System.out.println("The value of a is "+q);
		 
// using NOR operator:
		 
		 int d=3; int f=4;
		 
		 System.out.println("Before swapping the value of a is "+d);
		 System.out.println("Before swapping the value of b is "+f); 
		 
		 d=d^f;
		 f=d^f;
		 d=d^f;
		 
		 System.out.println("The value of a is "+d);
		 System.out.println("The value of a is "+f);
		 
	}

}
