package TestNgStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqual {
  @Test
  public void AssertEqualStudy()
  {
	 String a="Vijay";
	 String b="ajay";
	 
	 Assert.assertNotEquals(a,b, "a & b are not matched Tc is passed");
	 Reporter.log("a & b values are not matched test case is passed");
  }
  
  @Test
  public void AssertTruse()
  {
	  boolean a = true;
	  boolean b = false;
	  Assert.assertTrue(a,"TC failed is value is true");
	  Reporter.log("TC is passed value is true",true);
  }
  
  @Test
  public void AssertNotNull()
  {
	  String a = null;
	  String b = "ACB";
	  Assert.assertNotNull(b,"a value is null TC is failed");
	  Reporter.log("value is null TC is passed",true);
	  Assert.fail();
  }
  
  
  
  
  
}
