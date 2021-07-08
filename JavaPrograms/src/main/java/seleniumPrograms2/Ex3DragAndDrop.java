package seleniumPrograms2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex3DragAndDrop {

	public static void main(String[] args) {
		
		/*Actions class is mostly used for keyboard operations
		and mouse operations.and it's mostly used for 
		mouse operations.*/
		
		System.setProperty("webdriver.chrome.driver", "/Users/"
				+ "sjebamalai/chromeDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drag.html");
		
		// Do Drag and Drop from one place to another place.
		WebElement from = driver.findElement(By.cssSelector(""
							+ "div[id='draggable']"));
		WebElement to = driver.findElement(By.cssSelector("div[id='"
							+ "mydiv']"));
		
		Actions act = new Actions(driver);
		
		act.clickAndHold(from).moveToElement(to).
		release().build().perform();
		
		//Otherwise we can directly use the drag and drop method
		act.dragAndDrop(from, to).build().perform();
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
