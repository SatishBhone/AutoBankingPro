package ListenerClasses;

import org.testng.ITestResult;

public class ListenerClass {
	
	 public void onTestStart(ITestResult result) {
		  System.out.println(result.getName() + " Test started");
	  }
	
	  public void onTestSuccess(ITestResult result) {
		  System.out.println(result.getName() + " Test Passed");
		  
	  }

	  public void onTestFailure(ITestResult result) {
		  System.out.println(result.getName() + " Test Failed");
	  }

	 
	  public void onTestSkipped(ITestResult result) {
		  System.out.println(result.getName() + " Test skipped");
	  }

}
