package selinium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropDown_Action {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\selenium-java-4.1.4\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement source = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement Dest   = driver.findElement(By.id("amt8"));
		
	    Actions act = new Actions(driver);
		
		act.moveToElement(source).clickAndHold().moveToElement(Dest).release().build().perform();
		Thread.sleep(5000);
		WebElement source1 = driver.findElement(By.xpath("//ol[@id='loan']"));
		WebElement dest1 = driver.findElement(By.xpath("//a[text()=' LOAN ']"));
		act.moveToElement(source1).clickAndHold().moveToElement(dest1).release().build().perform();
		
		
	}

}
