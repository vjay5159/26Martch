package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kite_endToend {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium-java-4.1.4\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		WebElement UI = driver.findElement(By.xpath("//input[@id='userid']"));
		WebElement PWD = driver.findElement(By.xpath("//input[@id='password']"));
		WebElement logIn = driver.findElement(By.xpath("//button[@type='submit']"));
		
		UI.sendKeys("ELR321");
		PWD.sendKeys("Dhana1111");
		logIn.click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("pin")).sendKeys("982278");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2500);
		WebElement UserName = driver.findElement(By.xpath("//span[text()='ELR321']"));
		UserName.click();
		String actualUI = UserName.getText();
		String ExpectedUI="ELR321";
		
		if(actualUI.equals(ExpectedUI))
		{
			System.out.println("Test case pass");
		}
		else
		{
			System.out.println("Test case fail");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@target='_self']")).click();
		Thread.sleep(1000);
	    driver.close();
		
		

	}

}
