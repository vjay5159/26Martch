package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testSelenium {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","F:\\selenium-java-4.1.4\\chromedriver_win32.Chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","F:\\selenium-java-4.1.4\\chromedriver_win32\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
    	String f=driver.findElement(By.xpath("//h1[text()='Frames Examples in Selenium Webdriver']")).getText();
    	System.out.println(f);
    	Thread.sleep(2000);
    	
    	String t = driver.findElement(By.xpath("//label[@style='font-size:40px']")).getText();
    	System.out.println(t);
    	Thread.sleep(1000);
    	
    	driver.switchTo().frame(0);
    	driver.findElement(By.xpath("(//input)[1]")).sendKeys("vijay kokate");
    	
    	driver.switchTo().frame("frame3");
    	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
    	
    	driver.switchTo().defaultContent();
        driver.switchTo().parentFrame();
    	driver.switchTo().frame("frame2");
    	WebElement listbox = driver.findElement(By.id("animals"));
    	Select s= new Select(listbox);
    	
    	s.selectByIndex(1);
    	
    	
    	

	}

}
