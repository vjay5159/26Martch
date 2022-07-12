package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class filpcart {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\selenium-java-4.1.4\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("vkokate1010.vk@gmail.com");
		
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		driver.findElement(By.name("mytext2")).sendKeys("VijayKokate");
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Bhusan");
		
	  	//driver.switchTo().defaultContent();
		//driver.switchTo().parentFrame();
		driver.switchTo().frame(0);
		WebElement a = driver.findElement(By.xpath("//div[@class='F9yp7e ikZYwf G4EHhc']"));
		System.out.println(a.getText());
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame(0);
	 driver.findElement(By.xpath("//div[@class='AB7Lab Id5V1']")).click();
	 
		driver.switchTo().parentFrame();
		driver.switchTo().frame(0);
	 driver.findElement(By.xpath("//div[@class='AB7Lab Id5V1']")).click();
	 
		driver.switchTo().parentFrame();
		driver.switchTo().frame(0);
	  WebElement b = driver.findElement(By.xpath("//div[@class='AB7Lab Id5V1']"));
	  b.click();
		
	//	Select b= new Select(a1);
	  //  b.selectByValue("Hi, I am the UI.Vision IDE");
	
	
		
		
		//driver.switchTo().parentFrame();
		//driver.switchTo().frame(3);
		//driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("Pradeep");
		
		
	//	driver.switchTo().parentFrame();
	//	driver.switchTo().frame(4);
	//	driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("Kshitij");
	}

}
