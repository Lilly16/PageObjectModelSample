package test1NG;

import org.testng.annotations.Test;

public class Ex4DependsOnMethods {
	
/* Depends on methods: for ex in amazon site if you want to test
  the "Add to cart" functionality but amazon home page is not 
 working. so it the waste of time to check other functionality
 like add to cart etc...so one or two methods are depends on
 other methods we can use dependencies. */
	
	@Test(enabled=true)
	public void siteUrl() {
		System.out.println("enter the url of the site");
	}
	@Test(dependsOnMethods="siteUrl")
	public void checkingHomepage() {
		System.out.println("checking home page ");
	}
	@Test(dependsOnMethods="checkingHomepage")
	public void checkingAddToCart() {
		System.out.println("checking add to cart functionality");
	}

}
