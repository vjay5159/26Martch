package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\selenium-java-4.1.4\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
         driver.get("https://www.facebook.com/");
       // driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
         WebElement singupbutton = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        System.out.println(singupbutton.isEnabled());
        singupbutton.click();
      
        Thread.sleep(3000);
         WebElement a = driver.findElement(By.xpath("//input[@name='firstname']"));
         a.sendKeys("Vijay");
         
         Thread.sleep(3500);
           WebElement  b = driver.findElement(By.xpath("//input[@name='lastname']"));
        		   b.sendKeys("Kokate");
        		   Thread.sleep(4000);
        		   
       WebElement c =driver.findElement(By.xpath("//input[@name='reg_email__']"));
               c.sendKeys("7770034214");
    		 Thread.sleep(4100);
       WebElement d=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
            d.sendKeys("1234564569");
            Thread.sleep(4200);
             
             
             
       WebElement n = driver.findElement(By.name("birthday_day"));
          n.click();
       Select e = new Select(n);
       System.out.println(e.isMultiple());
        e.selectByIndex(15);
        
        Thread.sleep(4300);
        WebElement m=driver.findElement(By.name("birthday_month"));
        m.click();
        Select g= new Select(m);
        g.selectByVisibleText("Feb");
        
        Thread.sleep(6000);
        WebElement l=driver.findElement(By.name("birthday_year"));
        l.click();
        Select h = new Select(l);
      
        h.selectByValue("1995");
        
        Thread.sleep(4500);
        
     
	WebElement k = driver.findElement(By.xpath("//input[@value='2']"));
     //k.click();
     
     if(k.isSelected())
     {
    	 System.out.println("It is already selected");
     }
     else
     {
    	 k.click();
    	 System.out.println("Now it is selected");
     }
        Thread.sleep(4600);
        //WebElement j=driver.findElement(By.xpath("//input[@value='2']"));
        //j.click();
        //Thread.sleep(5500);
      
      //  System.out.println(k.isEnabled());
        
	}



}
