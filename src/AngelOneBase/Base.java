package AngelOneBase;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;
import org.testng.annotations.Optional;

import net.bytebuddy.utility.RandomString;

public class Base
{
  protected WebDriver driver;
  
 public void Openchrome()
  {
	  System.setProperty("webdriver.chrome.driver","F:\\selenium-java-4.1.4\\chromedriver_win32\\chromedriver.exe");
	  ChromeOptions opt= new ChromeOptions();
	  opt.addArguments("--disable-notification");
	  opt.addArguments("incognito");
	  driver = new ChromeDriver();
	  driver.get("https://trade.angelbroking.com/login/");
	  driver.manage().window().maximize();
	  Reporter.log("LaunchChromeBrowser",true); 
  }
  public void openfirefox()
  {
	  System.setProperty("webdriver.gecko.driver","F:\\selenium-java-4.1.4\\chromedriver_win32\\geckodriver.exe");
	  ChromeOptions opt= new ChromeOptions();
	  opt.addArguments("--disable-notification");
	  opt.addArguments("incognito");
	  driver = new FirefoxDriver();
	  driver.get("https://trade.angelbroking.com/login/");
	  driver.manage().window().maximize();
	  Reporter.log("LaunchFirefoxBrowser",true);   
  }

  public void Screenshot(String name) throws IOException
  {
	  String rmd=RandomString.make(3);
	  File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  File dist =new  File("F:\\screenshot\\image"+name+"_"+rmd+".png");
	  FileHandler.copy(source, dist);
	  Reporter.log("Screenshot",true);
  }
}
