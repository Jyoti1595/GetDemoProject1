package Automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import config.Configuration;

public class demo1 {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
	
		WebDriver d = new ChromeDriver(); 
		
		d.get("https://www.facebook.com/signup");
	
		WebElement monthLocator = d.findElement(By.xpath("//select[@id='month']"));
		
		Select ss=new Select(monthLocator);
		
		ss.selectByIndex(1);//method parameterizied
		
		for(int i=0;i<=11;i++)
		{
			ss.selectByIndex(i);
			Thread.sleep(2000);
		}
		
		
		

	}
}

