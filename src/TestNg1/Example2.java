package TestNg1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import config.Configuration;

public class Example2 {
	
	//String actMsg;
	//String expMsg="This field is required.";
	@Test
	public void Demo()
	{
		System.setProperty("webdriver.chrome.driver",Configuration.driverPath);
		WebDriver d=new ChromeDriver();
		d.get("https://www.gridlastic.com/register.php");
		d.findElement(By.xpath("//button[@type='submit']")).click();
		List<WebElement> src = d.findElements(By.xpath("//label[@class='help-inline help-small no-left-padding']"));
		for(WebElement xyz:src)
		{
			String actMsg=xyz.getText();
			System.out.println(actMsg);
			String expMsg="This field is required";
			
			if(actMsg.equals(expMsg))
			{
				System.out.println("Test case is passed");
			}
			else
			{
				System.out.println("Test case is failed");
			}
			
		}

		
	}

}


