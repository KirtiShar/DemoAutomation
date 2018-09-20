package seleniumEasy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestSumbit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.mohan.patel\\Documents\\Anand\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumeasy.com/test/");
		driver.findElement(By.xpath("//a[contains(text(),'Input Forms')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Input Form Submit')]")).click();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
	 
		Point pt=driver.findElement(By.xpath("//a[contains(text(),'Input Forms')]")).getLocation();
        int i=pt.getX();
        System.out.println(i);
        ChromeOptions co=new ChromeOptions();
        String s=co.getVersion();
        System.out.println(s);
        driver.close();
	}

}
