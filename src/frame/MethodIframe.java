package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import config.Configuration;

public class MethodIframe {


	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
		WebDriver d = new ChromeDriver();		
		d.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		d.manage().window().maximize();	
		
		d.switchTo().frame(1);   //index
		d.findElement(By.xpath("//button[@type='button']")).click();
		}

}


