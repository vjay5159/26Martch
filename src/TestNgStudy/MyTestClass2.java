package TestNgStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestClass2 {
  @Test(groups= {"regrassion"})
  public void m() 
  {
	  Reporter.log("m is running");
  }
  @Test(groups= {"sanity"})
  public void n() 
  {
	  Reporter.log("n is running");
  }
  @Test(groups= {"regrassion"})
  public void o() 
  {
	  Reporter.log("o is running");
  }
  @Test(groups= {"regrassion"})
  public void p() 
  {
	  Reporter.log("p is running");
  }
  @Test(groups= {"regrassion"})
  public void r() 
  {
	  Reporter.log("r is running");
  }
}
