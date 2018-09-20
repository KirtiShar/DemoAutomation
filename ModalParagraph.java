package demoAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModalParagraph {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.mohan.patel\\Documents\\Anand\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Accordion.html");
		driver.findElement(By.xpath("//*[@id='Functionality']/div/div/div/div[2]/div[1]/h4/a/b")).click();
		WebElement paragraph=driver.findElement(By.xpath("//div[@id='collapse2']/div"));
		String pText=paragraph.getText();
		System.out.println(pText);
		if(pText.contains("Switching between windows and Drag and Drop"))
				{
			System.out.println("text is present in paragraph");
				}
		
	}
	
}
