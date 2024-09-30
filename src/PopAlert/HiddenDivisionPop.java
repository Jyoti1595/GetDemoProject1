package PopAlert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import config.Configuration;

public class HiddenDivisionPop {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
			WebDriver d=new ChromeDriver();
			d.get("https://www.flipkart.com");
			d.findElement(By.xpath("//a[contains(text(), 'Electronics')]")).click();
			
		}

}
