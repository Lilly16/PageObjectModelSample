package test4pageObjects2TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {
	
	//Using pagefactory we can use below annotations:
	
	@FindBy(xpath="//input[@type='email' and @name='username']")
	public static WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	public static WebElement passWord;
	
	@FindBy(xpath="//button[text()='Login']")
	public static WebElement login;
	
	
	/*This is for using the findelements method and find the ele

	  public static WebElement username(WebDriver driver) { 
	  	return driver.findElement(By.xpath("//input[@type='email' and @name='username']")); 
	  } 
	  public static WebElement passWord(WebDriver driver){
	  	return driver.findElement(By.xpath("//input[@type='password']"));
	   } 
	  public static WebElement login(WebDriver driver) 
	  { 
	  	return driver.findElement(By.xpath("//button[text()='Login']")); }
	 */

}
