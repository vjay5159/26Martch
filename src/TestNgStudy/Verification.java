package TestNgStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Verification {
  @Test
  public void Verificationstudy() throws InterruptedException
  {
	  System.setProperty("webdriver.gecko.driver", "F:\\selenium-java-4.1.4\\chromedriver_win32\\geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  
	 
	  driver.get("https://vctcpune.com/selenium/practice.html");
	  Thread.sleep(1000);
	  WebElement RadioButton2 = driver.findElement(By.xpath("//input[@value='Radio2']"));
	  
	  if(RadioButton2.isSelected())
	  {
	    Reporter.log("Radio Button 2 is selected",true);
	  }
	  else {
	    Reporter.log("Radio Button 2 is not selected",true);
		  }
	  
	Assert.assertTrue(RadioButton2.isSelected(), "Radio button is not selected TC is fail");
  }
}
