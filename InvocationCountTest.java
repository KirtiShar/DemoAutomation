package TestNgAutomation;

import org.testng.annotations.Test;

public class InvocationCountTest

{
	@Test(invocationCount=6)
	public void sum()
	{
		int i=6;
		int j=9;
		int sum=i+j;
		System.out.println("sum is"+sum);
	}

}
