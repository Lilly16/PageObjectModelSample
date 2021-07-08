package test1NG;

import org.testng.annotations.Test;

public class Ex6GroupingExample {
	
	/* Scenario: A big basket is having different kind of mobiles.
	 * Let us say there are apple,samsung,lenova,and blackberry.
	 * I want to run the test cases only for apple and samsung
	 * write the program for that.
	 * HPALM: Application Lifecycle Management */
	
	@Test (groups={"Apple"})
	public void apple1() {
		System.out.println("apple testing");
	}
	@Test (groups={"Apple"})
	public void apple2() {
		System.out.println("apple testing");
	}
	@Test (groups={"Samsung"})
	public void samsung1() {
		System.out.println("samsung testing");
	}
	@Test (groups={"Samsung"})
	public void samsung2() {
		System.out.println("samsung testing");
	}
	@Test (groups={"Lenova"})
	public void lenova1() {
		System.out.println("lenova testing");
	}
	@Test (groups={"Lenova"})
	public void lenova2() {
		System.out.println("lenova testing");
	}
	@Test (groups={"Blackberry"})
	public void blackberry1() {
		System.out.println("blackberry testing");
	}
	@Test (groups={"Blackberry"})
	public void blackberry2() {
		System.out.println("blackberry testing");
	}

}
