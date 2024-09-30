package TestNg1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import config.Configuration;

public class DifferentBrowser {
	/*@Test
	public void Tc1()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vaibhav\\Downloads\\geckodriver-v0.31.0-win32\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("https://www.facebook.com");
		d.manage().window().maximize();
		d.close();
	}*/
	@Test
	public void Tc2()
	{
		System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com");
		d.manage().window().maximize();
		d.close();
	}

}
