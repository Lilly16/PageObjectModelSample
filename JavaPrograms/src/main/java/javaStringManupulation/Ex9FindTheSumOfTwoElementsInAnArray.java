package javaStringManupulation;

import java.util.HashMap;
import java.util.Map;

public class Ex9FindTheSumOfTwoElementsInAnArray {
	
	public static void main(String[]args) {
		
	int [] a= {2,4,7,8,3};//{2,4,5,3,1,8,9};{2,4,7,8,3};
	
	int target=7;
	int[] total=findSumOfEle(a,target);
	System.out.println(total);
}
	static int[] findSumOfEle(int[]a,int target) {
	
		Map<Integer,Integer> num =new HashMap<>();
		
		for(int i=0;i<a.length;i++) {
			
			int temp=target-a[i];
			
			if(num.containsKey(temp)) {
				
				return new int[] {i,num.get(temp)};
			}
			num.put(a[i], i);
		}
		return new int[] {-1,-1};
		
	}
}
