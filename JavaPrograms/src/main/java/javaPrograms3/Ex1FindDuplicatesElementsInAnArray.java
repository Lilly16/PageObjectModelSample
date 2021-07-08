package javaPrograms3;

import java.util.HashSet;

public class Ex1FindDuplicatesElementsInAnArray {

	public static void main(String[] args) {
		
// finding duplicates elements in an integer array.
		int [] a= {2,3,3,4};
		
		
		for(int i=0;i<a.length; i++) {		//i=0					i=1				i=2
			
			for(int j=i+1;j<a.length; j++) {	//j=1,2,3,4			j=2,3,4			j=3			
				
				if(a[i]==a[j])				//a[0]=a[j],2!=3,3,4	a[1]=a[j],3=3	a[2]=a[j],3!=4 
					
					System.out.println("Duplicates elements in a given integer array is "+a[i]);										//dup_ele=a[1],3
			}
			
		}
		System.out.println("-----------------------------------");
// Finding duplicates elements in a string array:
		
		String [] b= {"java","c","c++","python","java","c++"};
		 //String [] b= {"java","c","c++","python"};
		
		boolean status=false;
		
		for(int i=0;i<b.length;i++) {
			
			for(int j=i+1;j<b.length; j++) {
				
				if(b[i]==(b[j])) {
							
			System.out.println("Duplicates elements in a given string array is "+b[i]);										//dup_ele=a[1],3	
			status=true;
				
				}
}
}
		if(status==false) {
			
			System.out.println("There is no duplicate elements in a given array");
		}
		System.out.println("-----------------------------------");
		
// Using HASH SET
// hash set will not allow duplicate elements, which contains only unique elements
		
		String [] b1= {"java","c","c++","python","java","c++"};
		HashSet<String> hs =new HashSet<String>();
		
		boolean status1= false;
		
		for(String temp:b1) {
			
			if(hs.add(temp)==false) {
				
				System.out.println("The duplicate elements are "+ temp);
				status1=true;
			}
		}
		if(status1==false) {
			System.out.println("There is no duplicate elements");

		}
	}
	/*String []st= {"Java","Python","Java","Jesus","Java script"};
		findDuplicateEle( st);
		
		}
	static void findDuplicateEle(String [] st) {
		
		boolean flag=false;
		for(int i=0;i<st.length;i++) {
			
			for(int j=i+1;j<st.length;j++) {
				
				if(st[i]==st[j]) {
					System.out.println("duplicate ele is "+st[i]);
					flag=true;
					break;
				}
			}
		}
		if(flag==false) {
			System.out.println("there is no duplicate ele");
		}
		
	} */

}

