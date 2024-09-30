package TestNgpgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import config.Configuration;

public class Sample1 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com/");
		
		String actTitle=d.getTitle();
		System.out.println(actTitle);
		String expTitle= "Facebook – log in or sign up";

		if(actTitle.equals(expTitle))
		{
			System.out.println("Test case Pass");
		}
		else
		{
			System.out.println("Test case Failed");
		}
		
	}

}
