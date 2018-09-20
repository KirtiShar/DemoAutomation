package demoAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.mohan.patel\\Documents\\Anand\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Slider.html");	
		WebElement slider=driver.findElement(By.xpath("//*[@id='slider']/a"));
		Point loc=slider.getLocation();
		int x=loc.getX();
		int y=loc.getY();
		System.out.println(x);
		System.out.println(y);
		Actions act=new Actions(driver);
		act.dragAndDropBy(slider, x+10, y).build().perform();
	
	}

}
