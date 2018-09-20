package TestNgAutomation;

import org.testng.annotations.Test;

public class DependsOnMultiple 
{
	@Test
	public void testA()
	{
		System.out.println("Running A");
	}
	
	@Test
	public void testC()
	{
		System.out.println("Running C");
	}
	
	@Test(dependsOnMethods ={"testA","testD"})
	public void testB()
	{
		System.out.println("Running B");
	}
	@Test
	public void testD()
	{
		System.out.println("Running D");
	}
}
