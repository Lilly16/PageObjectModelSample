package test2NG2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Ex1DataProviderFromExcel {

	WebDriver driver;
	 //CSVReader csvReader;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "/Users/sjebamalai/chromeDriver/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/"
				+ "index.php/auth/validateCredentials");
	}

	@Test(dataProvider="loginData")
	public void login(String uName,String passWord) {



		WebElement username = driver.findElement(By.cssSelector(
				"input[id='txtUsername']"));
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.cssSelector("input[id='txt"
				+ "Password']"));
		password.sendKeys("admin123");
		WebElement login = driver.findElement(By.cssSelector("input"
				+ "[id='btnLogin']"));
		login.click();

	}

	@AfterTest 
	public void afterTest() {
		//driver.quit(); 
	}


	String [][] data=null;
	

	@DataProvider(name="loginData")
	public String[][] loginDataProvider() throws BiffException, IOException {
		data = getExcelData();
		return data;
	}

	public String[][] getExcelData() throws BiffException, IOException {
		//csvReader = new CSVReader(new FileReader("/Users/sjebamalai/Documents/username.csv");
		FileInputStream file = new FileInputStream("/Users/sjebamalai/Documents/username.csv");
		Workbook workbook = Workbook.getWorkbook(file);
		Sheet sheet = workbook.getSheet(0);
		int rowcount = sheet.getRows();
		int columncount = sheet.getColumns();

		String testData[][] = new String[rowcount][columncount];
		for(int i=1;i<rowcount;i++) {
			for(int j=0;j<columncount;j++) {
				testData[i-1][j] = sheet.getCell(i,j).getContents();
			}
		}
		return testData;
	}






}
