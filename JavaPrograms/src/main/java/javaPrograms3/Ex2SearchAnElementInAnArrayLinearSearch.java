package javaPrograms3;

/* Linear search is we have integer array, in that array we searching a particular ele
 so what we've to do,extract each element in the given array and compare with the targeted 
 element.this is linear search.the array should be in any order like sorted order, or unsorted
 order or anything.  */

public class Ex2SearchAnElementInAnArrayLinearSearch {

	public static void main(String[] args) {
		
		int[]	a= {30,10,50,20,0,60,40};	
		
		searchAnEleInAnarray(a);
		
	}
static void searchAnEleInAnarray(int[]a) {
	
	boolean flag=false;
	int searchEle=60;
	
	for(int i=0;i<a.length;i++) {
		
		if(searchEle==a[i]) {
			
			System.out.println("search ele found "+i);
			flag=true;
			break;
		}
	}
	if(flag==false) {
		
		System.out.println("search ele not found ");

	}
}
}
