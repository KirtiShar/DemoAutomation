package TestNG;

import org.testng.annotations.Test;

public class HandingException 
{
	@Test(expectedExceptions=ArithmeticException.class)
	public void divisionWithException()
	{
		int i = 1 / 0;
	}
}


