package javaPrograms4;

public class Ex6FizzBuzzProblem {
/* FizzBuzz numbers from 1 to x. if the number is divisible by 3 replace it with Fizz.
 * if it's divisible by 5 replace it with Buzz. if it's divisible by 3 and 5 
 * replace it with FizzBuzz*/

	public static void main(String[] args) {
		int x= 15;
		divisible(x);
}
	static void divisible(int x) {
		
		for(int i=1;i<=x;i++) {
			if((i%3==0)&&(i%5==0))
				System.out.println("Fizz");
			else if(i%3==0)
				System.out.println("Buzz");
			else if(i%5==0)
				System.out.println("FizzBuzz");
			else
				System.out.println(i);
		}
	}
}
