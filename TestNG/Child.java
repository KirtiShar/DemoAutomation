package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Child extends Parent
{
	@BeforeClass
	public void beforeClassChild()
	{
		System.out.println("child Before Class");
	}
	@BeforeMethod
	public void preChild()
	{
		System.out.println("child Before Method");
	}
	@Test
	public void jump()
	{
		System.out.println("child jump");
	}
	@AfterMethod
	public void postChild()
	{
		System.out.println("child After Method");
	}
	@BeforeClass
	public void afterClassChild()
	{
		System.out.println("child after Class");
	}
}
