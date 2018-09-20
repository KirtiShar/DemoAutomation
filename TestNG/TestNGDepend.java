package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDepend 
{
	
	@Test(dependsOnMethods="seat",alwaysRun=true)
	public void book()
	{
		System.out.println("booking");
	}
	@Test
	public void seat()
	{
		Assert.assertEquals(true, false);
	}
	@Test(timeOut=5000)
	public void performace() throws InterruptedException
	{
		Thread.sleep(6000);
		System.out.println("performance passed");
	}

}
