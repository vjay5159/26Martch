package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyBoardAction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\\\selenium-java-4.1.4\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		WebElement textBox = driver.findElement(By.id("autocomplete"));
		Actions act = new Actions(driver);
		act.sendKeys(textBox,"Good Morning").perform();
		
		//select dropDown BY using action class
		WebElement dropdown = driver.findElement(By.name("dropdown-class-example"));
		
		act.click(dropdown).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		
		

	}

}
