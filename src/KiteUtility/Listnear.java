package KiteUtility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import KiteBase.Base;

public class Listnear extends UtilityKite implements ITestListener
{
   UtilityKite scr=new UtilityKite();
	@Override
		public void onTestSuccess(ITestResult result) {
			Reporter.log("Conguratlation your test case is pass"+result.getName(),true);
		}
     @Override
    	public void onTestFailure(ITestResult result) 
     {
    	 Reporter.log("Sorry Test case is fail"+result.getName(),true);
    	 String name =result.getName();
    	 try
    	 {
    		scr.ScreenShot(name);
    	 }
    	 catch(IOException e)
    	 {
    		 e.printStackTrace();
    	 }
    		
    	}
   
}
