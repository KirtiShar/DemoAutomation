package ListenerTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPatel
{
	
	@Test
	public void run1()
	{
		Assert.assertEquals(true, true);
	}
	
	@Test
	public void run2()
	{
		Assert.assertEquals(true, false);
	}


}
