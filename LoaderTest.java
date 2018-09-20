package demoAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoaderTest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.mohan.patel\\Documents\\Anand\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Loader.html");
		driver.findElement(By.id("loader")).click();
		WebElement warning=driver.findElement(By.xpath("//h1[contains(text(),'Please wait..')]"));
        System.out.println(warning.getText());
        WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".modal-content")));
        WebElement message=driver.findElement(By.xpath("//*[@id='myModal']/div/div/div[2]/p"));
        System.out.println(message.getText());
        driver.findElement(By.xpath("//*[@id='myModal']/div/div/div[3]/button[2]")).click();
        driver.close();
	}
	
}
