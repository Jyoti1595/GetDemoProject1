package DymanicElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import config.Configuration;

public class DynamicWay {

public static void main(String[] args) 
{
		System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
		WebDriver d=new ChromeDriver();
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		d.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		d.findElement(By.xpath("//input[@class='_2IX_2- _2LYh3d VJZDxU']")).sendKeys("Tester");
		d.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		d.findElement(By.xpath("//a[@class='_14Me7y']")).click();
		d.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[6]")).getText();
		
	}
}
