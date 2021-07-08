package reex1TestingProgramsUsingRecursion;

public class Ex4AddNaturalNumbersRecursion {

	public static void main(String[] args) {
		
// Add natural numbers using recursion method:
		// natural numbers means adding numbers from 1 to 2,3,4,etc.... It starts from 1 not from "0"

		int num=9;
		
		int total=addNaturalNum(num);
		
		System.out.println(total);
		
	}
	
	public static int addNaturalNum(int num) {
		
		if(num!=0) {
			
			return num+addNaturalNum(num-1);
		}
		else {
			
			return num;
		}
	}
	
	
	
		
}
	
	
	
	


