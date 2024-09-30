package ActionClass;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.http.ConnectionFailedException;

import config.Configuration;

//import config.Configuration;

	public class DElement {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",Configuration.driverPath);
			ChromeOptions co=new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");

			WebDriver driver = new ChromeDriver(co);
			driver.get("https://www.globalsqa.com/demo-site/draganddrop");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.switchTo().frame(2);
			Thread.sleep(2000);
			
			List<WebElement> src= driver.findElements(By.xpath("//h5[@class='ui-widget-header']"));
			for(WebElement xyz:src)
			{
				String S = xyz.getText().trim();
				System.out.println(S);
			}
			
		}

	}
