package javaPrograms4;

public class Ex1ReverseEachWordInAString {

	public static void main(String[] args) {
		
// Approach 1:
		
		String str="Jesus is my strength";
		String[] s=str.split(" ");
		String reverseString="";
		
		for(String words:s) {
			
			String reverseWords="";
			
			for(int i=words.length()-1; i>=0; i--) {
				
				reverseWords=reverseWords+words.charAt(i);
				
			}
			
			reverseString=reverseString+reverseWords+" ";
		}
		
		System.out.println("Reverse Of each word of the given string is: "+reverseString);
		System.out.println("-------------------------------------");
		
// Approach 1: Using built in method "string Builder"
		
		String str1= "Jesus is my saviour";
		String[] s1=str1.split(" ");
		String reverseString1="";
		
		for(String words1:s1) {
			
			StringBuilder sb=new StringBuilder(words1);
			sb.reverse();
			reverseString1=reverseString1+sb.toString()+" ";
		}
		
		
		System.out.println("Reverse Of each word of the given string is: "+reverseString1);

	}

}
