package demoAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.mohan.patel\\Documents\\Anand\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		driver.findElement(By.linkText("Download")).click();
		WebElement et=driver.findElement(By.id("createTxt"));
		System.out.println("Generate file is enabled? "+et.isEnabled());
		driver.findElement(By.id("textbox")).sendKeys("hi this is anand");
		System.out.println("Generate file is enabled? "+et.isEnabled());
		WebElement et1=driver.findElement(By.id("link-to-download"));
		System.out.println("down button is displayed?"+et1.isDisplayed());
		System.out.println("down button is enabled?"+et1.isDisplayed());
		et.click();
		System.out.println("down button is displayed?"+et1.isDisplayed());
		System.out.println("down button is enabled?"+et1.isDisplayed());
		et1.click();
		
	}

}
