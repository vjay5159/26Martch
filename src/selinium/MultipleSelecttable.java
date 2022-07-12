package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelecttable {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\selenium-java-4.1.4\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");
        Thread.sleep(2000);
        driver.findElement(By.name("cars"));
        WebElement MultipleSelectElement = driver.findElement(By.name("cars"));
        Select s= new Select(MultipleSelectElement);
        System.out.println("MultipleSelectElement is "+s.isMultiple());
        s.selectByVisibleText("Volvo");
        Thread.sleep(100);
        s.selectByValue("saab");
        Thread.sleep(200);
        s.selectByIndex(3);
        
        //Deselect
        s.deselectByVisibleText("Volvo");
        s.deselectAll();
        
	}

}
