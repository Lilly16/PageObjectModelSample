package seleniumPrograms2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex9WorkingWithBrokenImage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/"
				+ "sjebamalai/chromeDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Image.html");
		
		WebElement brokenImage = driver.findElement(By.xpath("//*"
									+ "[@id=\"contentblock\"]/"
								+ "section/div[2]/div/div/img"));
		if(brokenImage.getAttribute("naturalWidth").equals(0)) {
			System.out.println("this is a broken image");
		}
		else {
			System.out.println("this is NOT a broken image");

		}
		
		driver.quit();
		
		
		
		
		
		
		
		

	}

}
