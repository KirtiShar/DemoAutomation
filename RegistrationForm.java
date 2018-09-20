package demoAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.ui.Select;

public class RegistrationForm {

		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.mohan.patel\\Documents\\Anand\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://demo.automationtesting.in/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.id("btn2")).click();
			WebElement fistname=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
			fistname.sendKeys("anand");
			System.out.println("name entered as first name is:"+fistname.getAttribute("value"));
			driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("patel");
			driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[2]/div/textarea")).sendKeys("sasaram");
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("anandmohanbunty@gmail.com");
			driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("8880328975");
			WebElement sex=driver.findElement(By.xpath("//input[@type='radio'][@value='Male']"));
			System.out.println("status of sex is "+sex.isSelected());
			sex.click();
			System.out.println("now status of sex is "+sex.isSelected());
			WebElement hobbyCheck=driver.findElement(By.xpath("//input[@type='checkbox'] [@id='checkbox1']"));
			System.out.println("status of hobby is "+hobbyCheck.isSelected());
			hobbyCheck.click();
			System.out.println("now status of hobby is "+hobbyCheck.isSelected());
			driver.findElement(By.xpath("//div[@id='msdd']")).click();
			Thread.sleep(5000);
			driver.findElement(By.partialLinkText("Czech")).click();
			WebElement Skill=driver.findElement(By.id("Skills"));
			Select slt=new Select(Skill);
			slt.selectByVisibleText("C");
			System.out.println("now value of Skill is "+Skill.getAttribute("value"));
			WebElement country=driver.findElement(By.id("countries"));
			Select slt1=new Select(country);
			slt1.selectByValue("Algeria");;
			System.out.println("now value of country is "+country.getAttribute("value"));
			driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[10]/div/span/span[1]/span")).click();
			driver.switchTo().frame("google_osd_static_frame");
			driver.findElement(By.partialLinkText("India")).click();
			driver.switchTo().defaultContent();
			Select yy=new Select(driver.findElement(By.id("yearbox")));
			yy.selectByVisibleText("2012");
			Select mm=new Select(driver.findElement(By.id("monthbox")));
			mm.selectByVisibleText("May");
			Select dd=new Select(driver.findElement(By.id("daybox")));
			dd.selectByVisibleText("10");
			
			//driver.close();
			
			
			
			
			
	}

}
