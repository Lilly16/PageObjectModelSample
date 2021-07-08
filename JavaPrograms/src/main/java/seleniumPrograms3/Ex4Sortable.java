package seleniumPrograms3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex4Sortable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/"
				+ "sjebamalai/chromeDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/"
								+ "sortable.html");
		
		List<WebElement> selectAll = driver.findElements(By.xpath("//*[@id=\"sortable\"]/li"));
		WebElement from = selectAll.get(6);
		WebElement to = selectAll.get(0);
		
		Actions act = new Actions(driver);
		act.clickAndHold(from);
		act.moveToElement(to);
		act.release(to);
		act.build();
		act.perform();
		
		
		
		
		
		
		
		
		
		
	}

}
