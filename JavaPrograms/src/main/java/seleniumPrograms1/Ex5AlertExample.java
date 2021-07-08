package seleniumPrograms1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex5AlertExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/"
				+ "sjebamalai/chromeDriver/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		// Alert box click:
		WebElement alertbox=driver.findElement(By.xpath("//button"
				+ "[@onclick='normalAlert()']"));
		alertbox.click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		//Confirm Box alert click:
		WebElement confirmBox=driver.findElement(By.cssSelector(""
				+ "button[onclick='confirmAlert()']"));
		confirmBox.click();
		Thread.sleep(3000);
		Alert confirmAlert=driver.switchTo().alert();
		confirmAlert.dismiss();
		
		//Prompt Box alert:
		WebElement promptAlert=driver.findElement(By.cssSelector(""
				+ "button[onclick='confirmPrompt()']"));
		promptAlert.click();
		Thread.sleep(3000);
		Alert promAle = driver.switchTo().alert();
		promAle.sendKeys("Learn Automation");
		Thread.sleep(3000);
		promAle.accept();
		
		driver.quit();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
