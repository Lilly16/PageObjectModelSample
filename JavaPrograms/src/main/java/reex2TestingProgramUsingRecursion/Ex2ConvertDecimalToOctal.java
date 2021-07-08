package reex2TestingProgramUsingRecursion;

public class Ex2ConvertDecimalToOctal {

	public static void main(String[] args) {
		// 1. First convert binary to decimal 
		//2. then convert decimal to octal
		
		int num=1001;
		int decimal_num=convertToDecimal(num); // this decimal num we got from 1st method 
		
		int octal=0, i=1, remainder=0;
		
		//2. This method for converting decimal number to Octal number:
		while(decimal_num!=0) {
			
			remainder=decimal_num % 8;
			decimal_num= decimal_num/8;
			octal += remainder * i;
			i = i*10;
		}
		System.out.println(octal);
	
	}
	
	
	// 1. This method is for converting "Binary number" to "decimal number".
	
	static int convertToDecimal(int num) {
		
		int decimal=0,i=0,remainder=0;
		
		while(num!=0) {
			
			remainder= num %10;
			num =num/10;
			decimal += remainder * Math.pow(2, i);
			i++;
		}
		return decimal;
	}
}
