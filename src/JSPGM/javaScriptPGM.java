package JSPGM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import config.Configuration;

import org.openqa.selenium.JavascriptExecutor;

public class javaScriptPGM {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		((JavascriptExecutor)d).executeScript("scroll(0,30000)");	
		
	}

}
