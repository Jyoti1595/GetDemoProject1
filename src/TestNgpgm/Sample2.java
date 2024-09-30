package TestNgpgm;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import config.Configuration;

public class Sample2 {
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.gridlastic.com/register.php");
		d.findElement(By.xpath("//button[@type='submit']")).click();
		
		//WebElement src = d.findElement(By.xpath("//label[@for='fname']"));
		List<WebElement> src = d.findElements(By.xpath("//label[@class='help-inline help-small no-left-padding']"));
		for(WebElement xyz:src)
		{
			String actText = xyz.getText();
			System.out.println(actText);
			String expText="This field is required.";
			
			

			if(actText.equals(expText))
			{
				System.out.println("Test case Pass");
			}
			else
			{
				System.out.println("Test case Failed");
			}
			
		}
	}

}




	


	
