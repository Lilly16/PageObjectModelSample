package reex3TestingProgramUsingRecursion;

public class Ex2CheckTwoStringsAreAnagrams {

	public static void main(String[] args) {
		
		String s1="abbab"; String s2="abbab";
		System.out.println(checkAnagrams( s1, s2));

	}
	static boolean checkAnagrams(String s1,String s2) {
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		if(s1.length()!=s2.length()) {
			return false;
		}
		
		int[] letters=new int[1<<8];
		
		for(char c: s1.toCharArray()) {
			letters[c]++;
		}
		for(char c: s2.toCharArray()) {
			letters[c]--;
		}
		for(int i: letters) {
			if(i!=0) {
				return false;
			}
		}return true;
	}
}
