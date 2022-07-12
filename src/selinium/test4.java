package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test4 {

	private static WebElement listBox;

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\selenium-java-4.1.4\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		WebElement listBox = driver.findElement(By.name("dropdown-class-example"));
	
	
		Select s= new Select(listBox);
		s.selectByVisibleText("Option3");
		Thread.sleep(2000);
		s.selectByVisibleText("Option2");
        Thread.sleep(5000);
        s.selectByIndex(1);
        
	}

}
