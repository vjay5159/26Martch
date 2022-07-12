package selinium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pract1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\\\selenium-java-4.1.4\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\www.w3schools.com/css/css_tooltip.asp");
		
		String mainPId = driver.getWindowHandle();
		System.out.println(mainPId);
		System.out.println("----------------------");
		driver.findElement(By.xpath("//a[text()='Try it Yourself »']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='Try it Yourself »']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='Try it Yourself »']")).click();
        
      
        
        Set<String> multyId = driver.getWindowHandles();
        
        for(String a:multyId)
        {
        	System.out.println(a);
        	
        	if(a.equals(multyId))
        	{
        		driver.switchTo().window(a);
        		Thread.sleep(1000);
        		driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
        		
        	}
        }
        
        driver.getTitle();
        System.out.println(driver.getTitle());
        
        
	}

}
