package PopAlert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import config.Configuration;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
		WebDriver d =new ChromeDriver();
		d.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		d.findElement(By.xpath("//input[@name='proceed']")).click();
		
		Alert a=d.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(a.getText());
		a.accept();
		//a.dismiss();

		
	

}
}