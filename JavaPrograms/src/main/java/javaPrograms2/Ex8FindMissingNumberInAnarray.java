package javaPrograms2;

public class Ex8FindMissingNumberInAnarray {

	public static void main(String[] args) {
		
/* 1.Array should not have duplicates.
   2.Array no need to be sorted order.
   3.values should be in range.*/
		
/* 1+2+3+4+5=15->sum1, 1+2+4+5=12-> sum2, sum1-sum2=15-12=13 */
		
		int[] a= {1,2,4,5};
		int sum1=0;
		
		for(int i=0;i<a.length; i++) {
			
			sum1=sum1+a[i];
		}
		int sum2=0;
		
		for(int j=1;j<=5;j++) {
			
			sum2=sum2+j;
		}
		System.out.println("sum1= "+sum1);
		System.out.println("sum2= "+sum2);
		System.out.println("Missing Number in a array is= "+(sum2-sum1));
	}

}
