package test1NG;

import org.testng.annotations.Test;
/*1.testNG always run methods in alphabetical order.
/2. If you use @Test annotation we can use priority attribute or
parameter. then we will get whatever order we want to execute.*/

public class Ex1 {
	@Test
	public void startCar() {
		System.out.println("this is testng test");
	}
	@Test
	public void firstGear() {
		System.out.println("this is testng test");
	}
	@Test
	public void secondGear() {
		System.out.println("this is testng test");
	}
	@Test
	public void stopCar() {
		System.out.println("this is testng test");
		System.out.println("----------------");
	}
	
	
	
	
	
	
	
}
