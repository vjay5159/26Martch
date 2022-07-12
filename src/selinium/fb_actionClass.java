package selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class fb_actionClass {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium-java-4.1.4\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://facebook.com//");
	    Thread.sleep(2000);
		WebElement a = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		a.click();
		Thread.sleep(3000);
		  WebElement day = driver.findElement(By.id("day"));
		  Actions act  =new Actions(driver);
		 // act.click(day).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		  act.click(day).perform();
		 for(int i=1; i<=5;i++)
		  {
			  act.sendKeys(Keys.ARROW_DOWN).perform();
			  Thread.sleep(200);
		  }
            act.sendKeys(Keys.ENTER).perform();
	}

}
