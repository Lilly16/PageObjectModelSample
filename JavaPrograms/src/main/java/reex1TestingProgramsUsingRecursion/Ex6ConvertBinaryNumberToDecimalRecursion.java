package reex1TestingProgramsUsingRecursion;

public class Ex6ConvertBinaryNumberToDecimalRecursion {

	public static void main(String[] args) {
		
		long num= 100000111;
		
		int total=convertToDecimal(num);
		
		System.out.println(total);
	}
	
	static int convertToDecimal(long num) {
		
		int  decimal=0,i=0;
		long remainder=0;
		
		while(num!=0) {
			
			remainder=num%10;
			num=num/10;
			decimal +=remainder * Math.pow(2, i);
			i++;
		}
		return decimal;
	}

}
