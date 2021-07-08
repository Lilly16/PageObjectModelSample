package javaPrograms2;

public class Ex4FactorialOfANumber {

	public static void main(String[] args) {
		
	// 5!=5 * 4 * 3 * 2 * 1 =120 or 5!= 1 * 2 * 3 * 4 * 5 = 120
		
		int num=5;
		int fact=1;
		
		for(int i=num; i>=1; i--) {
			
			fact = fact *i;
		}
		System.out.println("factorial of "+ num + " is "+ fact);
		
// 5!= 1 * 2 * 3 * 4 * 5 = 120
		
		int num1=5;
		int fact1=1;
		
		for(int i=2; i<=num; i++) {
			 fact1 = fact1 * i;
		}
		System.out.println("factorial of "+ num + " is "+ fact1);
		
// Using "While loop":
		
		int a=5; int fact2=1;
		
		while(a!=0) {
			
			fact2=fact2 *a;
			a--;
		}
		System.out.println(fact2+" = fact2");
	}

}
