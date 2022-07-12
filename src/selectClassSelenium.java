import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class selectClassSelenium {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","F:\\\\selenium-java-4.1.4\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement Moblie = driver.findElement(By.xpath("(//div[@class='xtXmba'])[4]"));
		WebElement MenFootwear = driver.findElement(By.xpath("//div[text()='Men Footwear']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(Moblie).moveToElement(MenFootwear).perform();
		//act.click(Men Footware);
		

	}

}
