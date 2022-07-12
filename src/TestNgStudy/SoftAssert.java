package TestNgStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SoftAssert 
{
	org.testng.asserts.SoftAssert soft=new org.testng.asserts.SoftAssert();
  @Test
  public void TC1()
  {
	  String ExpectedResult="VCTCPune";
	  String ActualResult="VCTCPune";
	  soft.assertEquals(ActualResult,ExpectedResult,"Value is not matching");
	  Reporter.log("TC1 softAssert is running",true);
	  soft.assertNotNull(ActualResult);
	  Reporter.log("running Tc",true);
	  soft.assertAll();
  }
}
