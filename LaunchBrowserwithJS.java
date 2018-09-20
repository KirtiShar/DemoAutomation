package demoAutomation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserwithJS {

	public static void main(String[] args) 
	{
		String url="http://www.google.com";
		String script="window.location.href="+url+"";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.mohan.patel\\Documents\\Anand\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript(script);
	}

}
