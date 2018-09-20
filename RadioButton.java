package seleniumEasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButton 
{
	WebDriver driver;

	@BeforeMethod
	public void preCondition()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.mohan.patel\\Documents\\Anand\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
	}
	@Test
	public void testRadioButton()
	{
		WebElement radio=driver.findElement(By.xpath("//input[@name='optradio'][@value='Male']"));
		boolean status=radio.isDisplayed();
		Assert.assertEquals(status, true);
	}
	
	@AfterMethod
	public void postCondition()
	{
		driver.close();
	}
}