package javaPrograms2;

public class Ex6FindEvenOddNumFromAnArray {

	public static void main(String[] args) {
		
		int [] a= {1,2,3,4,5};
		
		int even_count=0;
		int odd_count=0;					//a.length-1=5-1=4	
		
		for(int i=0; i<=a.length-1; i++) {	//i=0		i=1		i=2		i=3		i=4
			
			if(a[i]%2==0) {					//a[0]=1	a[1]=2	a[2]=3	a[3]=4	a[4]=5
				
				even_count++;				//			even=1			even=2
				
			} else {
				
				odd_count++;				// odd=1			odd=2			0dd=3
			}
		}
		System.out.println("The count of even numbers in a given array is "+even_count);
		System.out.println("The count of odd numbers in a given array is "+odd_count);
		System.out.println("----------------------------");
		
// Using enhanced for loop:
		
		int [] b= {23,45,66,73,80};
		
		for(int temp: b) {
			
			if(temp%2==0) 
				System.out.println("The count of even numbers in a given array is"+temp);
			}
		for(int temp:b) {
			if(temp%2!=0)
				System.out.println("----------------------------");
				System.out.println("The count of odd numbers in a given array is"+temp);
		}
	}
}


