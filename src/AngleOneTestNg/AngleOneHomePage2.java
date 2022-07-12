package AngleOneTestNg;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
public class AngleOneHomePage2
{
   @FindBy(id="tabclose")private WebElement popup;
	//@FindBy(xpath="//button[@id='tabclose']")private WebElement popup;
   @FindBy(xpath="//a[text()='V342742 ']")private WebElement UserName;	
   @FindBy(xpath="//a[text()='Logout']")private WebElement LogOut; 
   public AngleOneHomePage2(WebDriver driver)
   {
	PageFactory.initElements(driver,this);
   } 
   public void validateUserName(String ActualUserId)
   {
	   String ActualUserName=ActualUserId;
	   String ExpectedUserName=UserName.getText();
	   
	   if(ActualUserName.equals(ExpectedUserName))
	   {
		   System.out.println("Actual and Expected user name are matched Tc is passed");
	   }
	   else
	   {
		   System.out.println("Actual and Expected user name are not matched TC is falied");
	   }	   
   }
   public String ActualUname()
   {
	   String actualUsername= UserName.getText();
	   return actualUsername;
   } 
   public void clikonPoup()
   {
	   popup.click();
	   Reporter.log("Popup removed",true);
   }
   public void clickOnlogout() throws InterruptedException
   {
	  // Thread.sleep(1000);
	   UserName.click();
	   Thread.sleep(1000);
	   LogOut.click();
   }
}

