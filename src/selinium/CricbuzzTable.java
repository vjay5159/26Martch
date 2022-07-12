package selinium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricbuzzTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\selenium-java-4.1.4\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement> Row = driver.findElements(By.xpath("//table//tr"));
		int NumOfRow = Row.size();
		System.out.println("Number of row in table "+NumOfRow);
		
		List<WebElement> column = driver.findElements(By.xpath("//table//tr//th"));
		 int NumOFcolumn = column.size();
		
		System.out.println("Number of column "+NumOFcolumn);
		
		
		for(WebElement forEach:column)
		{
			System.out.print(forEach.getText()+" ");
		}
		System.out.println();

		for(int i=0; i<= NumOfRow-1;i++)
		{
			System.out.print(Row.get(i).getText()+" ");
			System.out.println(" ");
			
		}
		System.out.println();
	}

}
