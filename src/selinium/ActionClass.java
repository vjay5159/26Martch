package selinium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium-java-4.1.4\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement seliniumButtion = driver.findElement(By.linkText("Selenium"));
		Actions act =new Actions(driver);
		//act.moveToElement(seliniumButtion).perform();
		//act.click().perform();
		
		
		//act.moveToElement(seliniumButtion).click().perform();
		//act.click(seliniumButtion).perform();
		
		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));

		act.moveToElement(rightClick).contextClick().build().perform();
		
		
		//WebElement doubleClickButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		//act.moveToElement(doubleClickButton).perform();
		//act.moveToElement(doubleClickButton).doubleClick().build().perform();
		
         Thread.sleep(2000);
         
         
        // Alert alt = driver.switchTo().alert();
         //alt.accept();
	}

}
