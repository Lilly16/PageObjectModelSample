package javaStringManupulation;

import java.util.HashSet;
import java.util.Set;

public class Ex7FindNumberOfUniqueCharactersInAString {

	public static void main(String[] args) {
		
		String st="abbcabdaa";
		System.out.println("NUmber of Unique characters in a given string is "+findNumofUniqueChar(st));
	}
	static int findNumofUniqueChar(String st) {
		
		Set<Character> set= new HashSet<Character>();
		
		if(st==null || st.length()==0) {
			return 0;
		}
		else {
		
			for(int i=0;i<st.length();i++) {
				set.add(st.charAt(i));
			}
		} 
		return set.size();
	}
	
	
	
	
	
	
	
	}

