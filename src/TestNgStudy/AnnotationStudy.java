package TestNgStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationStudy {
  @Test(enabled=false)
  public void 	MyMethod() 
  {
	  Reporter.log("UserId",true);
  }
  @Test
  public void fbLogin()
  {
	  Reporter.log("Fb logIN success",true);
  }
  @Test(enabled=true)
  public void kiteLogin()
  {
	  Reporter.log("kite logIN success",true);
  }
  
  @BeforeMethod
  public void loginToKite()
  {
	  Reporter.log("LogIn success",true);
  }
  @BeforeClass
  public void launchBrowser()
  {
	  Reporter.log("Launch browser success",true);
  }
  @AfterMethod
  public void closeBrowser()
  {
	  Reporter.log("Close Browser success",true);
  }
}
