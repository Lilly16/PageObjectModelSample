package javaStringManupulation;

public class Ex6ReverseIndividualWordsInAString {
	
	public static void main(String[] args) {
		
// first solution 1:
				
				String s="hello world";
				String[] st=s.split(" ");
				String revString="";
				
				for(String words:st) {
					
					String revWords="";
					for(int i=0;i<words.length();i++) {
						revWords=words.charAt(i)+revWords;
					}
					revString=revString+revWords+" ";
				}
				
				System.out.println(revString);
				
// second solution 2:
				
				String temp_string="";
				String final_string="";
				for(int i=0; i<=s.length()-1;i++) {
					if(s.charAt(i)!=' ') {
						temp_string=s.charAt(i)+temp_string;
					}
					else {
						final_string=final_string+temp_string+" ";
						temp_string="";
					}
				}
				final_string=final_string+temp_string;
				System.out.println(final_string);
				
// third solution 3:
				
				String s1="hello world";
				StringBuilder tempstr=new StringBuilder();
				StringBuilder finalstr=new StringBuilder();
				
				for(int i=0;i<s1.length();i++) {
					if(s1.charAt(i)!=' ') {
						
						tempstr.insert(0, s1.charAt(i));
					}
					else {
						finalstr=finalstr.append(tempstr).append(" ");
						tempstr.setLength(0);
					}
				}
				finalstr=finalstr.append(tempstr);
				System.out.println(finalstr);
			}

}
