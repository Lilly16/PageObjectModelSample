package javaPrograms3;

import java.util.Arrays;
/* Binary search
 1. the element should be in sorted order.
 2. suppose if it's not in the sorted order, first we should fix the ele in the sorted order
 3. then we've to find the mid value ie) mid=(l+h)/2
 4. the key(ie) the search element), then compare the key with our mid value, if the key value
 is less than the mid value then we should move the higher bound. suppose the key value is
 higher than the mid value then we should move the lower bound. */

public class Ex3SearchanElementInAnArrayBinarySearch {

	public static void main(String[] args) {
		
// Approach 1: Using logic and element should be in sorted ordered.
		
		int []a= {2,4,6,8,10,12,14,16,45,67,89,100,120};
		
		int search_ele=89;
		int l=0;
		int h=a.length-1;
		boolean flag=false;
		
		while(l<=h) {
			
			int mid=(l+h)/2;
			
			if(a[mid]==search_ele) {
				
				System.out.println("Searching element is found ");
				flag=true;
				break;
				
			}if(a[mid]<search_ele) {
				
				l=mid+1;

			}if(a[mid]>search_ele) {
				
				h=mid-1;
			}
		}
		if(flag==false){
			
			System.out.println("Search element not found");
		}
		System.out.println("--------------------------------------");
		
// Approach 2: Using built in function:
		
		int []a1= {34,56,89,90,100};
		
		System.out.println(Arrays.binarySearch(a1, 89));
		
//Approach 3: 
		int []b= {3,5,6,7,8,9,12,23,45};
		int l1=0,h1;
		h1=b.length-1;
		int search=12;
		int result=searchElement(b,l1, h1, search);
		if(result==-1) {
			System.out.println("ele not found");
		}else {
			System.out.println("ele found in the index: "+result);
		}
		
	}
static int searchElement(int[]b,int l1,int h1,int search) {
	
	if(l1<=h1) {
		
		int m=(l1+h1)/2;
		
		if(b[m]==search)
			return m;
		if(search<b[m])
			return searchElement(b,l1,m-1,search);
		return searchElement(b,m+1,h1,search);
			
	}
	return -1;
}
}
