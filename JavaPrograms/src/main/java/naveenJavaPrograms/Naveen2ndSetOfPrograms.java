package naveenJavaPrograms;

public class Naveen2ndSetOfPrograms {

	public static void main(String[] args) {
		
// 1. check whether a character is Alphabet or not:
		
		char c='M';
		
		if((c>='a')&& (c<='z') || (c>='A')&& (c<='Z')) {
		
			System.out.println(c+ " is an Alphabet");
		}else {
			
			System.out.println(c+ " is not an Alphabet");
		} System.out.println("pro1 ending.....................................");
		
//2. Sum of Natural Numbers:
		
		int num=100;
		int sum=0;
		
		for(int i=1;i<=100; i++) {
			
			sum=sum+i;
		}
		System.out.println("The sum of the natural numbers are////: "+ sum);
		
	// Using while loop:
		
		int num1=100;
		int sum1=0;
		
		while(num1!=0) {
			
			sum1=sum1+num1;
			num1--;
		} 
		System.out.println("The sum of the natural numbers are: "+ sum1);
		System.out.println("pro2 ending.....................................");
		
// 3. Find a Factorial of a Number:
		
		
		int fact=1;
		
		for(int i=5;i>=2;i--) {
		//for(int i=2;i<=5;i++) {
			
			fact = fact *i;
		}System.out.println("The factorial of 5 is: "+fact);
		
// Using While loop:
		
		int n1=6;
		int fact1=1;
		
		while(n1!=1) {
			
			fact1=fact1 *n1;
			n1--;
		}System.out.println("The factorial of 5 is: "+fact1);
		System.out.println("pro3 ending.....................................");
		
// 4. Generate Multiplication table:
		
		int t=10; int su;
		
		for(int i=1; i<=10; i++) {
			
			su= i *t;
			System.out.println(i + " *"+ t+ "="+ su );
		}System.out.println("pro4 ending.....................................");
		
//5. Display Fibonacci series:
		
		int fir_num=0;
		int sec_num=1;
		System.out.print(fir_num+",");
		System.out.print(sec_num+",");
		int thi_num=0;
		
		for(int i=0; i<=10; i++) {
			
			thi_num= fir_num+sec_num;
			fir_num=sec_num;
			sec_num=thi_num;
			System.out.print(thi_num+",");
		}System.out.println("");
		System.out.println("pro5 ending.....................................");
		
//6. Display characters from A to z using loop:
		
		for(char ch='A';ch<='Z'; ch++) {
			
			System.out.print(ch+ " ");
		}System.out.println("");
		System.out.println("pro6 ending.....................................");
		
// 7.Count number of digits in an Integer:
		
		int m=1789056787;  //m=0 m=1,m=01, m=12,if you give 9 digits no you've to specify "long" 
		//long m=178905678789;
		int count=0;
		
		while(m!=0) {
			
			m=m/10;
			count++;
		}
		System.out.println("The number of digits in a given integer are: "+count);
		System.out.println("pro7 ending.....................................");
		
//8.Reverse Number:
		
		int i=6789;
		int rev_num=0;
		
		while(i!=0) {
			
			rev_num=rev_num*10+i%10;
			i=i/10;
		}
		System.out.println("The reverse of the number is : "+rev_num);
		System.out.println("pro8 ending.....................................");
		
//9. Calculate power of a number:
		
		int base=3;
		int power=3;
		int result=1;
		//we can use direct formula 
		System.out.println(Math.pow(4,3));
		
		while(power!=0) {		//4!=0		3!=0		2!=0		1!=0		0=0 exit loop
			
			result=result*base;	//re=1*3=3	re=3*3=9	re=9*3=27	re=27*3=81
			power--;			//po=3		po=2		po=1		po=0
		}
		System.out.println(base+ "^"+ power+ "= "+result);
		System.out.println("pro9 ending.....................................");
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
} 