package selinium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot2 {

	public static void main(String[] args) throws IOException
	{

		System.setProperty("webdriver.gecko.driver", "F:\\selenium-java-4.1.4\\chromedriver_win32\\geckodriver.exe");
         WebDriver driver= new FirefoxDriver();
         driver.manage().window().maximize();
         driver.get("https://www.google.com/");
         
         File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         File dst=new File("F:\\screenshot\\image.png");
         FileHandler.copy(scr, dst);
	}

}
