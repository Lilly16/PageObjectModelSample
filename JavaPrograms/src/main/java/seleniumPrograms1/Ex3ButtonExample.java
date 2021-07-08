package seleniumPrograms1;



import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3ButtonExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
		"/Users/sjebamalai/chromeDriver/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
		
		//Click Home page 
		WebElement home=driver.findElement(By.xpath("//div[@id='"
				+ "contentblock']/section/div[1]/div/div/a"));
		home.click();
		
		// click the Button:
		WebElement button=driver.findElement(By.xpath("//div[@id='"
				+ "content']/div[1]/div[2]/div/ul/li[2]/a/h5"));
		button.click();
		
		//Get Position of X and Y co-ordinates
		WebElement getPosition=driver.findElement(By.cssSelector(""
				+ "#position"));
		Point value=getPosition.getLocation();
		int xValue=value.getX();
		int yValue=value.getY();
		System.out.println("X value is: "+xValue);
		System.out.println("Y value is: "+xValue);
		
		//Find the color of the backround:
		WebElement buttonColor=driver.findElement(By.cssSelector("#color"));
		String color=buttonColor.getCssValue("background-color");
		System.out.println(color);
		
		//Find Height and width 
		WebElement size=driver.findElement(By.cssSelector("button[id='size']"));
		int height=size.getSize().getHeight();
		int width=size.getSize().getWidth();
		System.out.println("Height is: "+ height+" Weight is: "+ width);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
