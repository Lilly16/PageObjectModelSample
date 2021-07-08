package javaPrograms2;

import java.util.Random;

public class Ex3GenerateRandomNumbersAndStrings {

	public static void main(String[] args) {
		
		// Approach 1: using Random class
		
				Random r=new Random();
				int num=r.nextInt(10); /* inside nextInt() if you give 10 then it 
				will generate num from 0 to 9. if you give 100,it will generate 
				num from 0 to 99 and if u give 1000,it will give 0 to 999 */
				System.out.println("The random numbers are "+ num );
				
		        // Generating random decimal numbers:
				
				Random r1=new Random();
				double num1=r1.nextDouble(); /* it will give 0.0 to 1.0 and inside 
				nextDouble() you no need to specify anything. */
				System.out.println("The random numbers are "+ num1 );
				
		//Approach 2: using math class but it will give "only decimal numbers".
				
				System.out.println("The random numbers are"+ Math.random());

	}

}
