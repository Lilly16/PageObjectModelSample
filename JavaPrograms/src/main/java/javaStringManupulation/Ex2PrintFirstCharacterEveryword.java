package javaStringManupulation;

public class Ex2PrintFirstCharacterEveryword {
	
	public static void main(String[] args) {
		
// case1: proper string
// case2: first word "may have" or "may not have" spaces at start
// case3: any word can have many spaces at start and end.
				
				String s= "I Am Learning Java";
				char [] c=s.toCharArray();
				System.out.println(c.length);
				
				
// Solution 1;
				for(int i=0;i<c.length;i++) {
					if(c[i]!=' ') {
						if(i==0) {
							System.out.println(c[i]);
						}
						else if(c[i-1]==' ') {
							System.out.println(c[i]);
						}
					}
				}System.out.println("\n");
				
// Solution 2:
				
				for(int i=0;i<c.length;i++) { 
					if(c[i]!=' ' &&( i==0 || (c[i-1]==' '))) {
						System.out.println(c[i]);
					}
				}System.out.println("\n");
// Using Recursion:
				String st="Java Learning Is Very Fun";
				char[]st1=st.toCharArray();
				printFirstCharacter(st1);
	}

	static void printFirstCharacter(char[]st1) {
		for(int i=0;i<st1.length;i++) {
			if(st1[i]!=' ') {
				if(i==0)
					System.out.println(st1[i]);
				else if((st1[i-1]==' ')&&(st1[i]!=' '))
					System.out.println(st1[i]);
			}
		}
	}
}
