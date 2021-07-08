package javaStringManupulation;

public class Ex3TrimTheString {
	
public static void main(String[] args) {
		
		String s="  Hello world  ";// "   hello world", "hello world  ","hello","H" 
		char []ch= s.toCharArray();
		int start=0; int end=ch.length-1; int count=0;
		
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]!=' ') {
				start=i;
				break;
			}
		}
		for(int i=ch.length-1;i>=0;i--) {
			if(ch[i]!=' ') {
				end=i;
				break;
			}
		}
		/*Whey we're giving end-start+1 is for ex:01Lilly78 
		means start index will start at 2nd index end index will be at 6the position
		and,the length of lilly is 5,if you give end-start you will get the length
		of Lilly is (6-2=4 only)why because index position starts at 0th index,
		so we've to add +1 to the statement ie)start-end+1.*/
		
		count=end-start+1;
		String st=new String(ch,start,count);
		System.out.println(st);
		
		

	}

}
