package demoAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropStatic {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.mohan.patel\\Documents\\Anand\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Static.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions act=new Actions(driver);
	   WebElement src= driver.findElement(By.xpath("//img[@id='mongo']"));
	   WebElement tgt= driver.findElement(By.xpath("//div[@id='droparea']"));
	   System.out.println("sounce is visible?" +src.isDisplayed());
	   System.out.println("sounce is visible?" +tgt.isDisplayed());
	   act.clickAndHold(src).moveToElement(tgt).release().build().perform();
	   //driver.close();
		
	}

}
