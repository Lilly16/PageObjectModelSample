package javaPrograms2;

/* Natural number >1
which has only two factors 1 and itself.
Ex1: 19 factors are 1 and 19 => 19 is a prime number.
Ex2: 28 the factors of 28 are 1,2,4,7,14,28 => 28 is not a prime number.*/

public class Ex1PrimeNumber {

	public static void main(String[] args) {
		
		int num=10;
		int count=0;
		
		if(num>1) {
			
			for(int i=2;i<=num;i++) {
				if(num%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(num +" is a prime number");
			}else {
				System.out.println(num +" is not a prime number");

			}
			
		}else {
			System.out.println(num +"is a prime number");
		}
		
// 2nd solution:
		int num1=8;
		int res=findPrimeNumber( num1);
		if(res>2)
			System.out.println("given number is not a prime number");
		else
			System.out.println("given number is a prime number");


	}
static int findPrimeNumber(int num1) {
	int count=0;
	if(num1==0 || num1==1)
		return 0;
	if(num1>1) {
		for(int i=1;i<=num1/2;i++) {
			if(num1%i==0)
				count++;
		}
	}
	return count;
}
}
