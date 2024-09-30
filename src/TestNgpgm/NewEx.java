package TestNgpgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import config.Configuration;

public class NewEx {
	@Test(retryAnalyzer = MyRetry.class)
	public void LoginTest() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
	
		WebDriver d = new ChromeDriver();     //upcasting use driver is ref variable
		
		d.get("http://www.facebook.com/login");
		d.findElement(By.xpath("//a[contains(text(),'Sign')]")).click();
		d.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Netra");
		d.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Pawar");
		Thread.sleep(1000);
		Assert.fail();
	

	}
	@Test
	public void LoginTest1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
	
		WebDriver d = new ChromeDriver();     //upcasting use driver is ref variable
		
		d.get("http://www.facebook.com/login");
		d.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Netra");
		d.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Pawar");
}
}
