package selectclass;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import config.Configuration;

public class Multiple {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
	
		WebDriver d = new ChromeDriver(); 
		
		d.get("https://www.facebook.com/signup");
		//d.manage().window().maximize();
	
		WebElement year = d.findElement(By.xpath("//select[@name='birthday_year']"));
		
		Select s1=new Select(year);
		
		boolean result=s1.isMultiple();
		System.out.println(result);
		//d.quit();
		
	}
}


