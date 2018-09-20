package ListenerTest;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class AnandListner implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) 
	{
		
		System.out.println(result.getName()+ "Test case started");
	}

	@Override
	public void onTestSuccess(ITestResult result)
	{
		
		System.out.println("passed TC name is "+result.toString());
		
	}
	

	@Override
	public void onTestFailure(ITestResult result)
	{
		
		System.out.println("failed TC name is "+result.getName());
		System.out.println("Failed screenshot taken");
	}

	@Override
	public void onTestSkipped(ITestResult result)
	{
		
		System.out.println("skipped TC name is "+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
		
	}

	@Override
	public void onStart(ITestContext result) 
	{
		
		
	}

	@Override
	public void onFinish(ITestContext result)
	{
		
		
	}

	
}
