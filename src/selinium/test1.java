package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium-java-4.1.4\\chromedriver_win32\\chromedriver.exe");
		  // System.setProperty("webdriver.chrome.driver","F:\\selenium-java-4.1.4\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/");
	     driver.navigate().to("https://paytm.com/");
//	     Thread.sleep(1000);
//	    driver.navigate().back();
//	    Thread.sleep(1000);
//	   driver.navigate().forward();
//	     driver.navigate().refresh();
//	    
	     String a = driver.getTitle();
	     System.out.println(a);
	     
	     String b = driver.getCurrentUrl();
	     System.out.println(b);
		

	}

}
