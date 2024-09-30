package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import config.Configuration;

public class youtube {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",Configuration.driverPath);
	
		WebDriver driver = new ChromeDriver();    
		 driver.manage().window().maximize();

			
		  //ChromeOptions co=new ChromeOptions();
		  //co.addArguments("--remote-allow-origins=*");
		  //WebDriver driver=new ChromeDriver(co);
		  
		  driver.get("https://www.youtube.com/watch?v=FRn5J31eAMw");
		  driver.manage().window().maximize();
		  
		  
		  //driver.findElement(By.xpath("//input[@id='search']")).click();
		  driver.findElement(By.xpath("//button[@class='ytp-fullscreen-button ytp-button']")).click();

		  
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@class='ytp-next-button ytp-button']")).click();

		 //driver.manage().window().maximize();
		 //driver.navigate().back();
	}
}
