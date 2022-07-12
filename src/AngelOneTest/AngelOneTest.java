package AngelOneTest;

import java.io.IOException;

import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import AngelOneBase.Base;
import AngleOneTestNg.AngleOneHomePage2;
import AngleOneTestNg.AngleOneLogin1;
import AngleOneUtility.Utility;

public class AngelOneTest extends Base {
	AngleOneLogin1 login;
	AngleOneHomePage2 Home;
	String TICT="5159";
  @Parameters("BrowserName")
  @BeforeClass
  public void LaunchBrowser(@Optional String name)
  {
	 if(name.equals("Chrome"))
	 {
		 Openchrome();
	 }
	 else if(name.equals("Firefox"))
	 {
		 openfirefox();
	 }
	  login = new AngleOneLogin1(driver);
	  Home = new AngleOneHomePage2(driver);
	//  Screenshot(TICT);
  }
  
  @BeforeMethod
  public void LogInInAngleOne() throws EncryptedDocumentException, IOException
  {
	//  login.sendUserid(Utility.readfromExcle(10, 1));
	  //login.sendPassword(Utility.readfromExcle(11, 1));
	  login.sendUserid(Utility.getDatafromPropertiesFile("UN1"));
	  login.sendPassword("PWD1");
	  login.clickLogin();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	 
	//  Screenshot(TICT);
	  //Assert.fail();
  }
  @Test
  public void validateUserid() throws EncryptedDocumentException, IOException
  {
	  Assert.assertEquals(Home.ActualUname(), Utility.getDatafromPropertiesFile("UN1"),"Actual and Expected User name are matched TC is passed");
	  Reporter.log("Actual and Excepted User name are matched Tc is passed",true);
	 // Screenshot(TICT);
	 // Assert.fail();
  }
  @AfterMethod
  public void LogoutFromAngleOne() throws InterruptedException, IOException
  {
	  Home.clikonPoup();
	 // Screenshot(TICT);
	Thread.sleep(5000);
	  Home.clickOnlogout();
	  Reporter.log("Logging out...",true);
	  //Screenshot(TICT);
  }
 // @AfterClass
 // public void CloseBrowser()
  //{
	 // driver.close();
//  }
  
}
