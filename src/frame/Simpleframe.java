package frame;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import config.Configuration;

public class Simpleframe {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
		WebDriver d = new ChromeDriver();		
		d.get("http://demo.guru99.com/test/guru99home/");
		d.manage().window().maximize();	
		
		d.switchTo().frame("iframeResult");    //name/id
		d.findElement(By.xpath("//button[@type='button']")).click();
		
		
	}

}


