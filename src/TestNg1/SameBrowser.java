package TestNg1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import config.Configuration;

public class SameBrowser {
	@Test
	public void Tc1()
	{
		System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		//d.close();
	}
	@Test
	public void Tc2()
	{
		System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
		WebDriver d=new ChromeDriver();
		d.get("https://www.yahoo.com");
		d.manage().window().maximize();
		//d.close();
	}
	
	@Test
	public void Tc3()
	{
		System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
		WebDriver d=new ChromeDriver();
		d.get("https://www.amazon.com");
		d.manage().window().maximize();
	//	d.close();
	}


}
