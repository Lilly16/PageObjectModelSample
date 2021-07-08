package seleniumPrograms2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex6AutoCompletion {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/"
							+ "sjebamalai/chromeDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		
		WebElement auto = driver.findElement(By.id("tags"));
		auto.sendKeys("s");
		Thread.sleep(4000);
		List<WebElement> list = driver.findElements(By.xpath(""
								+ "//*[@id=\"ui-id-1\"]/li"));
		for(WebElement element:list) {
			
			if(element.getText().equals("Web Services")) {
				System.out.println(element.getText());
				element.click();
				break;
			}
		}
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
