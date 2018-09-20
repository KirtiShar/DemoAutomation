package testngTest;

import org.testng.annotations.Test;

public class Priority
{

	@Test(priority=3)
	public void m1()
	{
		System.out.println("priority 3rd");
	}
	@Test(priority=2)
	public void m2()
	{
		System.out.println("priority 2nd");
	}
	@Test(priority=0)
	public void m3()
	{
		System.out.println("priority 1st");
	}

	}


