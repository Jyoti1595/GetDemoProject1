package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import config.Configuration;

public class test {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
	
		WebDriver d = new ChromeDriver(); 
		
		d.get("https://www.facebook.com/signup");
	//	d.get("https://www.facebook.com/login");
		WebElement monthLocator = d.findElement(By.xpath("//select[@id='month']"));
		
		Select s1=new Select(monthLocator);
		
		s1.selectByVisibleText("Dec");//method parameterizied
		Thread.sleep(2000);
		s1.selectByVisibleText("Jan");//method parameterizied

		

	}
}

