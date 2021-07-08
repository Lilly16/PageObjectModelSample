package reex3TestingProgramUsingRecursion;

public class Ex3CompressedStringRecursion {

	public static void main(String[] args) {
		
// Compressed String: "a"=a1, "aaa"=a3, "aabbcc"=a2b2c2, "aaabbccd"=a3b2c2d1
// If the compressed string is longer than the original then return the original string.
		
		String s="aaabccd";
		Ex3CompressedStringRecursion obj=new Ex3CompressedStringRecursion();
		obj.compressedString(s);
	}
	void compressedString(String s) {
		
		int count=0; char c=s.charAt(0);
		
		for(int i=0; i<s.length(); i++) {
			
			if(s.charAt(i)==c) {
				
				count++;
			}
			else {
				System.out.print(c+""+count);
				c=s.charAt(i);
				count=1;
			}
		}
		System.out.print(c+""+count);
	}

}
