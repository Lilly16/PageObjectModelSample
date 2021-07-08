package reex1TestingProgramsUsingRecursion;

public class Ex7ConvertDecimalToBinaryRecursion {

	public static void main(String[] args) {
		
		int num=9;
		
		long binary=convertDecimalToBinary(num);
		
		System.out.println(binary);
		
	}
	static long convertDecimalToBinary(int num) {
		
		long decimal=0;
		int remainder=0; int i=1;
		
		while(num!=0) {
			
			remainder=num%2;
			num=num/2;
			decimal += remainder * i;
			i= i*10;
		} return decimal;
	}
	
}
