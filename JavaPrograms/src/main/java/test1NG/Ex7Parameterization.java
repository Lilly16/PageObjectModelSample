package test1NG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Ex7Parameterization {
	
	@Test
	@Parameters("Name")
	public void printName(String name) {
		System.out.println("the name is: "+name);
	}

}
