package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Parent 
{
	@BeforeClass
	public void beforeClassParent()
	{
		System.out.println("Parent Before Class");
	}
	@BeforeMethod
	public void preParent()
	{
		System.out.println("parent Before Method");
	}
	@Test
	public void run()
	{
		System.out.println("parent run");
	}
	@Test
	public void wish()
	{
		System.out.println("parent wish");
	}
	@AfterMethod
	public void postparent()
	{
		System.out.println("Parent After Method");
	}
	public void afterClassParent()
	{
		System.out.println("child after Parent");
	}

}
