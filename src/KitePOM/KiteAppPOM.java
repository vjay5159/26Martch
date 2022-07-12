package KitePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteAppPOM {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\selenium-java-4.1.4\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
        
		kiteLoginPage1 kp = new kiteLoginPage1(driver);
		kp.userName();
		kp.PWD();
		kp.loginButton();
		
		Thread.sleep(1000);
		kitePinPage2 pp= new kitePinPage2(driver);
		pp.pin();
		pp.CButton();
		
	}

}
