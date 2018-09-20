package TestNG;

import org.testng.annotations.Test;

public class InnvocationCountClass
{
	@Test(invocationCount=10)
	public void print()
	{
		System.out.println("Hello Tester");
	}

}
