package javaPrograms2;

public class Ex5SumOfElementsInAArray {

	public static void main(String[] args) {
		
		int [] a= {2,4,6,8};
		int sum=0;							//a.length-1=4-1=3
		
		for(int i=0; i<=a.length-1; i++) {	//i=0		i=1		i=2		i=3		i=4confalse
			
			sum = sum+a[i];					//sum=0+2=2	sum=6	sum=12	sum=20 
		}
		System.out.println("The sum of elements in the given array is "+sum);
		
// Approach 2;
		int [] b= {5,6,7,8};
		System.out.println(findSum(b));
	}
	static int findSum(int []b) {
		
		int count=0;
		for(int i=0;i<b.length;i++) {
			count = count+b[i];
		}
		return count;
	}

}
