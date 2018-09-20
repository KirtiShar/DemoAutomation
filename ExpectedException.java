package TestNgAutomation;

import org.testng.annotations.Test;

public class ExpectedException
{
	@Test(expectedExceptions=ArrayIndexOutOfBoundsException.class)
	public void test()
	{
		int[] i={10,20,30};
		System.out.println(i[4]);
		
	}
	

}
