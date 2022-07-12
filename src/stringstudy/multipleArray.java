package stringstudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleArray {

	public static void main(String[] args)
	{
	  
	 
		   System.setProperty("webdriver.chrome.driver","F:\\selenium-java-4.1.4\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		   driver.get("https://mail.google.com/");
		   driver.get("https://www.cricbuzz.com/");
	 

	}

}
