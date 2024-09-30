package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import config.Configuration;

public class Enabled {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
	
		WebDriver d = new ChromeDriver(); 
		
		d.get("https://www.facebook.com/");
		boolean b1=d.findElement(By.xpath("//button[@name='login']")).isDisplayed();
		System.out.println(b1);
		
		boolean b2=d.findElement(By.xpath("//button[@name='login']")).isEnabled();
		System.out.println(b2);


}
}
