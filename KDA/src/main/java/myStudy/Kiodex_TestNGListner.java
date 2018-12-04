package myStudy;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Kiodex_TestNGListner implements ITestListener 
{

	@Override
	public void onFinish(ITestContext Result) 
	{
       		
	}

	@Override
	public void onStart(ITestContext Result) 
	{	
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult Result) 
	{
			
	}

	@Override
	public void onTestFailure(ITestResult Result) 
	{	
		System.out.println("The Name of the failed test case is "+ Result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult Result) 
	{
		 System.out.println("The Name of the skipped test case is "+Result.getName());
	}

	@Override
	public void onTestStart(ITestResult Result) 
	{
			System.out.println(Result.getName()+"  test case started");
	}

	@Override
	public void onTestSuccess(ITestResult Result) 
	{	
		 System.out.println("The name of the Test case passed is "+Result.getName());
	}
}
