  
package Automation;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import config.Configuration;


public class Assignment1 {	
		public static void main(String[] args) throws InterruptedException  {
			System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
		
			
			//ChromeOptions co=new ChromeOptions();
			//co.addArguments("--remote-allow-origins=*");
			WebDriver d = new ChromeDriver();     //upcasting use driver is ref variable
			
			d.get("http://www.facebook.com/login");
			//d.findElement(By.xpath("//a[text[]='Sign Up']")).click();
			//d.navigate().back();
			
			d.findElement(By.xpath("//a[contains(text(),'Sign')]")).click();
			d.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Netra");
			d.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Pawar");
			Thread.sleep(1000);

			d.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("7656456756");
			Thread.sleep(1000);

			d.findElement(By.xpath("//input[@type='password']")).sendKeys("Netra@123");
		
			WebElement day=d.findElement(By.xpath("//select[@id=\"day\"]"));
			Select s=new Select(day);
			s.selectByVisibleText("15");
			
			WebElement month=d.findElement(By.xpath("//select[@id=\"month\"]"));
			Select s1=new Select(month);
			s1.selectByVisibleText("Jan");
			
			WebElement year=d.findElement(By.xpath("//select[@id=\"year\"]"));
			Select s2=new Select(year);
			s2.selectByVisibleText("1995");
			Thread.sleep(1000);
			
			
			d.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
			Thread.sleep(1000);
			
			d.findElement(By.xpath("//a[contains(text(),'Already have an account?')]")).click();
			
			d.findElement(By.xpath("//input[@name='email']")).sendKeys("Netra");
			d.findElement(By.xpath("//input[@id='pass']")).sendKeys("7656456756");
			d.findElement(By.xpath("//button[@value='1']")).click();
			Thread.sleep(1000);
		    
			d.findElement(By.xpath("//a[contains(text(),'Forg')]")).click();
		}
}

	