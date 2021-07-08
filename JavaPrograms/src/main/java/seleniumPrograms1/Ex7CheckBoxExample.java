package seleniumPrograms1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex7CheckBoxExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/"
				+ "sjebamalai/chromeDriver/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");

		//select the language you know:
		WebElement java = driver.findElement(By.xpath("//section["
				+ "@class='innerblock']/div[1]/div/input[@type='"
				+ "checkbox']"));
		java.click();

		//check is selenium is selected
		WebElement selenium = driver.findElement(By.xpath("//*[@id="
				+ "\"contentblock\"]/section/div[2]/div/input"));
		selenium.isSelected();

		//Deselect the check box if it's selected:
		WebElement firstEle = driver.findElement(By.xpath("//*[@id="
				+ "\"contentblock\"]/section/div[3]/div[1]/input"));
		if(firstEle.isSelected()) {
			firstEle.click();
		}

		WebElement secondEle=driver.findElement(By.xpath("//*[@id="
				+ "\"contentblock\"]/section/div[3]/div[2]/input"));
		if(secondEle.isSelected()) {
			secondEle.click();
		}
		
		
		
		
		
	}

}
