package javaPrograms3;

import java.util.Arrays;
import java.util.Collections;

public class Ex5SortElementsInArrayUsingBuiltInMethods {

	public static void main(String[] args) {
		
// Approach 1:
		
		int a [] = {34,56,78,2,90};
		
		
		System.out.println("Array elements before sorting "+Arrays.toString(a));
		
		Arrays.parallelSort(a);
		
		System.out.println("Array elements after sorting "+Arrays.toString(a));
		System.out.println("------------------------------");

// Approach 2:
		
		int [] b= {34,56,78,2,90};
		
		System.out.println("Array elements before sorting "+Arrays.toString(b));
		
		Arrays.sort(b);
		
		System.out.println("Array elements after sorting "+Arrays.toString(b));
		System.out.println("------------------------------");
		
// Approach 3:
		
		Integer [] c= {34,56,78,2,90};
		
		System.out.println("Array elements before sorting "+Arrays.toString(c));
		
		Arrays.sort(c,Collections.reverseOrder());
		
		System.out.println("Array elements after sorting "+Arrays.toString(c));
		
		
		
	}

}
