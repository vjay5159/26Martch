package TestNgStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
  @Test
  public void v()
  {
	  Reporter.log("v success",true);
  }
  @Test(enabled=false)
  public void b()
  {
	  Reporter.log("v success",true);
  }
  @Test(priority=-1)
  public void M()
  {
	  Reporter.log("v success",true);
  }
  @Test(enabled=false)
  public void p()
  {
	  Reporter.log("v success",true);
  }
}
