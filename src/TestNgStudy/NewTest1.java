package TestNgStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void test() 
  {
	  Reporter.log("User ID validated",true);
  }
  @Test
  public void test1()
  {
	  Reporter.log("Login facebook",true);
  }
  @BeforeMethod
  public void LogInToKite()
  
  {
	  Reporter.log("Log in successful",true);
  }
  @BeforeClass
  public void launchBrower()
  {
	  Reporter.log("Launch browser successful",true);
  }
  
  @AfterMethod
  public void logOutToKite()
  {
	  Reporter.log("LogOut Successful",true);
  }
  @AfterClass
  public void closeBrowser()
  {
	  Reporter.log("Close Browser successful",true);
  }
}
