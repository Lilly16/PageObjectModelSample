package seleniumPrograms1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex4DropDownBoxExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/sjebamalai"
				+ "/chromeDriver/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/");
		
		// click drop down box:
		WebElement box=driver.findElement(By.xpath("//h5[text()='Drop "
				+ "down']"));
		box.click();
		
		//Using 1sr Drop Down Box:
		WebElement dropDownBox=driver.findElement(By.xpath("//select[@id="
				+ "'dropdown1']"));
		Select select = new Select(dropDownBox);
		select.selectByIndex(0);
		select.selectByValue("1");
		select.selectByVisibleText("UFT/QTP");
		
		//select drop down box using "send keys"
		dropDownBox.sendKeys("Load");
		
		// get Number of options:
		List<WebElement> listOfOptions=select.getOptions();
		int size=listOfOptions.size();
		System.out.println("The list of options are: "+ size);
		
		// Using select your programs drop down box:
		WebElement selectBox=driver.findElement(By.xpath("//*[@id=\""
				+ "contentblock\"]/section/div[6]/select"));
		
		  Select seBox=new Select(selectBox); 
		  seBox.selectByIndex(1);
		  seBox.selectByIndex(2); 
		  seBox.selectByIndex(3);
		  
		  driver.quit();
		  
		  
		  
		  
		  
		 
	}

}
