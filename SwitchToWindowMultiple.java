package demoAutomation;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

	public class SwitchToWindowMultiple 
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
            String pWindow=itr.next();
            String c1Window=itr.next();
            String c2Window=itr.next();
			driver.switchTo().window(c1Window);
			System.out.println("After 1st switching window Title:"+driver.getTitle());
			driver.switchTo().window(c2Window);
			System.out.println("After 2nd switching window Title:"+driver.getTitle());
			driver.switchTo().window(c1Window);
			System.out.println("After 3rd switching window Title:"+driver.getTitle());
			driver.switchTo().window(pWindow);
			System.out.println("Parent switching window Title:"+driver.getTitle());
			driver.quit();
			
	}

}
