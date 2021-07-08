package reex2TestingProgramUsingRecursion;

public class Ex3ANumberexpressedSumOfTwoPrimeNumRecursion {

	public static void main(String[] args) {
		
		int num=34;
		
		boolean boo=checkIsPrime(num);
		
		//1. checking given Number is prime or not.
		if(boo) {			
			 
			System.out.println("Is a prime Number");
		}
		else {
			System.out.println("Is not a prime Number");
		}
		
		//2. checking given number can be expressed as sum of two prime numbers:
		
		boo=true;
		
		for(int i=2; i<=num/2; i++) {
		
		if(checkIsPrime(i)){
			
			if(checkIsPrime(num-i)) {
				
				System.out.println(num + "="+ i + "+"+ (num-i));
				boo= false;
			}
		}
		
		}
		
	}
	
	public static boolean checkIsPrime(int num) {
		
		boolean flag=true;
		
		for(int i=2;i<=num/2; i++) {
			
			if(num % i==0) {
				
				flag=false;
				break;
				
			}
		} return flag;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
