package TestNg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import config.Configuration;

public class Example {
	String actMsg;
	String expMsg="This field is required.";
	@Test
	public void Demo()
	{
		System.setProperty("webdriver.chrome.driver",Configuration.driverPath);
		WebDriver d=new ChromeDriver();
		d.get("https://www.gridlastic.com/register.php");
		d.findElement(By.xpath("//button[@type='submit']")).click();
		actMsg =d.findElement(By.xpath("//label[@class='help-inline help-small no-left-padding']")).getText();
		Assert.assertEquals(actMsg,expMsg);
		System.out.println("Test passed");
		
	}

}



