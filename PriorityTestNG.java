package TestNgAutomation;

import org.testng.annotations.Test;

public class PriorityTestNG 
{
	@Test(priority=1)
	public void testA()
	{
		System.out.println("Running A");
	}
	
	@Test(priority=-1)
	public void testC()
	{
		System.out.println("Running C");
	}
	
	@Test(priority=0)
	public void testB()
	{
		System.out.println("Running B");
	}
}
