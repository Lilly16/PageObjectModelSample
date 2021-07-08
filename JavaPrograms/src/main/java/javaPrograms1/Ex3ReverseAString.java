package javaPrograms1;

public class Ex3ReverseAString {

	public static void main(String[] args) {
		
// using + concatenation operator
		
		String st="abcd";
		String rev=" ";
		
		for(int i=st.length()-1; i>=0;i--) {	//st.iength()=4,st.length()-1= 3,2,1,0,-1
			rev=rev+st.charAt(i);				// d dc dcb dcba
		}
		System.out.println("The reverse of the string is rev "+rev);
		
// Using + concatenation operator from 0
		
		String st1="Jesus";
		String rev12="";
		
		for(int i=0;i<st1.length();i++) {
			rev12=st1.charAt(i)+rev12;
		}
		System.out.println("The reverse of the string is rev12 "+rev12);

		
		
// Using character Array
		
		String s= "ejhf";
		char [] a= s.toCharArray();
		String rev1=" ";
		
		for(int j=a.length-1;j>=0;j--) {			// 3 2 1 0 -1
			rev1=rev1+a[j];							// dcba
		}
		System.out.println("The reverse of the string is rev1 "+rev1);
		
// Using StringBuffer Method:
		
		String t="yuhg";
		StringBuffer sb= new StringBuffer(t);
		StringBuffer su=sb.reverse();
		System.out.println("The reverse of the string su is "+su);
		
	}

}
