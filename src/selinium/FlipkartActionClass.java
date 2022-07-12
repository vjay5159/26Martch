package selinium;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class FlipkartActionClass {

	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","F:\\selenium-java-4.1.4\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
	//WebElement moveOnTab = driver.findElement(By.linkText("Mobiles"));
	Actions act = new Actions(driver);
//	act.moveToElement(moveOnTab);
	
	WebElement fashion = driver.findElement(By.xpath("(//div[@class='xtXmba'])[4]"));
	
	act.moveToElement(fashion).perform();
      
	}

}
