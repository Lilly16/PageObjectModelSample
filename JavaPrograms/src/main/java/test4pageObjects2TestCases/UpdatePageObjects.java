package test4pageObjects2TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdatePageObjects {
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div[2]/div/div[1]/div[1]/aside/nav/ul/li[2]/a")
	public static WebElement profile;
	
	@FindBy(xpath="//input[@placeholder='Address 2']")
	public static WebElement address;
	
	@FindBy(xpath="//input[@placeholder='Phone']")
	public static WebElement phoneno;
	
	
	/*public static WebElement profile(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div/div[1]/div[1]/aside/nav/ul/li[2]/a"));
	}
	public static WebElement address(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@placeholder='Address 2']"));
	}
	public static WebElement  phoneno(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@placeholder='Phone']"));
	}
	public static WebElement submit(WebDriver driver) {
		return driver.findElement(By.xpath("//button[contains(text(),'Submit') and @type='submit']"));
	}*/

}
