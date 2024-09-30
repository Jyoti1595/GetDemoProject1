package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import config.Configuration;

public class Example {

public static void main(String[] args) throws InterruptedException  {
			System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
		
			WebDriver d = new ChromeDriver(); 
			d.navigate().to("https://www.amazon.in/");
			d.findElement(By.xpath(("//span[@class='nav-action-inner'][1]"))).click();
			
}
}
	