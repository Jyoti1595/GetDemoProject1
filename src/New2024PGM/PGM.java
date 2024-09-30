package New2024PGM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import config.Configuration;

public class PGM {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",Configuration.driverPath);
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver d= new ChromeDriver(co);
		d.get("https://www.facebook.com");
		List<WebElement> links = d.findElements(By.tagName("a"));
		System.out.println("Total no of links found:" +links.size());
		
		d.close();
		
}

}
