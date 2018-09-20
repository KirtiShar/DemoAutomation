package demoAutomation;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException
	{
		String homePage = "http://www.zlti.com";
		String url=null;
		int respCode = 200;
		 HttpURLConnection huc = null;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.mohan.patel\\Documents\\Anand\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(homePage);
		List<WebElement> lst=driver.findElements(By.tagName("a"));
		System.out.println(lst.size());
		for(int i=0;i<lst.size();i++)
		{
			url=lst.get(i).getAttribute("href");
			if(url==null || url.isEmpty())
			{
				System.out.println("this url is empty");
				continue;
			}
			else if(!url.startsWith(homePage))
			{
				 System.out.println("URL belongs to another domain, skipping it.");
	                continue;
			}
			else
			{
				try
				{   URL link = new URL(url);
					huc=(HttpURLConnection) link.openConnection();
					huc.setRequestMethod("HEAD");
					huc.connect();
					respCode= huc.getResponseCode();
					 if(respCode >= 400){
		                    System.out.println(url+" is a broken link:"+respCode);
		                }
		                else{
		                    System.out.println(url+" is a valid link"+respCode);
		                }
				}
				catch(MalformedURLException m)
				{
					m.printStackTrace();
				}
				catch(IOException io)
				{
					io.printStackTrace();
				}
                
			}
		}
		driver.close();
	}

}
