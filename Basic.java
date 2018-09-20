package testngTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basic
{
	@BeforeSuite
	public void bs()
	{
		System.out.println("executing before suite");
	}
	@BeforeTest
	public void bt()
	{
		System.out.println("executing before test");
	}
	@BeforeClass
	public void bc()
	{
		System.out.println("executing before class");
	}
	@BeforeMethod
	public void bm()
	{
		System.out.println("executing before method");
	}
	@Test
	public void test1()
	{
		System.out.println("Under execution1");
	}
	@Test
	public void test2()
	{
		System.out.println("Under execution2");
	}
	@AfterSuite
	public void as()
	{
		System.out.println("executing After suite");
	}
	@AfterTest
	public void at()
	{
		System.out.println("executing After test");
	}
	@AfterClass
	public void ac()
	{
		System.out.println("executing After class");
	}
	@AfterMethod
	public void am()
	{
		System.out.println("executing after method");
	}
	
	

}
