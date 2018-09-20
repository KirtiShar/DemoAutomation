package ListenerTest;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerTest.AnandListner.class)
public class TestAnand
{
	@Test
	public void test1()
	{
		Assert.assertTrue(false);
	}
	
	@Test
	public void test2()
	{
		Assert.assertTrue(true);
	}
	
	@Test(dependsOnMethods="test1")
	public void test3()
	{
		Assert.assertTrue(true);
	}
	
	@Test
	public void test4()
	{
		Assert.assertTrue(true);
	}

}
