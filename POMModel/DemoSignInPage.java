package POMModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DemoSignInPage 
{
	WebDriver driver;
	public DemoSignInPage(WebDriver driver)
	{
		this.driver=driver;
	}
//	@FindBy(xpath="/html/body/div/div/div[2]/input")
//	WebElement email;
	
/*	as the name suggests helps us control when to cache a WebElement and when not to.
	This annotation when applied over a WebElement instructs Selenium to keep a cache of 
	the WebElement instead of searching for the WebElement every time from the WebPage. 
	This helps us save a lot of time.*/
	
	@CacheLookup
	@FindBy(how= How.XPATH, using= "/html/body/div/div/div[2]/input")
	WebElement email;
	
	@CacheLookup
	@FindBy(xpath="/html/body/div/div/div[3]/input")
	WebElement password;
	
	@CacheLookup
	@FindBy(xpath="//*[@id='enterbtn']")
	WebElement enter_button;
	
}
