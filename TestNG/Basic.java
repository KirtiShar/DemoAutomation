package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basic 
{
	@BeforeTest
	public void preTest1()
	{
		System.out.println("before Test");
	}
	@BeforeClass
	public void preTest()
	{
		System.out.println("Before Class");
	}
	@BeforeMethod
	public void pre()
	{
		System.out.println("Before Method");
	}
	@Test
	public void book()
	{
		System.out.println("booking");
	}
	@Test
	public void seat()
	{
		System.out.println("seat selection");
	}
	
	@AfterClass
	public void postTest()
	{
		System.out.println("after Class");
	}
	@AfterMethod
	public void preMethod()
	{
		System.out.println("after Method");
	}
	@AfterTest
	public void preMethod2()
	{
		System.out.println("after Test");
	}
	

}
