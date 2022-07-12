package selinium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\\\selenium-java-4.1.4\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        driver.findElement(By.name("q")).sendKeys("Samsung");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
       // Thread.sleep(1000);
     
        
    
        WebElement ReviewPrint = driver.findElement(By.xpath("((//div[@class='col col-7-12'])[1]//span)[6]"));
       // ReviewPrint.getText();
	}

}
