package mytestnglisteners.com;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class TestNGListeners implements ITestListener {
  @Test
  public void f() {
  }

public void onTestStart(ITestResult result) {
	System.out.println("application started execution");
}

public void onTestSuccess(ITestResult result) {
	System.out.println("the execution success"+result.getName());	
}

public void onTestFailure(ITestResult result) {

System.out.println("the execution is fail"+result.getName());
	
}
public void onTestSkipped(ITestResult result) {
	// TODO Auto-generated method stub	
}

public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	// TODO Auto-generated method stub
	
}

public void onStart(ITestContext context) {
	// TODO Auto-generated method stub
	
}

public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub
	
}
}
