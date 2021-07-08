package test1NG;

import org.testng.annotations.Test;

public class Ex3UsingEnabledAttribute {
	/* how to skip the test cases: @Test annotation giving
	 priority attribute as well as enabled attribute=false.
	 By default in priority attribute all the enables attribute
	 was True.  */
	@Test(priority=0)
	public void startCar() {
		System.out.println("start the car");
	}
	@Test(priority=1)
	public void firstGear() {
		System.out.println("firstgear");
	}
	@Test(priority=4,enabled=true)
	public void music() {
		System.out.println("music turned on");
	}
	@Test(priority=2)
	public void secondGear() {
		System.out.println("second gear");
	}
	@Test(priority=3)
	public void stopCar() {
		System.out.println("stop car");
	}

}
