package TestNgStudy;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class seriesParllel1 {
  @Test
  public void f() 
  {	  System.setProperty("webdriver.chrome.driver", "F:\\selenium-java-4.1.4\\chromedriver_win32\\chromedriver.exe");

			  RemoteWebDriver driver= new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.get("https://www.google.co.in/");
  }
}
