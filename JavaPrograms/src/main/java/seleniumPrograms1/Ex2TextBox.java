package seleniumPrograms1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2TextBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/sjebamalai/chromeDriver/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
		
		WebElement home=driver.findElement(By.xpath("//div[@id='contentblock']/section/div[1]/div/div/a"));
		home.click();
		
		WebElement editButton=driver.findElement(By.xpath("//ul[@class='wp-categories-list']/li[1]/a/h5"));
		editButton.click();
		
		WebElement emailbox=driver.findElement(By.xpath("//div[@id='contentblock']/section/div[1]/div/div/input"));
		emailbox.sendKeys("lilly@gmail.com");
		
		WebElement appendbox=driver.findElement(By.xpath("//div[@id='contentblock']/section/div[2]/div/div/input"));
		appendbox.sendKeys("hi");
		
		WebElement gettextbox=driver.findElement(By.xpath("//div[@id='contentblock']/section/div[3]/div/div/input"));
		String value=gettextbox.getAttribute("value");
		System.out.println(value);
		
		WebElement clearbox=driver.findElement(By.xpath("//div[@id='contentblock']/section/div[4]/div/div/input"));
		clearbox.clear();
		
		WebElement disbox=driver.findElement(By.xpath("//div[@id='contentblock']/section/div[5]/div/div/input"));
		boolean enablebox=disbox.isEnabled();
		System.out.println(enablebox);
		
		driver.quit();
		
		
		
		
	}

}
