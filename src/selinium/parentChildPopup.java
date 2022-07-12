package selinium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parentChildPopup {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\selenium-java-4.1.4\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		String mainPageId = driver.getWindowHandle();
	     System.out.println("main Page Id "+mainPageId);	
	
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		
		Set<String> allPageId = driver.getWindowHandles();
		Iterator<String> it = allPageId.iterator();
		String mainPId = it.next();
		 String childPId = it.next();
		 
		 driver.switchTo().window(childPId);
		 driver.manage().window().maximize();
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Hello");
		 
		/* System.out.println("All Page id"+allPageId);
		 for(String a:allPageId)
		 {
			 System.out.println(a);
			 if(!a.equals(allPageId))
			 {
				 driver.switchTo().window(a);
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("Hello");
			 }
			 
		 }*/
		
		
	
		 

      
	}

}
