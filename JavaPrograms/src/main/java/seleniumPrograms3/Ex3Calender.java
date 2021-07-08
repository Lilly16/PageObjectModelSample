package seleniumPrograms3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3Calender {

	public static void main(String[] args) {
		// //table[@class='ui-datepicker-calendar']/tbody/tr[2]/td[7]/a

		System.setProperty("webdriver.chrome.driver", "/Users/"
				+ "sjebamalai/chromeDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Calendar.html");
		
		WebElement calendar = driver.findElement(By.id("datepicker"));
		//We can use sendkeys to find the particular date.
		calendar.sendKeys("07/10/2021");
		
		//otherwise the second method is below:
		calendar.click();
		
		WebElement next = driver.findElement(By.xpath("//a[@title='Next']"));
		next.click();
		
		WebElement datebutton = driver.findElement(By.xpath("//"
								+ "a[contains(text(),'10')]"));
		
		System.out.println(datebutton);
		datebutton.click();
		
		
		
		
		
		
		
	}

}
