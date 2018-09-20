package demoAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.mohan.patel\\Documents\\Anand\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://aajtak.intoday.in/");
		driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("java");
		Thread.sleep(5000);
		List<WebElement> lists=driver.findElements(By.xpath("//div[contains(id,'sbse')]"));
		System.out.println(lists.size());
	}

}
