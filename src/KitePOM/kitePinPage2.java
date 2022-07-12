package KitePOM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;


public class kitePinPage2 {
	
	//member
	
	@FindBy(xpath="//input[@id='pin']") private WebElement PIN;
    @FindBy(xpath="//button[@type='submit']") private WebElement continueButton;
    
    
    public kitePinPage2 (WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void sendPin(String pin)
    {
    	PIN.sendKeys(pin);
    	Reporter.log("Enter pin",true);
    }
    public void ClickOncontinueButton()
    {
    	continueButton.click();
    }
}
