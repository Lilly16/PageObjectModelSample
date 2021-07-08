import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

/* 	I am before Suite
	I am before Test 
	I am before Class 
	I am before method
	I am test
	I am after method
	I am after Class 
	I am after Test */
/* Suppose if you're having two tests you will get results like this
 	I am before Suite
	I am before Test 
	I am before Class 
	I am before method
	I am test
	I am after method
	I am before method
	I am test 2
	I am after method
	I am after Class 
	I am after Test 
 */

public class Ex9AnnotationsHierachy {
  @Test
  public void test() {
	  System.out.println("I am test");
  }
  @Test
  public void test1() {
	  System.out.println("I am test 2");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I am before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I am after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("I am before Class ");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("I am after Class ");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("I am before Test ");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("I am after Test ");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("I am before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("I am after Suite");
  }

}
