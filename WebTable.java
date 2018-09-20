package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTable {
		@Test
		public void AlertVerification()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.mohan.patel\\Documents\\Anand\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
			List<WebElement> header=driver.findElements(By.xpath("//div[@id='leftcontainer']/table/thead/tr[1]/th"));
			for(int i=0;i<header.size();i++)
			{
				System.out.print(header.get(i).getText()+" ");
			}
			System.out.println();
			
			List<WebElement> row1=driver.findElements(By.xpath("//div[@id='leftcontainer']/table/tbody/tr[1]/td"));
			for(int i=0;i<header.size();i++)
			{
				System.out.print(row1.get(i).getText()+" ");
			}
			List<WebElement> rowCount=driver.findElements(By.xpath("//div[@id='leftcontainer']/table/tbody/tr"));
           System.out.println("row count is "+rowCount.size());
           List<WebElement> colCount=driver.findElements(By.xpath("//div[@id='leftcontainer']/table/tbody/tr[1]/td"));
           System.out.println("column count is "+colCount.size());
           
           
           String bs="//div[@id='leftcontainer']/table/tbody/tr[";
           String as="]/td[3]";
           for(int i=1;i<236;i++)
           {
         WebElement element=driver.findElement(By.xpath(bs+(i+1)+as));
         System.out.println(element.getText());
           }
           
           
	}

}

