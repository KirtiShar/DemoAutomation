package seleniumEasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.mohan.patel\\Documents\\Anand\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumeasy.com/test/");
		driver.findElement(By.xpath("//a[contains(text(),'Input Forms')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Select Dropdown List')]")).click();
		WebElement ddl1=driver.findElement(By.id("select-demo"));
		Select sc=new Select(ddl1);
		sc.selectByValue("Friday");
		WebElement ddl2=driver.findElement(By.id("multi-select"));
		Select sc1=new Select(ddl2);
		sc1.selectByValue("Ohio");
		
		driver.close();
		driver.manage().deleteAllCookies();
		
		
		

	}

}
