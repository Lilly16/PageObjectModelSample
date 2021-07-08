package reex2TestingProgramUsingRecursion;

public class Ex6CalculateAverageUsingArrays {

	public static void main(String[] args) {
		
		int[] a= {10,20,30,40,50};
		
		System.out.println("average = "+calculateAverage(a));
	
		}
	static int calculateAverage(int[] a) {
		
		int total=0,average=0;
		
		for(int i=0; i<a.length; i++) {
			
			total +=a[i];
			average = total/(a.length);
		}
		return average;
	}
	}





/*
 * int [] a= {1,2,3,4,5}; int result=0, total=0; System.out.println(a.length);
 * 
 * for(int i=0; i<a.length; i++) {
 * 
 * result=result+a[i]; total =result/(a.length); }System.out.println(result);
 * System.out.println(total);
 */