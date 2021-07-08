package reex1TestingProgramsUsingRecursion;

public class Ex5FactorialUsingRecursion {

	public static void main(String[] args) {
	
		int nu=5;
		int total=findFactorial(nu);
		System.out.println("Factorial of given number is: "+total);
		
		System.out.println(findFact(5));
		System.out.println(findFact(10));
		System.out.println(findFact(0));
	
	}
	
	public static int findFactorial(int nu) {
		
		if(nu>=1) {
			
			return nu * findFactorial(nu-1);
		}
		
		else {
			return 1;
		}
	}
	
	// Using "while loop" in recursion method:
	
	public static int findFact(int num) {
		
		int fact=1;
		
		while(num!=0) {
			
			fact =fact *num;
			num --;
		}return fact;
	}

	}
	
	
	
	


