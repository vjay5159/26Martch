package TESTPackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selinium {

	public static void main(String[] args)
	{
		System.setProperty("webDriver"+"chromeDriver","F:\\selenium-java-4.1.4.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		

	}

}
