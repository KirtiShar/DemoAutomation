package TestNgAutomation;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotation

{
	
	@BeforeSuite
	public void setup()
	{
		System.out.println("Setup Done");
	}
	@BeforeTest
	public void Launch()
	{
		System.out.println("Launching");
	}
	@BeforeGroups
	public void Maxim()
	{
		System.out.println("Maximising");
	}
	@BeforeMethod
	public void urlpass()
	{
		System.out.println("opening URL");
	}
	
	@Test
	public void geturl()
	{
		System.out.println("URL Got title");
	}
	
	@AfterMethod
	public void Logout()
	{
		System.out.println("LOgiingout");
	}
	@AfterClass
	public void refresh()
	{
		System.out.println("refresh");
	}
	
	@AfterTest
	public void Quit()
	{
		System.out.println("Quitting");
	}

}
