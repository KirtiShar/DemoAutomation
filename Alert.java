package SeleniumPractice;


import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Alert {

	@Test
	public void AlertVerification()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.mohan.patel\\Documents\\Anand\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://gis.pima.gov/plugins/popuptest/jsconfirmtest.htm");
		//driver.get("https://www.google.com");
		try
		{
		
		WebDriverWait wait= new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		Assert.assertEquals(1, 1);
		}
		catch (NoAlertPresentException e)
		{
			Assert.assertEquals(1, 0);
		}
		finally 
		{
			driver.close();
			
		}
		

		

	}

}
