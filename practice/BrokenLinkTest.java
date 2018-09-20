package practice;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrokenLinkTest 
{
	

	public static void main(String[] args) throws Exception 
	{
		ChromeOptions options=new ChromeOptions();
		options.setHeadless(true);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.mohan.patel\\Documents\\Anand\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int size=links.size();
		System.out.println(size);
		
		for(int i=0;i<size;i++)
		{
			String url=links.get(i).getAttribute("href");
			verifyLinkActive(url);
		}

	}
	
	public static void verifyLinkActive(String linkUrl) throws Exception
	{
      
           URL url = new URL(linkUrl);
          
           HttpURLConnection huc=(HttpURLConnection)url.openConnection();
           
           huc.setConnectTimeout(3000);
           
           huc.connect();
           if(huc.getResponseCode()==200)
           {
        	   System.out.println("below link ok=====");
        	   System.out.println(linkUrl+huc.getResponseCode()+huc.getResponseMessage());
           }
           else
           {
        	   System.out.println("below link not ok=====");
        	   System.out.println(linkUrl+huc.getResponseCode()+huc.getResponseMessage());
           }
            
           
    } 
	
}
