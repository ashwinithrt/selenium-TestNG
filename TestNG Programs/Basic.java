/*what is haierarchy?
 * before suit
 * before Test
 * before class
 * before method
 * test1
 * after method
 * before method
 * test2
 * after method
 * after class
 * after Test
 * after suit
 */


package TestNG_Program;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Basic {
  @Test
  public void f() {
	  System.out.println("First method");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod execute before each test(f) method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod execute after each test(f) method");
  }
  

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass execute before 1st  method");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass execute after last method");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest execute before test method");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest execute after all test method");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforeSuite execute before all method");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("afterSuite execute after all method");
  }

}
