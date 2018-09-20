package demoAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.mohan.patel\\Documents\\Anand\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Resizable.html");	
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement resizeElement=driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
		Point loc=resizeElement.getLocation();
		int x=loc.getX();
		int y=loc.getY();
		Actions act=new Actions(driver);
		act.dragAndDropBy(resizeElement, x+10, y).perform();

	}

}
