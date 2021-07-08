package javaPrograms3;

public class Ex8FindOccuransesOfACharacterInAString {

	public static void main(String[] args) {
		
		String s="Jesus I am Learning Java, Bless me";

//Approach 1:
		char c='e';
		int count=0;
		System.out.println(s.length());
		System.out.println(s.length()-1);

		
		for(int i=0;i<s.length();i++) {
			
			if(c==s.charAt(i)) {
				
				count++;
			}
		}
		
		System.out.println("The character 'e' occurance in a given string is: "+count+" times");
		System.out.println("----------------------------");
		
// Approach 2:
		
		String str= "java programming java oops";
		
		int total_counts= str.length();
		int total_counts_after= str.replaceAll("a", "").length();
		int total=(total_counts)-(total_counts_after);
		
		System.out.println("The character 'a' occurance in a given string is: "+total+" times");
	
// Approach 3:
		
		String st="I am very good at Java now";
		int n=st.replaceAll("[^a]","").length();
		System.out.println("character 'a' appears in "+n+" times");
	}

}
