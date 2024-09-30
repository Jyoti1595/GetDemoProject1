package ActionClass;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import config.Configuration;

public class mouseAction {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
			WebDriver driver =new ChromeDriver();		
			driver.get("https://www.facebook.com/signup");
			driver.manage().window().maximize();
			
			WebElement monthEle = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		
			Actions aa = new Actions(driver);
		
			aa.moveToElement(monthEle).click().build().perform();
			
			
		}

	}

