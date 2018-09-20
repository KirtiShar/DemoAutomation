package demoAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchToFrameSingle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.mohan.patel\\Documents\\Anand\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("btn2")).click();
		Actions act= new Actions(driver);
		WebElement e1=driver.findElement(By.partialLinkText("SwitchTo"));
		act.moveToElement(e1).perform();
		driver.findElement(By.partialLinkText("Frames")).click();
		driver.findElement(By.partialLinkText("Single Iframe")).click();
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println("total number of frame is :"+size);
		driver.switchTo().frame("singleframe");
		//perform action and come back
		driver.switchTo().defaultContent();
		
	}

}
