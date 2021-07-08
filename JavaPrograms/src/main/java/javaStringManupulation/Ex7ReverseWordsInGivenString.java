package javaStringManupulation;

public class Ex7ReverseWordsInGivenString {

	public static void main(String[] args) {
		
// solution 1: o(n)--------> order of n complexity
		
		  String s="Jesus is helping me"; String tempstr=""; String finalstr="";
		  
		  for(int i=s.length()-1; i>=0;i--) {
		  
		  if(s.charAt(i)!=' ') { 
			  tempstr= s.charAt(i)+tempstr; 
			  } 
		  else {
			  finalstr=finalstr+tempstr+" "; 
			  tempstr=" "; 
		  }
	}
		  finalstr=finalstr+tempstr;
		  System.out.println(finalstr);
		 
		
// solution 2:
		String s1="Jesus is helping me";
		StringBuilder tempst=new StringBuilder();
		StringBuilder finalst=new StringBuilder();
		
		for(int i=s1.length()-1; i>=0;i--) {
			
			if(s1.charAt(i)!=' ') {
				tempst=tempst.insert(0, s1.charAt(i));
			}
			else {
				finalst=finalst.append(tempst).append(" ");
				tempst.setLength(0);
			}
		}finalst=finalst.append(tempst);
		System.out.println(finalst);
		
// solution 3:
		String st1="Jesus is helping me";
		String[]st2=st1.split(" ");
		String revString="";
		System.out.println(reverseWordsInGivenString(st2, revString));
	}
	static String reverseWordsInGivenString(String[]st2,String revString) {
		String rev="";
		for(int i=st2.length-1;i>=0;i--) {
			rev=rev+st2[i]+" ";
		}
		revString=revString+rev;
		return revString;
	}
}
