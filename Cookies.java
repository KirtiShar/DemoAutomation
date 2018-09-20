package demoAutomation;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.mohan.patel\\Documents\\Anand\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/cookie/selenium_aut.php");
		driver.findElement(By.name("username")).sendKeys("abc123");							
        driver.findElement(By.name("password")).sendKeys("123xyz");							
        driver.findElement(By.name("submit")).click();	
		Set<Cookie> cookies=driver.manage().getCookies();   // Return The List of all Cookies
		/*driver.manage().getCookieNamed(arg0);  //Return specific cookie according to name
		driver.manage().addCookie(arg0);   //Create and add the cookie
		driver.manage().deleteCookie(arg0);  // Delete specific cookie
		driver.manage().deleteCookieNamed(arg0); // Delete specific cookie according Name
		driver.manage().deleteAllCookies();  */// Delete all cookies

	}

}
