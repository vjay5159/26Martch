package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium-java-4.1.4\\chromedriver_win32\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(2000);
		
		//driver.switchTo().frame("iframeResult");
		//driver.findElement(By.xpath("//button[@type='button']")).click();
        
		
	
		//driver.get("https://skpatro.github.io/demo/iframes/");
		//driver.switchTo().frame("Frame1");
		String text = driver.findElement(By.id("frametext")).getText();
		System.out.println(text);
		
		String test1 = driver.findElement(By.xpath("//p[text()='I am inside Frame']")).getText();
		System.out.println(test1);
	}

	
}
