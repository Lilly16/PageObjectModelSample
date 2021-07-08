package javaPrograms3;

import java.util.Arrays;
/*bubble sort:1. In bubble sort, it will go n-1 number of times. for ex) integer array
has 5 ele means it will take 4 passes(5-1=4 times) 
2. we tak two for loop, first for loop is for number of passes and second for loop
is for compare the elements.
3. suppose the element is not in sorted order we need to sort the elements first.
Ex. int []a={4};
 */
import java.util.Collections;

public class Ex4SortelementsINAnArrayBubbleSort {

	public static void main(String[] args) {
		
//suppose the element is not in sorted order we need to sort the elements first.Ex.
		int[]b= {34,56,7,90,34,5,8};
		System.out.println("arrays before sorting"+Arrays.toString(b));
		Arrays.parallelSort(b);
		System.out.println("arrays after sorting"+Arrays.toString(b));
		
		int[]c= {34,56,7,900,340,5,8};
		System.out.println("arrays before sorting"+Arrays.toString(c));
		Arrays.sort(c);
		System.out.println("arrays after sorting"+Arrays.toString(c));

		
		
		int[]a = {5,8,2,9,30};
		
		System.out.println("Before sorting given array "+Arrays.toString(a));
		
		for(int i=0;i<a.length-1; i++) {		// number of passes
			
			for(int j=0; j<a.length-1; j++) {	//  iterations in each pass
				
				if(a[j]>a[j+1]) {
					
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
		}
		System.out.println("After sorting given array "+ Arrays.toString(a));
	}

}
