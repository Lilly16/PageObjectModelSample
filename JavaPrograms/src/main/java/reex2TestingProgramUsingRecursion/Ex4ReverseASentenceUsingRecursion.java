package reex2TestingProgramUsingRecursion;

public class Ex4ReverseASentenceUsingRecursion {

	public static void main(String[] args) {
		
		String s="Welcome to Jesus home";
		
		System.out.println(reverseASentence(s));
		
	}
	static String reverseASentence(String s) {
		
		String [] str=s.split(" ");
		String rev= "";
		
		for(String words:str) {
			
			for(int i=words.length()-1; i>=0; i--) {
				
				rev +=words.charAt(i);
			}
			rev +=" ";
		} 
		return rev;
	} 
	
	
	
	
}
