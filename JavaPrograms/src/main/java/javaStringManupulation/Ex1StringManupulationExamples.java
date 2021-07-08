package javaStringManupulation;

import java.util.Arrays;

public class Ex1StringManupulationExamples {

	public static void main(String[] args) {
		
		/* 1.string objects are immutable and string buffer is mutable 
		 Ex: String s="Jesus"; 
		 s.concat("welcome")
		 System.out.println(s)
		 we will get only "Jesus" we will not get "Jesus Welcome", unless if your assigned
		 to another string objects.
		 ie) String s1=s.concat("welcome")
		 2. String Buffer is mutable
		 ie) StringBuffer sb = new StringBuffer("Jesus");
		 sb.append("welcome")
		 System.out.println(sb) will get "Jesus Welcome" we don't want to create new 
		 String Buffer objects, directly we can append. */
		
		String str1="Jesus"; 
		str1.concat("Welcome");
		System.out.println(str1);
		String str2=str1.concat(" Welcome");
		System.out.println(str2);
		
		StringBuffer sb= new StringBuffer("Jesus");
		sb.append(" Welcome");
		System.out.println(sb);
		
		String s="Welcome to learn java programming and selenium";
		String st="welcome to learn java programming and selenium";
		
		
		// 1. find string length:
		System.out.println(s.length());
		
		//2. Using charAt method:
		 System.out.println(s.charAt(9));
		 
		//3. Using indexOf method:
		 System.out.println(s.indexOf('e')); //1st occurance of 'e'
		 System.out.println(s.indexOf('e',(s.indexOf('e')+1))); //2nd occurance of 'e'
		 System.out.println(s.indexOf('e',(s.indexOf('e',(s.indexOf('e')+1)))+1));//3rd occurance of 'e'
		 
		//4. String comparison:
		 System.out.println(s.equals(st));
		 System.out.println(s.equalsIgnoreCase(st));
		 
		//5. trim
		 String d="        java selenium       ";
		 System.out.println(d.trim());
		 
		//6. replace
		 System.out.println(s.replace('e', 'a'));
		 System.out.println(s);
		 System.out.println(s.replaceAll(s, st));
		 System.out.println(s.replace("learn","'came'"));
		 System.out.println("-------");
		 System.out.println(s);
		 
		 
		// 1.Split
		 String r="java_learning_is_very_easy";
		 String[] str=r.split("_");
		 String f="";
		 
		 for(String temp: str) {
			 f=f+temp+" ";
			
		 }
		 System.out.println(f); 
		 System.out.println("--------------");
		 
		 //2.Split
		 String s1="11/13/2006";
		 String[]s2=s1.split("/");
		for(int i=0;i<s2.length;i++) {
			System.out.println(s2[i]);
		}
		
		// Using Replace method
		 String n="02_01_2010";
		 String n1=n.replace("_","/");
		 System.out.println(n1);
		/*
		 * String[] n1=n.split("_"); for(int i=0;i<n1.length;i++) {
		 * System.out.print(n1[i]+"/"); }
		 */
		 
		 //Using "concat" method
		 
		 String s5="Jesus I";
		 String s6="to";
		 System.out.println(s5.concat(" love you"));
		 System.out.println(s6.concat("get").concat("her"));
		 
		 //Contains: it will return true or false
		 String s4="Welcome to learn java programming and selenium";
		 System.out.println(s4.contains("java"));
		 System.out.println(s4.contains("abc"));
		 
		 // how to print the char array 
		 String a1="abcd";
			char[]ch=a1.toCharArray();
			
			System.out.println(Arrays.toString(ch));

		 
		 
		 
		 
	}

}
