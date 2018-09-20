package TestNgAutomation;

import org.testng.annotations.Test;

public class DisableTest 
{
	@Test
	public void testA()
	{
		System.out.println("Running A");
	}
	
	@Test(enabled=false)
	public void testC()
	{
		System.out.println("Running C");
	}
	
	@Test
	public void testB()
	{
		System.out.println("Running B");
	}
}
