package PopAlert;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import config.Configuration;

public class ChildB2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demoqa.com/browser-windows");
		Thread.sleep(2000);
		d.findElement(By.xpath("//button[@id='windowButton']")).click();
		Set<String> win = d.getWindowHandles();
		
		System.out.println(win.size());
		
		Iterator<String> itr = win.iterator();
		while(itr.hasNext())	                  //itr.hasNext()==>true
		{
			String mainWin=itr.next();
			String childWin=itr.next();
			System.out.println(mainWin);           //id of main window
			System.out.println(childWin);          //id of child window
			
			d.switchTo().window(childWin);         //switch control to child window
			d.manage().window().maximize();
			Thread.sleep(2000);
			d.manage().window().minimize();
			Thread.sleep(2000);	


			d.switchTo().window(mainWin);
			d.manage().window().maximize();
			Thread.sleep(2000);
			d.manage().window().minimize();
			Thread.sleep(2000);	
			
		}
		
	}

}
