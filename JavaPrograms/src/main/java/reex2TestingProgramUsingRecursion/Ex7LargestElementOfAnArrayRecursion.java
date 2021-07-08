package reex2TestingProgramUsingRecursion;

public class Ex7LargestElementOfAnArrayRecursion {

	public static void main(String[] args) {
		
		int[]a= {45,6,790,20,40,4,600,855};
		
		System.out.println(findLargestNum(a));
	}
	static int findLargestNum(int[] a) {
		
		int largest=a[0];
		
		for(int i=1; i<a.length; i++) {
			
			if(largest<a[i]) {
				
				largest=a[i];
			}	
		}
		return largest;
		
	}
}
