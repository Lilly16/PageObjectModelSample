package javaPrograms2;

import java.util.Arrays;

public class Ex7CheckBothArraysAreEqual {

	public static void main(String[] args) {
		
// Approach 1:
		
		int[] a1= {2,4,6,8};
		int[] a2= {2,4,9,8};
		
		boolean status=Arrays.equals(a1,a2);
		
		if(status==true) {
			System.out.println("Both arrays are equal");
		}else {
			System.out.println("Both arrays are not equal");
		}
		
		System.out.println("-------------------------------------");
// Approach 2:
		
		int[] x1= {2,4,6,8,90};
		int[] x2= {2,4,6,8,90};
		
		boolean status1= true;
		
		if(x1.length==x2.length) {
			
			for(int i=0; i<x1.length; i++) {
				
				if(x1[i]!=x2[i]) {
					
					status=false;
				}
			}
			
		}
		else {
			status1=false;
		}
		
		if(status1==true) {
			System.out.println("Both arrays are equal");
		} else {
			System.out.println("Both arrays are not equal");

		}
		System.out.println("\n");
		
// Approach 2:
		
		int[]b1= {3,4,5,7};
		int[]b2= {3,4,5,6};
		boolean boo=findBothArraysEqual(b1,b2);
		if(boo==true)
			System.out.println("both arrays are equal");
		else
			System.out.println("both arrays are not equal");

		
	}
	static Boolean findBothArraysEqual(int[]b1,int[]b2) {
		boolean tag=true;
		if(b1.length==b2.length) {
			for(int i=0;i<b1.length;i++) {
				if(b1[i]==b2[i])
					tag=true;
				else
					 tag=false;
			}
		}
		
		return tag;	
	}
}
