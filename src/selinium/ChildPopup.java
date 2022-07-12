package selinium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopup {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\selenium-java-4.1.4\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		String mainPageId = driver.getWindowHandle();//id of main page
		System.out.println(mainPageId);
		
		
		driver.findElement(By.name("NewWindow")).click();
	
		driver.manage().window().maximize();
		
	    Set<String> allPageIDs = driver.getWindowHandles();
		Iterator<String>it=allPageIDs.iterator();
		//while (it.hasNext())
	//	{
		//	System.out.println(it.next());
		//}
		
		
		String mainPageId1=it.next();
		String childPageId=it.next();
		
		driver.switchTo().window(childPageId);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])")).sendKeys("vijay");
	
		

//		driver.switchTo().window(mainPageId1);
	//	WebElement myElement = driver.findElement(By.xpath("text()='Click below to download a file'"));
		//System.out.println(myElement.getText());

	}

}
