package seleniumPrograms3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1WorkingWithLinks {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/"
				+ "sjebamalai/chromeDriver/chromedriver");
		WebDriver driver = new ChromeDriver();

		/* when we use get method we can't go forward and back ward
		and refresh. if you use navigate().to() method then we
		use forward, backward and refresh.*/
		driver.navigate().to("http://www.leafground.com/pages/"
				+ "Link.html");

		// click go to home page link and come back again.
		WebElement homeLink = driver.findElement(By.linkText("Go "
				+ "to Home Page"));

		homeLink.click();
		driver.navigate().back();

		// href attribute always refers which page it should go next
		WebElement whereToGo = driver.findElement(By.
				partialLinkText("Find where am"));

		String where = whereToGo.getAttribute("href");
		System.out.println(where);

		//verify the "i am broken link"
		WebElement brokenLink = driver.findElement(By.xpath(""
				+ "//a[text()='Verify am I broken?']"));

		brokenLink.click();
		Thread.sleep(3000);
		String title = driver.getTitle();
		if(title.contains("404")) {
			System.out.println("the given link is broken");
		}

		driver.navigate().back();

		/*again verify the fourth link go to home page(interact with
		the same link name)*/
		/*same home page link but cannot reuse the above "homeLink"
		 .if we use the same variable then we will get the"
		 "stale element reference exception".so we have to write 
		 the homeLink webelement again.*/

		WebElement homeLink1 = driver.findElement(By.linkText("Go "
				+ "to Home Page"));

		homeLink1.click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		List<WebElement> noOfLinks = driver.findElements(By.
										tagName("a"));
		Thread.sleep(3000);
		int a = noOfLinks.size();
		System.out.println(a);


		driver.quit();

	}

}
