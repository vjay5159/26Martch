package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {

	public static void main(String[] args)
	{
	       System.setProperty("webdriver.chrome.driver","F:\\selenium-java-4.1.4\\chromedriver_win32\\chromedriver.exe");
	       System.setProperty("webdriver.chrome.driver","F:\\selenium-java-4.1.4\\chromedriver_win32\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://vctcpune.com/selenium/practice.html");
	       driver.manage().window().maximize();
	       driver.findElement(By.xpath("//a[@href='#' and text()='Velocity Corporate Training Center']"));
	       driver.findElement(By.xpath("//a[@href='https://vctcpune.com/']")).click();
	       driver.navigate().back();
	       driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Vijay");

	}

}
