package TestNGPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteHomePage3 
{
	@FindBy(xpath="//span[@class='user-id']") private WebElement UserName;
	@FindBy(xpath="//a[@target='_self']") private WebElement LogOut;
    
	public kiteHomePage3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void validateUsername(String expectedUserId)
	{
		String expectedUserName=expectedUserId;
		String actualUserName=UserName.getText();
		
		if(expectedUserName.equals(actualUserName))
		{
			System.out.println("Expected UserName and Actual UserName are matched test case is passes");
		}
		else
		{
			System.out.println("Expected UserName and Actual UserName are not matched test case is passes");
			
		}
		
	}
	
	public String ActualUName()
	{
		String ActualUserName = UserName.getText();
		return ActualUserName;
	}
	public void LogOut() throws InterruptedException
	{
		UserName.click();
		Thread.sleep(1000);
		LogOut.click();
	}

}
