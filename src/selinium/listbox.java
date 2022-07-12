package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "F:\\selenium-java-4.1.4\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		// WebElement listbox = driver.findElement(By.xpath("//a[@data-toggle='dropdown']"));
	//	listbox.click();
		//driver.findElement(By.xpath("//a[text()='Flash Movie Demo']")).click();
		
		WebElement listbox = driver.findElement(By.name("country"));
		//listbox.click();
		
		Select a = new Select(listbox);
		//a.deselectByIndex(10);
		//a.selectByValue("India");
		a.selectByVisibleText("INDIA");
		
		
		

	}

}
