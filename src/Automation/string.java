package Automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import config.Configuration;

public class string {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver d = new ChromeDriver(co); 
		
		d.get("https://www.facebook.com/");
		String str=d.findElement(By.xpath("//h2[@class=\"_8eso __web-inspector-hide-shortcut__\"]")).getText();
		System.out.println(str);
		
//		String str1=d.findElement(By.xpath("//h2[@class='_58mk']")).getText();
//		System.out.println(str1);
		
		

	}
}
