
package KiteTest;

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

import KiteBase.Base;
import KitePOM.kiteLoginPage1;
import KiteUtility.UtilityKite;
import TestNGPOM.kiteHomePage3;
import TestNGPOM.kiteLogInPage1;
import TestNGPOM.kitePinPage2;



//@Listeners(KiteUtility.Listnear.class)
public class TestClassLIs extends Base
{
	kiteLoginPage1 login;
	kitePinPage2 pin;
	kiteHomePage3 Home;
	//String TCID="5159";
	
 //@Parameters("BrowserName")
  @BeforeClass
  public void launchBrowser( String name) throws IOException 
  {
   if(name.equalsIgnoreCase("chrome"))
   {
	 openBrowser();
   }
   else if(name.equalsIgnoreCase("firefox"))
   {
	  openfirefox();  
   }
	 login = new kiteLoginPage1(driver);
	 pin = new kitePinPage2(driver);
	 Home = new kiteHomePage3(driver);
  }
  @BeforeMethod
  public void logIntoKiteApp() throws EncryptedDocumentException, IOException
  {
	  login.SendUserId(UtilityKite.ReadfromExcel(3, 1));
	  login.sendPwd(UtilityKite.ReadfromExcel(4,1));
	//  login.SendUserId(UtilityKite.getDatafromPropertiesFile("UN"));
	//  login.sendPwd(UtilityKite.getDatafromPropertiesFile("PWD"));
	  login.loginButton();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	  pin.sendPin(UtilityKite.ReadfromExcel(5, 1));
	//  pin.sendPin(UtilityKite.getDatafromPropertiesFile("PIN"));
	  pin.ClickOncontinueButton();
	  Reporter.log("Login succesful ",true);
  }
  @Test
  public void validateUserID() throws EncryptedDocumentException, IOException, InterruptedException
  {
	  Assert.assertEquals(Home.ActualUName(),UtilityKite.ReadfromExcel(3,1),"Actual and Excepted are not matching TC is failed");
	//  Assert.assertEquals(Home.ActualUName(), UtilityKite.getDatafromPropertiesFile("UN"));
	//  ScreenShot(TCID);
	 // Assert.fail();
	  Thread.sleep(2000);
  }
  @AfterMethod
  public void LogoutKite() throws InterruptedException
  {
	  //Home.LogOut();
	  //Reporter.log("Logging out...");
  }
  @AfterClass
  public void closeBrowser()
  {
	 driver.close();
	 Reporter.log("Browser Closed... ");
  }
}

