package JSPGM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import config.Configuration;

public class jScriptProgram {
	
	public static WebDriver d;
	
	@Test
	public static void rediffLogin()
	{
		System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
		d = new ChromeDriver();
		d.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript(" window.location= 'https://www.facebook.com/login/'");
		
		js.executeScript("document.getElementById('email').value='Tester'");
		js.executeScript("document.getElementById('password').value='Tester123'");

		
		
	}

}
