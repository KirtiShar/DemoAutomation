package TestNgAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertImplimentation 
{
	WebDriver driver;
	
  @Test
  public void Launch() 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\anand.mohan.patel\\Documents\\Anand\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
 }
  @Test
  public void Opening() 
  {
	  driver.get("https://www.google.com");
  }
  @Test
  public void verify() 
  {
	  Assert.assertEquals("Google", driver.getTitle());
  }
  
  @Test(dependsOnMethods="verify")
  public void closing() 
  {
	  driver.close();
  }
 
}
