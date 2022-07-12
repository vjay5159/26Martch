package KitePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class kiteHomePage3 
{
	@FindBy(xpath="//span[@class=\"user-id\"]")private WebElement UserName;
	@FindBy(xpath="//a[@target=\"_self\"]")private WebElement logout;
	
	public kiteHomePage3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void validateUserName(String expectedUserId)
	{
		String expectedUserName = expectedUserId;
		String actualUserName =UserName.getText();
		if(expectedUserName.equals(actualUserName))
		{
			System.out.println("Expected and Actual user name are matched TC is passed");
		}
		else
		{
			System.out.println("Expected and Actual user name are not matched TC is passed");
		}
	}
	public String getActualUserName()
	{
		String actualUserName=UserName.getText();
		return actualUserName;
	}
	
	public void logoutkite()
	{
		logout.click();
		Reporter.log("Logout kite....",true);
	}
	

}
