package javaStringManupulation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ex8LongestSubStringLengthWithNoRepeatingChar {

	public static void main(String[] args) {
		
		String st="babccbacd";
		char[] ch=st.toCharArray();
		
		String longest_sub_string=null;
		int  longest_sub_string_len=0;
		
		Map<Character,Integer> map=new HashMap<>();
		
		for(int i=0;i<ch.length;i++) {
			char c=ch[i];
			if(!map.containsKey(c)) {
				map.put(c, i);
			}
			else {
				i=map.get(c);
				map.clear();
			}
		}
		if(map.size()>longest_sub_string_len) {
			longest_sub_string_len=map.size();
			longest_sub_string=map.keySet().toString();
			
		}
		System.out.println("longest_sub_string"+longest_sub_string);
		System.out.println("longest_sub_string_len is = "+longest_sub_string_len);
		
		
		}
		
	
	
		
	

	
	
	
}

