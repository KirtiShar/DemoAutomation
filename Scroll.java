package demoAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.mohan.patel\\Documents\\Anand\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("java",Keys.ENTER);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		for(int i=100;i<=1200;i=i+200)
		{
		js.executeScript("window.scrollTo(0,"+i+")");
		Thread.sleep(1000);
		}
		Actions act=new Actions(driver);
		for(int j=0;j<=30;j++)
		{
		act.sendKeys(Keys.UP).perform();
		Thread.sleep(1000);
		}
	}

}
