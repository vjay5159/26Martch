package selinium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testb {

	public static void main(String[] args) throws InterruptedException
	{
	   System.setProperty("webdriver.chrome.driver", "F:\\selenium-java-4.1.4\\chromedriver_win32\\Chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
       driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
       Thread.sleep(500);
   
    //  driver.findElement(By.xpath("//button[@id='alertBox']")).click();
   //   Alert alt = driver.switchTo().alert();
   //   System.out.println(alt.getText());
   //   Thread.sleep(2000);
   //     alt.accept();     
        
       
       driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
       Alert At = driver.switchTo().alert();
       System.out.println(At.getText());
       At.dismiss();
       
       
       
       //Thread.sleep(2000);
       //driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("VIJAY");
       
       
	}

}
