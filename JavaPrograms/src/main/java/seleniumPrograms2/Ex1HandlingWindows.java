package seleniumPrograms2;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1HandlingWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/"
				+ "sjebamalai/chromeDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		
		WebElement home = driver.findElement(By.id("home"));
		home.click();
		
		//here we'll get all window's ID's
		Set<String> windowsId = driver.getWindowHandles();
		Iterator<String> itr = windowsId.iterator();
		String parentId = itr.next();
		String childId = itr.next();
		
		//switch to child window
		driver.switchTo().window(childId);
		Thread.sleep(3000);
		//performing some actions in the child window
		WebElement edit=driver.findElement(By.xpath("//*[@id=\""
				+ "post-153\"]/div[2]/div/ul/li[1]/a/h5"));
		edit.click();
		Thread.sleep(3000);
		//closing child window
		driver.close();
		//Returning to parent window
		driver.switchTo().window(parentId);
		//closing parent window
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
