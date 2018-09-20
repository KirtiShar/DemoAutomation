package demoAutomation;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class HeadlessBrowser {
	//can capture the screenshot,advantage over htmlUnitDriver
	//Phatom Js is headless browser with javascript API
	//The latest release of PhantomJS has integrated GhostDriver

	public static void main(String[] args)
	{
		File src=new File("C:\\Users\\anand.mohan.patel\\Documents\\Anand\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		System.setProperty("phantomjs.binary.path", src.getAbsolutePath());
		WebDriver driver=new PhantomJSDriver(null);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		

	}

}
