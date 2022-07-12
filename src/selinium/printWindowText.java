package selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printWindowText {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium-java-4.1.4\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com/");
		 driver.findElement(By.name("q")).sendKeys("Dish Patani");
		  List<WebElement> output = driver.findElements(By.xpath("//ul[@class='erkvQe']"));
		  for(WebElement a:output)
		  {
			  System.out.println(a.getText());
		  }

	}

}
