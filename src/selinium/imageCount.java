package selinium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class imageCount {

	public static void main(String[] args) throws InterruptedException
	{
	   System.setProperty("webdriver.chrome.driver", "F:\\\\selenium-java-4.1.4\\\\chromedriver_win32\\\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   
	  // driver.get("https://www.google.com/");
	   
	   //  driver.findElement(By.xpath("//input[@name='q']")).sendKeys("disha patani");
	    // driver.findElement(By.xpath("//button[text()='No thanks']")).click();
	   //  Thread.sleep(2000);
	   //   driver.findElement(By.xpath("(//div[@class='pcTkSc'])[1]")).click();
	   //   Thread.sleep(2000);
	     // driver.findElement(By.xpath("//a[@data-hveid='CAIQAw']")).click();
	     // Thread.sleep(2000);
	      // List<WebElement> count = driver.findElements(By.tagName("img"));
	       //.click();
	       // System.out.println(count.size());
	       
	      
	   //   Thread.sleep(1000);
	     //ArrayList a= new ArrayList();
	        
	        driver.get("https://www.myntra.com");
	        
	        List<WebElement> count = driver.findElements(By.tagName("img"));
	        System.out.println(count.size());
	        
	       driver.navigate().to("https://www.amazone.com/");
	       driver.findElements(By.tagName("img"));
	        
	        
	}

}
