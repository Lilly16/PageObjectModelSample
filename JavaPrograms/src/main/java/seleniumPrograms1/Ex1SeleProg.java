package seleniumPrograms1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1SeleProg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/sjebamalai/chromeDriver/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
		
		driver.findElement(By.partialLinkText("Home Page")).click();
		driver.findElement(By.xpath("//ul[@class='wp-categories-"
				+ "list']/li/a/h5[text()='Edit']")).click();
		Thread.sleep(200);
		
		driver.quit();
		
	}

}
