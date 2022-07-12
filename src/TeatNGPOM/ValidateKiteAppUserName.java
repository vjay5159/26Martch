package TeatNGPOM;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestNGPOM.kiteHomePage3;
import TestNGPOM.kiteLogInPage1;
import TestNGPOM.kitePinPage2;

public class ValidateKiteAppUserName {
	  WebDriver driver;
	  Sheet Mysheet;
	  kiteLogInPage1 logIn;
	  kitePinPage2 pin;
	  kiteHomePage3 Home;
  @BeforeClass
  public void LaunchBrowser() throws EncryptedDocumentException, IOException 
  {
	System.setProperty("webdriver.chrome.driver", "F:\\selenium-java-4.1.4\\chromedriver_win32\\chromedriver.exe");
    ChromeOptions opt = new ChromeOptions();
    opt.addArguments("incognito");
    driver = new ChromeDriver(opt);
    driver.get("https://kite.zerodha.com/");
    Reporter.log("Launching Browser",true);
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
    
    File Myfile = new File("C:\\Users\\Ajay Bharat Kokate\\Desktop\\Bool1.xlsx");
    
   Mysheet= WorkbookFactory.create(Myfile).getSheet("Sheet1");
   
   logIn = new kiteLogInPage1(driver);
   pin = new kitePinPage2(driver);
   Home = new kiteHomePage3(driver);  
  }
  @BeforeMethod
  public void LogInkiteApp()
  {
	  String UN = Mysheet.getRow(3).getCell(1).getStringCellValue();
	  String PWD = Mysheet.getRow(4).getCell(1).getStringCellValue();
	  String PIN = Mysheet.getRow(5).getCell(1).getStringCellValue();
	  
	  logIn.SendUserId(UN);
	  Reporter.log("Sending Userid",true);
	  logIn.sendPwd(PWD);
	  Reporter.log("Sending Password",true);
	  logIn.click();
	  Reporter.log("Clicking On login button",true);
	  
	  
	  pin.sendPin(PIN);
	  Reporter.log("Sending pin",true);
	  pin.ClickOncontinueButton();
	  Reporter.log("Clicking on continue button",true);
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));  
  }
  @Test
  public void validateUserName()
  {
	  String expectedUserId = Mysheet.getRow(3).getCell(1).getStringCellValue();
	  String actualUserName = Home.ActualUName();
	  Reporter.log("Validating User name",true);
	  Assert.assertEquals(actualUserName,expectedUserId, "Actual and Expected User name are not match TC failed");
	  Reporter.log("Actual and Expected user name are matched TC is passed",true);
  }
  @AfterClass
  public void LogOutFromKiteApp() throws InterruptedException
  {
	  Home.LogOut();
	  Reporter.log("Logging Out...",true);
  }
  @AfterMethod
  public void closeBrowser() throws InterruptedException
  {
	  Thread.sleep(2000);
	  Reporter.log("Browser Closed",true);
	  driver.close();
  }
}
