package ScrollWindowStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "F:\\selenium-java-4.1.4\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2000));
		WebElement AboutUs = driver.findElement(By.xpath("//a[text()='About us']"));
	    wait.until(ExpectedConditions.visibilityOf(AboutUs));
	    AboutUs.click();
		

	}

}
