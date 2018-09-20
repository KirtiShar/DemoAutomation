package TestNgAutomation;

import org.testng.annotations.Test;

public class Grouping 
{
	
	@Test(priority=1,groups="setup")
	public void launch()
	{
		System.out.println("Launching");
	}
	@Test(priority=2,groups="setup")
	public void maximise()
	{
		System.out.println("maximising");
	}
	@Test(priority=3,groups="setup")
	public void deletecookies()
	{
		System.out.println("deleting cookies");
	}
	@Test(priority=4,groups="url")
	public void passurl()
	{
		System.out.println("URL Passed");
	}
	@Test(priority=5,groups="pagevalidation")
	public void home()
	{
		System.out.println("clicking on homepage");
	}
	
	@Test(priority=6,groups="pagevalidation")
	public void userpage()
	{
		System.out.println("clicking on userpage");
	}

}
