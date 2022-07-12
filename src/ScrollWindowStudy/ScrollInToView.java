package ScrollWindowStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollInToView {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium-java-4.1.4\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		WebElement practice = driver.findElement(By.xpath("//a[@class='et_pb_button et_pb_button_0 et_pb_bg_layout_light']"));
		JavascriptExecutor e=((JavascriptExecutor)driver);
		Thread.sleep(5500);
		e.executeScript("arguments[0].scrollIntoView(true);",practice);
		
		Thread.sleep(5000);
		WebElement chinchwad = driver.findElement(By.xpath("//h1[@style='text-align: center;']"));
		JavascriptExecutor a =((JavascriptExecutor)driver);
         a.executeScript("argument[0].scrollIntoView(true);",chinchwad);
	}

}
