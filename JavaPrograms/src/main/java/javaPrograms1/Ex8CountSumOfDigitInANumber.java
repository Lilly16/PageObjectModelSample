package javaPrograms1;

public class Ex8CountSumOfDigitInANumber {

	public static void main(String[] args) {
		
		int num=12345;
		int sum_of_digits=0;
		int count=0;
		
		while(num>0) {				//1234	123		12		1		condifalse exitloop
			
			count=num%10;			//4		3		2		1
			sum_of_digits +=count;	//0+4=4	4+3=7	7+2=9	9+1=10	
			num=num/10;				//123	12		1		0
		}
		System.out.println("Sum of digits in a number is= "+sum_of_digits);
	}

}
