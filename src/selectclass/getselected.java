package selectclass;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import config.Configuration;

public class getselected {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
	
		WebDriver d = new ChromeDriver(); 
		
		d.get("https://www.facebook.com/signup");
		d.manage().window().maximize();
	
		WebElement month = d.findElement(By.xpath("//select[@name='birthday_month']"));
		
		Select s1=new Select(month);
		String first=s1.getFirstSelectedOption().getText();		
		System.out.println(first);
	}
}
