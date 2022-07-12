package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElementStudy {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium-java-4.1.4\\chromedriver_win32\\chromedriver.exe");
        WebDriver d = new ChromeDriver();
        d.get("https://vctcpune.com/selenium/practice.html");
        d.findElement(By.xpath("//input[@id='displayed-text']")).sendKeys("Velocity");
        Thread.sleep(1000);
        d.findElement(By.xpath("//input[@id='displayed-text']")).clear();
        
	}

}
