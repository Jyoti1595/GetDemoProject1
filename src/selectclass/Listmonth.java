package selectclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import config.Configuration;

public class Listmonth {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
	
		WebDriver d = new ChromeDriver(); 
		
		d.get("https://www.facebook.com/signup");
		d.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement month = d.findElement(By.xpath("//select[@name='birthday_month']"));
		
		Select s1=new Select(month);
		int len=s1.getOptions().size();
		
		System.out.println(len);
		for(int i=0;i<=len-1;i++)
		{
			String str=s1.getOptions().get(i).getText(); //getOption is used to we get the month nd display on the console
			System.out.println(str);
		}
		
		
		
		
		
		
		
	}

}




