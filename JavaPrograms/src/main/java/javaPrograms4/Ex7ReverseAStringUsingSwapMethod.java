package javaPrograms4;

public class Ex7ReverseAStringUsingSwapMethod {

	public static void main(String[] args) {
		
		String st="Jesus i love you";
		reverseString(st);

	}
	static void reverseString(String st) {
		
		char[] st1=st.toCharArray();
		int left,right=0;
		right=st1.length-1;
		
		for(left=0;left<right;left++,right--) {
			char ch=st1[left];
			st1[left]=st1[right];
			st1[right]=ch;
		}
		for(char temp:st1) {
			System.out.print(temp);
		}
	}
}
