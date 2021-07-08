package seleniumPrograms2;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex7HowToDownloadAFile {

	public static void main(String[] args) {
		
	//selenium is capable of doing only web applications.
		
		System.setProperty("webdriver.chrome.driver", "/Users/"
				+ "sjebamalai/chromeDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/download.html");
		
		WebElement down = driver.findElement(By.xpath("//a[text()='Download Excel']"));
		down.click();
		
		File file = new File("/Users/sjebamalai/Downloads");
		
		File[] totalFiles = file.listFiles();
		
		for(File actualFile:totalFiles) {
			if(actualFile.getName().equals("testleaf (1).xlsx")) {
				System.out.println("the actual file found");
				break;
			}
		}
		
		
		
		
		
	}

}
