package demoAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResizeWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.mohan.patel\\Documents\\Anand\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Dimension d1=driver.manage().window().getSize();
		System.out.println("window height is: "+d1.getHeight());
		System.out.println("window width is: "+d1.getWidth());
		Dimension d=new Dimension(600,1400);
		driver.manage().window().setSize(d);
		//Getting dimension of WebElement
		Dimension d2=driver.findElement(By.id("lst-ib")).getSize();
		System.out.println("Element height is: "+d2.getHeight());
		System.out.println("Element Width is: "+d2.getWidth());
		

	}
}
