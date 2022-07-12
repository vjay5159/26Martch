package selinium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\selenium-java-4.1.4\\chromedriver_win32\\chromedriver.exe");
         WebDriver driver= new ChromeDriver();
         driver.manage().window().maximize();
       //  driver.get("https://www.facebook.com/");
         Thread.sleep(2000);
        // File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        // File dest= new File("C:\\Users\\Ajay Bharat Kokate\\Desktop\\New folder\\facebokk.png");
         
       //  FileHandler.copy(source, dest);
         
         
         driver.get("https://www.google.com/intl/en-GB/gmail/about/");
         Thread.sleep(2000);
         File source1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         File dest1= new File("C:\\Users\\Ajay Bharat Kokate\\Desktop\\Sc.jpg");
         
         FileHandler.copy(source1, dest1);
	}

}
