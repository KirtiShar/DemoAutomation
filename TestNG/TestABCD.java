package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestABCD
{
	
	@Test
	public void abcd()
	{
		SoftAssert as=new SoftAssert();
		as.assertEquals(true, true);
		as.assertEquals(true, true);
		as.assertEquals(true, true);
		as.assertEquals(true, true);
		as.assertEquals(true, true);
		as.assertEquals(false, true);
		as.assertEquals(true, true);
		as.assertEquals(false, true);
		as.assertAll();
		
	}

}
