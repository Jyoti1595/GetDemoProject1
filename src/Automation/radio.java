package Automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import config.Configuration;

public class radio {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
	
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver d = new ChromeDriver(co); 
		
		d.get("https://www.facebook.com/signup");
		d.findElement(By.xpath("(//input[@type='radio'])[2]")).click();

		boolean xyz=d.findElement(By.xpath("(//input[@type='radio'])[2]")).isSelected();
		
		System.out.println(xyz);
		
		//boolean sts1=d.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		//System.out.println(sts1);



}
}
