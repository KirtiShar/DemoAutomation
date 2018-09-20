package SeleniumPractice;



import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.mohan.patel\\Documents\\Anand\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		List<WebElement> links=driver.findElements(By.tagName("//a"));
		System.out.println("Total link Size is"+links.size());
		List<WebElement> solid=new ArrayList();
		for(int i=0;i<links.size();i++)
		{
			if(links.get(i).getAttribute("href")=="")
			{
				solid.add(links.get(i));
			}
		}
		System.out.println("solid link Size is"+solid.size());
		
		driver.close();

	}

}
