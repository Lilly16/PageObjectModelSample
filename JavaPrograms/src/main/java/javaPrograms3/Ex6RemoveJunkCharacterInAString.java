package javaPrograms3;

public class Ex6RemoveJunkCharacterInAString {

	public static void main(String[] args) {
		
		String s= "!@#$%%^& java <>?:{} abcdef";
		//s=s.replaceAll("[^a-zA-Z0-9]", "");
		
		s=s.replaceAll("[^a-zA-Z0-9]","");
		
		System.out.println(s);
	}

}
