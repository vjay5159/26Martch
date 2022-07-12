package ScrollWindowStudy;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplictWait {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium-java-4.1.4\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","F:\\selenium-java-4.1.4\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://vctcpune.com/");
        
       // Thread.sleep(1000);
     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
    // driver.close();
     
     
	}

}
