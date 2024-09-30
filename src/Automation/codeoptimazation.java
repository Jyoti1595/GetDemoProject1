package Automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import config.Configuration;

public class codeoptimazation {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
	
		WebDriver d = new ChromeDriver(); 
		
		d.get("https://www.facebook.com/signup");
		WebElement radio = d.findElement(By.xpath("(//input[@type='radio'])[2]"));
		boolean sts=radio.isSelected();
		System.out.println(sts);
		Thread.sleep(2000);
		radio.click();
	}
	
}
