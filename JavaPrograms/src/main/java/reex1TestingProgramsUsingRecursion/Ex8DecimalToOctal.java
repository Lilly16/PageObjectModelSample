package reex1TestingProgramsUsingRecursion;

public class Ex8DecimalToOctal {

	public static void main(String[] args) {
		
		int num=78;
	}
	public static int convertDeciToOctal(int num) {
		
		int octalNum=0,i=1,remainder=0;
		
		while(num!=0) {
			
			remainder=num%8;
			num=num /8;
			octalNum += remainder * i;
			
			i = i *10;
		}
		return octalNum;
	}
}
