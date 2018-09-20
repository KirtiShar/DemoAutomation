package demoAutomation;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

	public class SwitchToWindowNewWid 
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
			driver.findElement(By.partialLinkText("Open New Seperate Windows")).click();
			System.out.println("Before switching window Title:"+driver.getTitle());
			driver.findElement(By.xpath("//div[@id='Seperate']/button")).click();
			Set<String> windows=driver.getWindowHandles();
			System.out.println("Total window "+windows.size());
			Iterator<String> itr=windows.iterator();
            String pWindow=itr.next();
            String cWindow=itr.next();
			driver.switchTo().window(cWindow);
			System.out.println("After switching window Title:"+driver.getTitle());
			driver.findElement(By.linkText("Contact")).click();
			driver.close();
			driver.switchTo().window(pWindow);
			driver.close();
	}

}
