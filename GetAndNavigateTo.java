package demoAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAndNavigateTo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.mohan.patel\\Documents\\Anand\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://aajtak.intoday.in/");
		System.out.println(driver.findElement(By.xpath("//div[@class='mainnav-icon']")).isDisplayed());
		driver.navigate().to("https://aajtak.intoday.in/");
		System.out.println(driver.findElement(By.xpath("//div[@class='mainnav-icon']")).isDisplayed());
		driver.get("https://aajtak.intoday.in/");
		System.out.println(driver.findElement(By.xpath("//div[@class='mainnav-icon']")).isDisplayed());
		driver.close();
		
		
	}

}
