package demoAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicDataTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.mohan.patel\\Documents\\Anand\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/DynamicData.html");
		driver.findElement(By.xpath("//button[@id='save']")).click();
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id='loading']/img")));
		List<WebElement> list=driver.findElements(By.xpath("//div[@id='loading']"));
		System.out.println(list.size());
		/*WebElement firstName=driver.findElement(By.xpath("//*[@id='loading']/text()[1]"));
		WebElement lastName=driver.findElement(By.xpath("//*[@id='loading']/text()[2]"));
		System.out.println(photo.getAttribute("src"));
		System.out.println(firstName.getText().trim());
		System.out.println(lastName.getText().trim());
		driver.close();*/
	}
}

