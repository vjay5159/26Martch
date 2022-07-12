package KitePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class kiteLoginPage1
{
	//Data member
	@FindBy (id="userid") private WebElement UserName ;
    @FindBy (id="password")private WebElement Password;
    @FindBy (xpath="//button[@type=\"submit\"]") private WebElement LogIN;
    
    public kiteLoginPage1 ( WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
    public void SendUserId(String un)
    {
    	UserName.sendKeys(un);
    }
    public void sendPwd(String pwd)
    {
    	Password.sendKeys(pwd);
    }
    public void loginButton()
    {
    	LogIN.click();
    	Reporter.log("Click on login..",true);
    }
}

