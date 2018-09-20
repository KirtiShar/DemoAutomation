package TestNgAutomation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertSample {
  @Test
  public void fA() 
  {
	  Assert.assertEquals("Google", "Google");
  }
  @Test
  public void fB() 
  {
	  Assert.assertEquals("gmail", "gmail");
  }
  @Test
  public void fC() 
  {
	  Assert.assertEquals("gmail", "yahoo");
  }
  @Test
  public void fD() 
  {
	  Assert.assertEquals("gmail", "gmail");
  }
}
