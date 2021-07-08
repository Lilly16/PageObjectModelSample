package seleniumPrograms2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex5Selectable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/"
				+ "sjebamalai/chromeDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		
		/* here we using xpath because in this xpath, we get
		only  this -> //*"[@id=\"selectable\"]" if you use only this 
		it won't perform anything, so in this xpath we add "/li"
		then it will give all elements  */
		
		/*WebElement selectable = driver.findElement(By.xpath("//*"
								+ "[@id=\"selectable\"]")); */
		
		List<WebElement > selectable = driver.findElements(By.xpath("//*"
								+ "[@id=\"selectable\"]/li"));
		/*Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL)
		.click(selectable.get(0))
		.click(selectable.get(1))
		.click(selectable.get(2))
		.build().perform(); */
		
		// otherwise we can use click and hold method:
		Actions act = new Actions (driver);
		act.clickAndHold(selectable.get(0))
		.clickAndHold(selectable.get(1))
		.clickAndHold(selectable.get(2))
		.build().perform();
		
		driver.quit();
		
		
		

	}

}
