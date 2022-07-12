package TestNgStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestClass1 {
  @Test(groups= {"regrassion"})
  public void a() 
  {
	  Reporter.log("A is running");
  }
  @Test(groups= {"sanity"})
  public void b() 
  {
	  Reporter.log("B is running");
  }
  @Test(groups= {"regrassion"})
  public void c() 
  {
	  Reporter.log("C is running");
  }
  @Test(groups= {"regrassion"})
  public void d() 
  {
	  Reporter.log("D is running");
  }
  @Test(groups= {"regrassion"})
  public void e() 
  {
	  Reporter.log("E is running");
  }
}
