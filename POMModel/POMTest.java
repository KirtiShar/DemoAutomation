package POMModel;

import javax.jws.HandlerChain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class POMTest 
{
	WebDriver driver;

	@Test
	public void test1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.mohan.patel\\Documents\\Anand\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/SignIn.html");
		DemoSignInPage login_page=PageFactory.initElements(driver, DemoSignInPage.class);
		login_page.email.sendKeys("anand");
		login_page.password.sendKeys("test123");
		login_page.enter_button.click();
}
}
