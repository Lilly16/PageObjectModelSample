package javaPrograms2;

public class Ex9FindMaxAndMinValuesInAnArray {

	public static void main(String[] args) {
		
// Finding Maximum number in an Array:
		
		int [] a= {20,50,60,30};
		int max=a[0];                  //a.length=4
		
		for(int i=1;i<a.length;i++) {	//i=1		i=2				i=3
			
			if(a[i]>max)				//a[1],50>20	a[2],60>50	a[3],30>60
				max=a[i];				//max=50		max=60		max=60
		}
		System.out.println("The maximum values in a given array is "+ max);
	
	
// Finding Minimum number in an Array: 
	
	int[] b= {34,2,78,90};
	int mini=b[0]; 					//b.length=4
	
	for(int j=1;j<b.length; j++) {	//j=1			j=2			j=3
		
		if(b[j]<mini)				//b[j],2<34		b[j],78<2	b[j],90<2	
			
			mini=b[j];				//mini=2		mini=2		mini=2
	}
	System.out.println("The minimum values in a given array is "+ mini);
}
}
