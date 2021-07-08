package javaPrograms3;

public class Ex7RemoveWhiteSpaceInAString {

	public static void main(String[] args) {
		
		String s="        Learning    Java    programming language          ";
		
// Method 1: Convert string into "character Array" and use for loop:
		
		char[] ch= s.toCharArray();
		String st="";
		
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]!=' ') {
				st =st+ch[i];
			}
		}System.out.println(st);
		
// Method 2: for loop using charAt() method:
		
		String st1="";
		
		for(int i=0; i<ch.length;i++) {
			
			if(ch[i]!=' ') {
				
				st1=st1+ s.charAt(i);
			}
		}System.out.println(st1);
		
//Method 3: Using replaceAll method:
		
		System.out.println("Before removing the spaceses the string s is: "+ s);
		
		s=s.replaceAll(" ",  "");
		
		System.out.println("After removing the spaceses the string s is: "+ s);
		
// Method 4: Using recursion

		String s1="    Jesus Bless My Family            ";
		char[] ch1=s1.toCharArray();
		System.out.println(removeWhiteSpace(ch1));
		
	}
	static String removeWhiteSpace(char[]ch1) {
		
		String st1="";
		for(int i=0;i<ch1.length;i++) {
			if(ch1[i]!=' ') {
			st1=st1+ch1[i];
			}
		}
		return st1;
	}
}
