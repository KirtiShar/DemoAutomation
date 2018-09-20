package demoAutomation;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.hotkey.Keys;

public class GetPosition {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.mohan.patel\\Documents\\Anand\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Point pos=driver.manage().window().getPosition();
		System.out.println(pos.getX());
		System.out.println(pos.getY());
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Point pos1=driver.manage().window().getPosition();
		System.out.println(pos1.getX());
		System.out.println(pos1.getY());
		//driver.manage().window().setPosition(pos);
		driver.manage().window().setPosition(new Point(0,10));
		Point pos2=driver.manage().window().getPosition();
		System.out.println(pos2.getX());
		System.out.println(pos2.getY());
		
		
		//driver.close();
		
	}

}
