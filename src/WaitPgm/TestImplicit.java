package WaitPgm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import config.Configuration;

public class TestImplicit {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com/");
		d.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
		d.manage().timeouts().pageLoadTimeout(1,TimeUnit.SECONDS);
		d.findElement(By.xpath("//input[@id='email']")).sendKeys("Test@gmail.com");
		//d.findElement(By.xpath("//input[@id='pass']")).sendKeys("1234567");
		
	}

}
