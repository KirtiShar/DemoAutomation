package demoAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class FileUpload {

	public static void main(String[] args) throws FindFailed, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.mohan.patel\\Documents\\Anand\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/FileUpload.html");
		Screen s=new Screen();
		Pattern browsebutton=new Pattern("C:\\Users\\anand.mohan.patel\\workspace1\\automationTest\\src\\demoAutomation\\browse.PNG");
		Pattern filename=new Pattern("C:\\Users\\anand.mohan.patel\\workspace1\\automationTest\\src\\demoAutomation\\filename.PNG");
		Pattern open=new Pattern("C:\\Users\\anand.mohan.patel\\workspace1\\automationTest\\src\\demoAutomation\\open.PNG");
		s.click(browsebutton);
		s.type(filename,"C:\\Users\\Default\\Desktop\\E1.pdf");
		s.click(open);
		Thread.sleep(5000);
		WebElement el=driver.findElement(By.cssSelector(".file-footer-caption"));
		String actualTitle=el.getAttribute("title");
		System.out.println("File uploaded "+actualTitle);
		

	}

}
