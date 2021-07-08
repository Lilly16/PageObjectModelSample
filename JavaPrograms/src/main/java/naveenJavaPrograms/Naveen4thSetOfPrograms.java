package naveenJavaPrograms;

public class Naveen4thSetOfPrograms {

	public static void main(String[] args) {
		
//1. Largest Element of an array:
		
		int [] a= {3,40,2,60,0,100,6};
		
		int largest=a[0];
		
		for(int i=1; i<a.length; i++) {
			
			if(largest<a[i]) {
				
				largest=a[i];
			}
		}
		System.out.println(largest);
		
//2. Find frequency of character in a string:
		
		String s="Welcome to my home Jesus";
		char c='W'; int count =0;
		
		for(int i=0;i<s.length(); i++) {
			
			if(s.charAt(i)==c) {
				
				count++;	
			}
		}
		System.out.println(count);
		
//3. Count the number of vowels and consonants in a sentence:
		
		String st="Welcome to my home Jesus";
		
		int vowels_count=0;
		int conson_count=0;
		System.out.println(st.length());
		
		for(int i=0; i<st.length(); i++) {
			
			if(st.charAt(i)=='a' || st.charAt(i)=='e' ||st.charAt(i)=='i'||st.charAt(i)=='o'||st.charAt(i)=='u') {
				
				vowels_count++;
			}else {
				
				conson_count++;
			}
		}
		System.out.println("vowels_count is = "+ vowels_count);
		System.out.println("conson_count is = "+ conson_count);
		System.out.println("\n----------------------------");
		
// Compressed String: "a"=a1, "aaa"=a3, "aabbcc"=a2b2c2, "aaabbccd"=a3b2c2d1
// If the compressed string is longer than the original then return the original string.
		
		String g="aaabbccd";
		
		int count1=0;
		char c1=g.charAt(0);
		
		for(int i=0; i<g.length(); i++) {
			
			if(c1==g.charAt(i)) {
				count1++;
			}else {
				System.out.print(c1+""+count1);
				c1=g.charAt(i);
				count1=1;
			}
		}System.out.print(c1+""+count1);
		
		
		
		

		
		
		
		
		
		
		
		
		
		
}
}
