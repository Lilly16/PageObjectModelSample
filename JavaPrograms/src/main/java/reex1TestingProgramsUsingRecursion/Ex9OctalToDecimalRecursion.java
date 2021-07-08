package reex1TestingProgramsUsingRecursion;

public class Ex9OctalToDecimalRecursion {

	public static void main(String[] args) {
		
		int num= 116;
		System.out.println(convertOctal(num));

	}
	static int convertOctal(int num) {
		
		int octal=0,i=0,remainder=0;
		
		while(num!=0) {
			
			remainder=num%10;
			num=num/10;
			octal += remainder * Math.pow(8,i);                                                                                                                                           
			i++;
		}
		return octal;
	}

}
