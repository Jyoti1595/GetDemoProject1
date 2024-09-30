package Automation;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import config.Configuration;

public class google {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",Configuration.driverPath);
	
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver d = new ChromeDriver(co);     //upcasting use driver is ref variable
		//WebDriver d1 = new ChromeDriver();
		//d1.get("http://www.facebook.com/");
		d.get("https://www.facebook.com");
		//d.findElement(By.id("input")).sendKeys("test");
}
}
