package test3PageObjects1main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import test4pageObjects2TestCases.LoginPageObjects;

public class LoginTestcases {
	
	@Test
	public void login() {
		
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
		LoginPageObjects.login(driver).click(); */

		
		
	}	

}
