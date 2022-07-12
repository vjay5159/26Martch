package TestNgStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class IncludExcludeStudy {
  @Test
  public void f()
  {
	  Reporter.log(null);
  }
  @Test
  public void v()
  {
	  Reporter.log("v is Running");
  }
  @Test
  public void m()
  {
	  Reporter.log("m is Running");
  }
}
