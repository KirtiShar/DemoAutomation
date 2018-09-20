package TestNgAutomation;

import org.testng.annotations.Test;

public class DependsOn 
{
	@Test(dependsOnMethods="testB")
	public void testA()
	{
		System.out.println("Running A");
	}
	
	@Test
	public void testC()
	{
		System.out.println("Running C");
	}
	
	@Test()
	public void testB()
	{
		System.out.println("Running B");
	}
}
