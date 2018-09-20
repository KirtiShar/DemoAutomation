package TestNgAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAnnotaionImpliment 
{
	
WebDriver driver;

  @BeforeMethod
  public  void setUP() 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\anand.mohan.patel\\Documents\\Anand\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	  driver.get("https://www.google.com");
  }
  @Test
  public void googleTitleTest()
  {
	 String s= driver.getTitle();
	 System.out.println(s);
  }
	  
 
  @AfterMethod
  public  void tearDown() 
  {
	  driver.close();
	
  }
}
