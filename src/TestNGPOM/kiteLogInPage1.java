package TestNGPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteLogInPage1 
{
	@FindBy(id="userid") private WebElement UserId;
	@FindBy(id="password") private WebElement PWD;
	@FindBy(xpath="//button[@class='button-orange wide']")private WebElement LoginButton;
	
	
	public kiteLogInPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void SendUserId(String UserName)
	{
		UserId.sendKeys(UserName);
	}
	public void sendPwd(String pwd)
	{
		PWD.sendKeys(pwd);
	}
	public void click()
	{
		LoginButton.click();
	}

}
