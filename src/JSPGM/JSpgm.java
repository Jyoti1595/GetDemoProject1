package JSPGM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import config.Configuration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


public class JSpgm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		//d.findElement(By.xpath("(//a[text()='About Selenium'])[2]")).click();
		
		WebElement about = d.findElement(By.xpath("(//a[text()='About Selenium'])[2]"));

		((JavascriptExecutor)d).executeScript("arguments[0].scrollIntoView(true);",about);	
		Thread.sleep(2000);
		about.click();
		
		
	}

}

