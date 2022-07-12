package selinium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class veloTable {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium-java-4.1.4\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		  List<WebElement> Row = driver.findElements(By.xpath("//table[@id='product']//tr"));
		System.out.println(Row);
		
		int TotalNumOfRow = Row.size();
		System.out.println(TotalNumOfRow);
		
		
		List<WebElement> column = driver.findElements(By.xpath("//table//tr[1]//th"));
		
		int totalNumOfColumn = column.size();
		System.out.println(totalNumOfColumn);
		
		   for(WebElement header:column)
		   {
			   System.out.println(header.getText());
		   }
		   
		   
	//	   Iterator it = column.iterator();
	//	   for(int i=0;i<=column.size();i++)
	//	   {
	//		 System.out.println(column.get(i));
	//	   }
        
		  List<WebElement> allRowDta = driver.findElements(By.xpath("//table//tr"));
		  Iterator<WebElement> it = column.iterator();
		  
		  while(it.hasNext())
		  {
			  System.out.print(it.next().getText()+" ");
			  
		  }
		  System.out.println();
	}

}
