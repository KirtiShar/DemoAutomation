package demoAutomation;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

	public class SwitchToWindowMutipleFor 
	{
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.mohan.patel\\Documents\\Anand\\chromedriver_win32\\chromedriver.exe");
			 driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://demo.automationtesting.in/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.id("btn2")).click();
			Actions act= new Actions(driver);
			WebElement e1=driver.findElement(By.partialLinkText("SwitchTo"));
			act.moveToElement(e1).perform();
			Thread.sleep(3000);
			driver.findElement(By.partialLinkText("Windows")).click();
			driver.findElement(By.partialLinkText("Open Seperate Multiple Windows")).click();
			System.out.println("Before switching window Title:"+driver.getTitle());
			driver.findElement(By.xpath("//div[@id='Multiple']/button")).click();
			Set<String> windows=driver.getWindowHandles();
			System.out.println("Total window "+windows.size());
			Iterator<String> itr=windows.iterator();
            while(itr.hasNext())
            {
            	driver.switchTo().window(itr.next());
            	if(driver.getTitle().equals("Index"))
            	{
            		System.out.println(driver.getTitle());
            		break;
            	}
            }
            System.out.println("Current window is: "+driver.getTitle());
            driver.close();
	}

}
