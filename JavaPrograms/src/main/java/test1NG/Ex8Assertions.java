package test1NG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Ex8Assertions {
	
	/* Assertions is used for unit testing. developer after 
	 * developing the software before he hand over to the tester
	 * he will check himself whether the functionality is working.
	 * that time we will use Assertions.*/
	
	String name="Jesus";
	
	boolean flag=true;
	
	boolean value=false;
	
	@Test
	public void checkName() {
		
		Assert.assertEquals(name, "Jesus");
		Assert.assertNotEquals(name, "jesus");
		Assert.assertTrue(value,"hello");
		Assert.assertFalse(flag, "welcome");
		
		
		
		
		
		
		
	}
	}
	


