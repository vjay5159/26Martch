package selinium;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setSizeAndPosition {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\selenium-java-4.1.4\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://facebook.com/");
		
		Thread.sleep(1000);
		System.out.println(driver.manage().window().getPosition());
		//to set position we need to create object of point class and X and Y coordinate
		
        Point p= new Point(200, 10);
        //  using SetPoistion method we can set the browser position
		driver.manage().window().setPosition(null);
		
		//Dimension d = new Dimension(1000, 500);
		//driver.manage().window().setSize(d);
	}

}
