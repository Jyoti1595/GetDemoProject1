package Listener;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import config.Configuration;

public class BaseClass1 {
	
	public WebDriver driverInit()
	{
		System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com/");
		return driver;
		
	}

}
