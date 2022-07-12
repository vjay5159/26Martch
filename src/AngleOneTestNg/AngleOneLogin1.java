package AngleOneTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v100.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AngleOneLogin1
{
  @FindBy(id="txtUserID")private WebElement Userid;
  @FindBy(id="txtTradingPassword")private WebElement password;
  @FindBy(id="loginBtn")private WebElement login;
  
  public AngleOneLogin1(WebDriver driver)
  {
	  PageFactory.initElements(driver,this);
  }
  
  public void sendUserid(String UserName)
  {
	  Userid.sendKeys(UserName);
  }
  public void sendPassword(String PWD)
  {
	  password.sendKeys(PWD);
  }
  public void clickLogin()
  {
	  login.click();
  }
}
