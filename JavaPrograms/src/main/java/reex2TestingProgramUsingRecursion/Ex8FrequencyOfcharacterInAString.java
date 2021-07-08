package reex2TestingProgramUsingRecursion;

public class Ex8FrequencyOfcharacterInAString {

	public static void main(String[] args) {
		
		String str="Welcome to my home Jesus";
		char c='e';
		
		// calling method 1
		System.out.println(findFrequencyOfCharacter(str,c));
		
		//calling method 2
		System.out.println(findOccuranceOfaCharacter( str, c));

	}
	
// Method 1: using for loop and charAt() method
	
	static int findFrequencyOfCharacter(String str,char c) {
		
		 int count=0;
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)==c) {
				
				count++;
			}
		}return count;

	}
	
// Method 2: Using enhanced for loop and charArray
	
	static int findOccuranceOfaCharacter(String str,char c) {
		
		int count=0;
		
		for(char temp:str.toCharArray()) {
			
			if(temp==c) {
				count++;
			}
		}
		return count;
	}
}
