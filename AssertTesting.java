package testngTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTesting
{
	@Test
	public void m1()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.mohan.patel\\Documents\\Anand\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	String aTitle=driver.getTitle();
	String eTitle="Google";
	Assert.assertEquals(aTitle, eTitle);
	}

}
