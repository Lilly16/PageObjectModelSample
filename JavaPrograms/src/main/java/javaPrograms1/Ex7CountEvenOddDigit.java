package javaPrograms1;

public class Ex7CountEvenOddDigit {

	public static void main(String[] args) {
		
		int num=123;
		int even_count=0;
		int odd_count=0;
		int count=0;
		
		while(num>0) {
			
			count=num%10;
			num=num/10;
	
			if(count%2==0){
				even_count++;
			}
			else {
				odd_count++;
			}
	}
		System.out.println("the even count is "+even_count);
		
		System.out.println("the odd count is "+odd_count);	
	}
}


