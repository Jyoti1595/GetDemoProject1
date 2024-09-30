package Autosuggestion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.http.ConnectionFailedException;

import config.Configuration;

public class NewD {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", Configuration.driverPath);

		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver d=new ChromeDriver(co);
		d.get("https://www.google.com");
		System.out.println(d.getTitle());
		
	}

}
