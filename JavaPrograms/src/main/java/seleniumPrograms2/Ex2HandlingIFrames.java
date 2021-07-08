package seleniumPrograms2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2HandlingIFrames {

	public static void main(String[] args) {
		/* 1.if u want to get the value of "in between tag" 
		 use getText() method.
		 2. if you want to get the value of inside the tag, but it
		 is in parameter (or) attribute use getAttribute() method*/
		
		System.setProperty("webdriver.chrome.driver", "/Users/"
				+ "sjebamalai/chromeDriver/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		
		// switching to first frame so we can say frame(0)
		driver.switchTo().frame(0);
		WebElement fstframe = driver.findElement(By.cssSelector(""
				+ "button[id='Click']"));
		fstframe.click();
		String text=fstframe.getText();
		System.out.println(text);
		
		// before we've switch to default frame
		driver.switchTo().defaultContent();
		
		// switching nested frame ie) frame -> frame-> frame->
		driver.switchTo().frame(1);
		// now switching to a frame inside another frame
		driver.switchTo().frame("frame2");
		WebElement secClick = driver.findElement(By.id("Click1"));
		secClick.click();
		
		driver.switchTo().defaultContent();
		
		// find number of frames in this page
		
		/*List<WebElement> noOfFrames = driver.findElements(By.
		id("wrapframe"));*/
		
		//We can use "tag name" to find number of frames  
		List<WebElement> noOfFrames = driver.findElements(By.
				tagName("iframe"));
		int size = noOfFrames.size();
		System.out.println(size);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
