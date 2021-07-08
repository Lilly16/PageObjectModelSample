package reex3TestingProgramUsingRecursion;

public class Ex1RemoveWhitespacesInAString {

	public static void main(String[] args) {
		
		String s="I Love you Jesus";
		
		char[] st=s.toCharArray();
		
		System.out.println(removeWhitespaces(st));
	}
	static String removeWhitespaces(char[] st) {   
		
		String str="";
		
		for(int i=0;i<st.length;i++) {
			
			if(st[i]!=' ') {
				
				str=str+st[i];  
				
			}
		}
		return str;
		
	}
}
