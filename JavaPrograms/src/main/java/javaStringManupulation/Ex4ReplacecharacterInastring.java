package javaStringManupulation;

public class Ex4ReplacecharacterInastring {
	
public static void main(String[] args) {
		
		String s="Hello world!! welcome to coding simplified";
		char[] ch=s.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]=='o') {
				
				ch[i]='y';
			}
		}
		System.out.println(ch);
		
// using recursion:
		String s1="lilly";
		char[]s2=s1.toCharArray();
		replaceCharacter(s2);
	}
	
	static void replaceCharacter(char[]s2) {
		for(int i=0;i<s2.length;i++) {
			if(s2[i]=='l')
				s2[i]='s';
		}
		System.out.println(s2);
	}
	
}
