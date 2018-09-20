package demoAutomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoComplete {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.mohan.patel\\Documents\\Anand\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/AutoComplete.html");	
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement auto=driver.findElement(By.xpath("//div[@class='ui-autocomplete-multiselect ui-state-default ui-widget']"));
	Actions act= new Actions(driver);
	act.sendKeys(auto, "ind");
		
		List<WebElement> suggestions=driver.findElements(By.xpath("//input[@id='searchbox']/.."));
		int size=suggestions.size();
		for(int i=0;i<size;i++)
		{
			System.out.println(suggestions.get(i).getText());
		}
	}

} 
