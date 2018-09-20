package demoAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MoveByOffsetMouse {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.mohan.patel\\Documents\\Anand\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Resizable.html");
		driver.findElement(By.id("btn2")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("resizable")));
		WebElement box=driver.findElement(By.id("resizable"));
		System.out.println(box.getSize().getWidth());
		System.out.println(box.getSize().getHeight());
		WebElement corner=driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
		Actions act=new Actions(driver);
		act.clickAndHold(corner).moveByOffset(50, 50).release().build().perform();
	}
	
}
