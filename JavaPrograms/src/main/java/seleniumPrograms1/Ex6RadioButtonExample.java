package seleniumPrograms1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex6RadioButtonExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/"
				+ "sjebamalai/chromeDriver/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/radio.html");
		
		//selecting yes or no radio button:
		WebElement button=driver.findElement(By.cssSelector("#yes"));
		button.click();
		
		//Find default selected radio button:
		WebElement unchecked=driver.findElement(By.xpath("//label"
				+ "[@for='Unchecked']/input"));
		boolean status1=unchecked.isSelected();
		
		WebElement checked=driver.findElement(By.xpath("//label"
				+ "[@for='Checked']/input"));
		boolean status2=checked.isSelected();
		
		System.out.println(status1);
		System.out.println(status2);
		
		//selecting age group below 20 years old:
		WebElement below20 = driver.findElement(By.xpath("//input"
				+ "[@type='radio' and @value='0' and @name='age']"));
		below20.click();
		driver.quit();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
