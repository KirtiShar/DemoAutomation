package demoAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchToAlertTest 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.mohan.patel\\Documents\\Anand\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("btn2")).click();
		Actions act= new Actions(driver);
		WebElement e1=driver.findElement(By.partialLinkText("SwitchTo"));
		act.moveToElement(e1).perform();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Alerts")).click();
		//Handling Type 1
		System.out.println("*******handelling Type1*************");
		driver.findElement(By.xpath("//*[@id='OKTab']/button")).click();
		Alert alt1=driver.switchTo().alert();
		System.out.println(alt1.getText());
		alt1.accept();
		//Handling Type 2
		System.out.println("*******handelling Type2*************");
		driver.findElement(By.partialLinkText("Alert with OK & Cancel")).click();
		driver.findElement(By.xpath("//*[@id='CancelTab']/button")).click();
		Alert alt2=driver.switchTo().alert();
		System.out.println(alt2.getText());
		alt2.dismiss();
		//Handling Type 2
		System.out.println("*******handelling Type2*************");
		driver.findElement(By.partialLinkText("Alert with Textbox")).click();
		driver.findElement(By.xpath("//*[@id='Textbox']/button")).click();
		Alert alt3=driver.switchTo().alert();
		System.out.println(alt3.getText());
		alt3.sendKeys("anand");
		alt3.accept();
		driver.close();
		
		
	}
}

			
