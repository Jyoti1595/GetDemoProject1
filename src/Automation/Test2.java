package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import config.Configuration;

public class Test2 {
	
	public static void main(String[] args) throws InterruptedException  {
//		System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
		Thread.sleep(2000);
		WebDriver d = new ChromeDriver();     //upcasting use driver is ref variable
		
		d.get("http://www.facebook.com/login/");
		
		d.findElement(By.xpath("//input[@name='email']")).sendKeys("jyoti1234");
		d.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456789");
		d.findElement(By.xpath("//button[@value='1']")).click();
		d.navigate().back();
		d.findElement(By.xpath("//a[text()='Developers']")).click();
		
		d.navigate().back();
		d.findElement(By.xpath("//a[text()='Messenger']")).click();
		
	}
}
