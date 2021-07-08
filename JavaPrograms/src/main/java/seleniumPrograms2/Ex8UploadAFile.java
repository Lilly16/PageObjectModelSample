package seleniumPrograms2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex8UploadAFile {

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/"
				+ "sjebamalai/chromeDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/upload.html");
		
		WebElement upLoadFile = driver.findElement(By.cssSelector("input"
				+ "[name='filename']"));
												
		upLoadFile.click();
		///Users/sjebamalai/Downloads/chromedriver
		
		// this is where our file is in our download
		String file = "/Users/sjebamalai/Downloads/chromedriver";
		
		/* StringSelection class will useful for, it will give
		sting to file to like a normal text */
		StringSelection selection = new StringSelection(file);
		
		Toolkit.getDefaultToolkit().getSystemClipboard()
		.setContents(selection, null);
		
		/* Now Robot class is used for keyboard action, normally
		Actions class is used for keyboard and mouse operations but 
		it is appt for webbased applications. so for windows based 
		keyboard actions we can use "Robot class".that's what here 
		we are using Robot class. */
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
