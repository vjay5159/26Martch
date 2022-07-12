package KiteBase;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

import KiteUtility.UtilityKite;


public class Base 
{
   public static WebDriver driver;
   
	public void openBrowser() throws IOException
	{
	 System.setProperty("webdriver.chrome.driver","F:\\selenium-java-4.1.4\\chromedriver_win32\\chromedriver.exe");
	 ChromeOptions opt= new ChromeOptions();
	 opt.addArguments("--disable-notification");
	 opt.addArguments("incognito");
	 driver= new ChromeDriver(opt);
	 driver.get("https://kite.zerodha.com/");
	 driver.manage().window().maximize();
	 driver.get(UtilityKite.getDatafromPropertiesFile("URL"));
	 Reporter.log("Launch Chrome Browser",true);
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	public void openfirefox() throws IOException
	{
		 System.setProperty("webdriver.gecko.driver","F:\\selenium-java-4.1.4\\chromedriver_win32\\geckodriver.exe");
         driver= new FirefoxDriver();
		 driver.get("https://kite.zerodha.com/");
		 driver.manage().window().maximize();
		 driver.get(UtilityKite.getDatafromPropertiesFile("URL"));
		 Reporter.log("Launch Firefox Browser",true);
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	

}
