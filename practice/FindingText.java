package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingText {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.mohan.patel\\Documents\\Anand\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		try
		{
		driver.findElement(By.xpath("//*[contains(text(),'Google offered in')]"));
		System.out.println("Text Present");
		}
		catch(Exception e)
		{
			System.out.println("Text not Present");
		}
 


	}

}
