package test1NG;

import org.testng.annotations.Test;

public class Ex2GivingPriorityAttribute {
	@Test(priority=0)
	public void startCar() {
		System.out.println("start the car");
	}
	@Test(priority=1)
	public void firstGear() {
		System.out.println("firstgear");
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
