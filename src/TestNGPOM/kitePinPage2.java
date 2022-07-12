package TestNGPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitePinPage2
{
	@FindBy(id="pin") private WebElement PIN;
	@FindBy(xpath="//button[@class='button-orange wide']") private WebElement conti;
	
	
	public kitePinPage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendPin(String pin)
	{
		PIN.sendKeys(pin);
	}
	public void ClickOncontinueButton()
	{
		conti.click();
	}

}
