package TestNgStudy;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void KiteLogIN()
  {
	  System.setProperty("webdriver.chrome.driver", "F:\\selenium-java-4.1.4\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("htttp://kite.zerodha.com/");
	//  Reporter.log("hello",true);
  }
  @Test
  public void method()
  {
	  System.setProperty("webdriver.chrome.driver", "F:\\selenium-java-4.1.4\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("htttp://vctcpune.com/");
	  
  }
  @BeforeMethod
  public void loginToKiteApp()
  {
	  Reporter.log("Login Success",true);
  }
  @BeforeMethod
  public void velocity()
  {
	  Reporter.log("Open browser fail",false);
  }
}
