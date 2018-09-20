package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class InternetExpChallange 
{
	@Test
	public void test1()
	{
		System.setProperty("webdriver.ie.driver", "C:\\Users\\anand.mohan.patel\\Documents\\Anand\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		WebDriver driver= new InternetExplorerDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		long start = System.currentTimeMillis();
		driver.findElement(By.id("lst-ib")).sendKeys("hello world");
		long finish = System.currentTimeMillis();
		long totalTime = finish - start; 
		System.out.println("Total Time for typing hello world in milliseconds - "+totalTime); 
		driver.quit();

		
	}

}
