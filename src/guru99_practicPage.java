import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class guru99_practicPage {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "F:\\\\selenium-java-4.1.4\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/access_popup.php?uid=mngr82166%20&%20pass=ApepYrE%20&%20email=vkokate1010.vk@gmail.com");
		WebElement selenium =driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));//.click();
		
        Actions asc = new Actions(driver);
        
        asc.moveToElement(selenium).click().build().perform();
	}

}
