package seleniumPrograms2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex4ToolTipExample {

	public static void main(String[] args) {
		/* if you want to get the tool tip
		 1. first find that particular element then retrieve
		   the attribute of the element that is "title"*/
		
		System.setProperty("webdriver.chrome.driver", "/Users/"
				+ "sjebamalai/chromeDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/tooltip.html");
		
		WebElement toolTip = driver.findElement(By.id("age"));
		String title = toolTip.getAttribute("title");
		System.out.println(title);
		
		driver.quit();

	}

}
