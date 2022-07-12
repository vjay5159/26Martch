package TestNgStudy;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationStudyTest1 {
  @Test
  public void RechargePhone()
  {
	  Reporter.log("Recharge Done",true);
  }
  @BeforeMethod
  public void LoginToRechargeModul()
  {
	  Reporter.log("LoginRecharge Module Success",true);
  }
  public void LogOutRechrgeModule()
  {
	  Reporter.log("Logout recharge Module success",true);
  }
}
