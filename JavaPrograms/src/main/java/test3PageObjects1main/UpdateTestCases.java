package test3PageObjects1main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import test4pageObjects2TestCases.LoginPageObjects;
import test4pageObjects2TestCases.UpdatePageObjects;

public class UpdateTestCases {
	
	@Test
	public void updatePage() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/"
				+ "sjebamalai/chromeDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/login");
	    
	    PageFactory.initElements(driver, LoginPageObjects.class);
	    
	    LoginPageObjects.username.sendKeys("user@phptravels.com");
	    LoginPageObjects.passWord.sendKeys("demouser");
	    LoginPageObjects.login.click();
	    
		/*LoginPageObjects.username(driver).sendKeys("user@phptravels.com");
	    LoginPageObjects.passWord(driver).sendKeys("demouser");
	    LoginPageObjects.login(driver).click();*/
	    
	    Thread.sleep(3000);
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    
	    PageFactory.initElements(driver, UpdatePageObjects.class);
	    
	    UpdatePageObjects.profile.click();
	    UpdatePageObjects.address.sendKeys("Cedar Garden");
	    UpdatePageObjects.phoneno.sendKeys("1234567");
	    
	    /*UpdatePageObjects.profile(driver).click();
	    UpdatePageObjects.address(driver).sendKeys("Cedar Garden");
	    UpdatePageObjects.phoneno(driver).sendKeys("1234567");
	    Thread.sleep(3000);
	    UpdatePageObjects.submit(driver).click();*/
	
	
	
	
	
	}

}
