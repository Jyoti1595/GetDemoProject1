package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	 
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibhav\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver d = new ChromeDriver();     //upcasting use driver is ref variable
		//WebDriver d1 = new ChromeDriver();
		//d1.get("http://www.facebook.com/");
		d.get("http://www.facebook.com/");
		
		d.manage().window().maximize();
		Thread.sleep(2000);	               //delay or time
		d.manage().window().minimize();
		
		d.navigate().to("http:\\www.google.com/");  //without using get method url
		
		d.manage().window().maximize();     //maximize browser
		Thread.sleep(2000);
		
		d.manage().window().minimize();     //minimize browser
		
		d.navigate().back();                //back to previous page
		Thread.sleep(2000);
		
		d.navigate().forward();             //navigate to next page
		Thread.sleep(2000);
		
		d.navigate().refresh();
		d.close();
		d.quit();
		
		}
}
