package reex2TestingProgramUsingRecursion;

public class Ex1ConvertDecimalToOctalRecursion {

	public static void main(String[] args) {
		
		int num=1001;
		System.out.println(convertToOctal(num));
	}
	static int convertToOctal(int num) {
		
		int octal=0, remainder=0, i=0;
		
		while(num!=0) {
			
			remainder=num%10;
			num=num/10;
			octal += remainder * Math.pow(8, i);
			i++;
		}
		return octal;
	}
}
