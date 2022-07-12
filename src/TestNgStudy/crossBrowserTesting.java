package TestNgStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossBrowserTesting {
	  @Parameters("browserName")
  @Test
  public void crossBrowser(String browserName) throws InterruptedException 
  {
	
	  WebDriver driver=null;
	  
	  if(browserName.equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "F:\\selenium-java-4.1.4\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  
	  }
	  else if(browserName.equals("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver", "F:\\selenium-java-4.1.4\\chromedriver_win32\\geckodriver.exe");
		  driver = new FirefoxDriver();
		  driver.manage().window().maximize();  
	  }
	  
	  driver.get("https://kite.zerodha.com/");
	// driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  Thread.sleep(5000);
  }
}
