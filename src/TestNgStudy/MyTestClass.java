package TestNgStudy;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class MyTestClass {
  @Test
  public void method()
  {
	  Reporter.log("UserId Validate",true);
	  
  }
  @BeforeMethod
  public void Method1() 
  {
	  Reporter.log("Login successful",true);
  }

  @AfterMethod
  public void afterMethod()
  {
	  Reporter.log("Loging out....",true);
  }

  @AfterClass
  public void afterClass()
  {
	  Reporter.log("Close browser",true);
  }

 
}
