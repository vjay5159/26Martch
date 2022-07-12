package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class webelementMethod {

	public static void main(String[] args) throws InterruptedException
	{
	  System.setProperty("webdriver.chrome.driver","F:\\selenium-java-4.1.4\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://vctcpune.com/selenium/practice.html");
	  Thread.sleep(5000);
	  driver.findElement(By.name("dropdown-class-example")).click();
	 
	WebElement listBox = null;
	Select s=new Select(listBox);
	s.selectByValue("Option3");
	}

}
