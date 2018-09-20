package demoAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchAtAlertTestPresenece 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.mohan.patel\\Documents\\Anand\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("btn2")).click();
		Actions act= new Actions(driver);
		WebElement e1=driver.findElement(By.partialLinkText("SwitchTo"));
		act.moveToElement(e1).perform();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Alerts")).click();
		driver.findElement(By.xpath("//*[@id='OKTab']/button")).click();
		boolean status=isAlertPresent();
		System.out.println("Alert is present?"+status);
		if(status==true)
		{
			driver.switchTo().alert().accept();
			System.out.println("altert OK was pressed");
		}
	}
	
	public static boolean isAlertPresent()
	{
		try
		{
			Alert alt1=driver.switchTo().alert();
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

}
