package reex1TestingProgramsUsingRecursion;

public class Ex3ANumberExpressedAsSumOfTwoPrimeNumbersRecursion {

	public static void main(String[] args) {
		
//1. Check a number can be expressed as a sum of two "prime numbers:"
				// Ex: 34=3+31, 5+29, 11+23, 17+17
				// 11 can not be expressed as a sum of two prime numbers.
		
		int num=34;
		
		boolean flag=true;
		
		for(int i=2;i<=num/2; i++) {
			
			if(checkIsPrime(i)) {
				
				if(checkIsPrime(num-i)) {
					
					System.out.println(num+"="+i+"+"+(num-i));
					flag=false;
				}
			}
		}
		if(flag) {
			
			System.out.println("The number you gave can't be edxpressed as a num of two prime numbers");
		}
		
	}
	
	public static boolean checkIsPrime(int num) {
		
		boolean flag=true;
		
		for(int i=2;i<=num/2; i++) {
			
			if(num%i==0) {
				
				flag=false;
				break;
			}
		}return flag;
	}

}
