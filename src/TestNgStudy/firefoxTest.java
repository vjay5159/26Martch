package TestNgStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class firefoxTest {
  @Test
  public void f()
  {
	  System.setProperty("webdriver.gecko.driver", "F:\\selenium-java-4.1.4\\chromedriver_win32\\geckodriver.exe");
			  //WebDriver driver= new ChromeDriver();
			   WebDriver driver= new FirefoxDriver();
			   driver.manage().window().maximize();
			  driver.get("https://vctcpune.com/selenium/practice.html");
  }
}
