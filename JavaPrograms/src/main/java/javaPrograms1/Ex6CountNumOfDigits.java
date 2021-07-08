package javaPrograms1;

public class Ex6CountNumOfDigits {

	public static void main(String[] args) {
		
		int num=123456;
		int count=0;
		
		while(num>0) {
			
			num=num/10;		// 12345	1234	123	12	1	0	condifalse
			count++;		// 1		2		3	4	5	6	exitloop
		}
		System.out.println("The number of digits in the given number is "+count);
	}

}
