package TestNG;

import org.testng.annotations.Test;

public class GroupingConcepts
{
	@Test(groups={"smoke"})
	public void anand1()
	{
		System.out.println("anand1 test pass");
	}
	@Test(groups={"sanity"})
	public void anand2()
	{
		System.out.println("anand2 test pass");
	}
	@Test(groups={"sanity"})
	public void anand3()
	{
		System.out.println("anand3 test pass");
	}
	@Test(groups="sanity")
	public void anand4()
	{
		System.out.println("anand4 test pass");
	}
	@Test(groups={"smoke"})
	public void anand5()
	{
		System.out.println("anand5 test pass");
	}

}
