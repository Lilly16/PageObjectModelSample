package reex2TestingProgramUsingRecursion;

public class Ex5CalculatePowerRecursion {

	public static void main(String[] args) {
		
		int base=2,power=3;
		
		int total=calculatePower(base,power);
		
		System.out.println(base+ "^"+power+"="+total);
		
	}
	static int calculatePower(int base,int power) {
		
		int result=1;
		
		while(power!=0) {
			
			result =result * base;
			power --;
		}
		return result;
	}

}
