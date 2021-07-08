package test1NG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Ex5SuiteExample {
	/* Aim:
	 1. open the chrome browser. 2. open google.co.in 3. bing.com
	 3.then amazon.com 4. close the browser.*/
	
	WebDriver driver;
	long startTime;
	long endTime;
	
	@BeforeSuite
	public void launchBrowser() {
		startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "/Users/sjebamalai/chromeDriver/chromedriver");
		driver = new ChromeDriver();	
	}
	@Test
	public void openGoogle() {
		driver.get("http://google.co.in");
	}
	@Test(dependsOnMethods="openGoogle")
	public void openBign() {
		driver.get("http://bing.com");
	}
	@Test(dependsOnMethods="openBign")
	public void openAmazon() {
		driver.get("http://amazon.com");
	}
	@AfterSuite
	public void closeBrowser() {
		driver.quit();
		endTime = System.currentTimeMillis();
		long total=endTime-startTime;
		System.out.println(total);
	}
}
