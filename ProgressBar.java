package demoAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgressBar {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.mohan.patel\\Documents\\Anand\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.automationtesting.in/ProgressBar.html");
	driver.findElement(By.id("cricle-btn")).click();
	Thread.sleep(10000);
	WebElement progress=driver.findElement(By.xpath("//div[@id='container']/div"));
	if(progress.getText().equals("100"))
	{
	System.out.println("Download complete 100%");
	}
	driver.close();

	}

}
