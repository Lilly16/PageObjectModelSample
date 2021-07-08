package javaStringManupulation;

public class Ex5ReverseTheString {
	
public static void main(String[] args) {
		
// First Solution 1:
		String st="ruoivas ym si suseJ";
		char[] c=st.toCharArray();
		
		int start=0; int end=c.length-1;
		
		while(start<end) {
			 char temp=c[start];
			 c[start]=c[end];
			 c[end]=temp;
			 
			 start++; end--; 
		}System.out.println(c);
		
// Second Solution 2:
		
		String s="coding";
		String rev="";
		char[]ch=s.toCharArray();
		
		for(int i=s.length()-1;i>=0;i--) {
			
			//rev=rev+s.charAt(i);
			rev=rev+ch[i];
		}
		System.out.println(rev);
		
// Using method calling reversestring:
		String t="Jesus is my saviour";
		String g=reverseString(t);
		System.out.println(g);
		
	}
	
	static String reverseString(String t) {
		char[] ch1=t.toCharArray();
		int start1=0; int end1=ch1.length-1; 
		while(start1<end1) {
			char temp1=ch1[start1];
			ch1[start1]=ch1[end1];
			ch1[end1]=temp1;
			
			start1++; end1--;	
		}
	return String.copyValueOf(ch1);
}

}
