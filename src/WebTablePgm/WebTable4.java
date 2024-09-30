package WebTablePgm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import config.Configuration;

public class WebTable4 {
		
	public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
				ChromeOptions co=new ChromeOptions();
				co.addArguments("--remote-allow-origins=*");


				WebDriver d=new ChromeDriver(co);
				d.get("C:\\jd/pg.html");
						
				for(int i=1;i<=4;i++)   //No of Rows
				{
					if(i==1)   //Header
					{
						String headerText=d.findElement(By.xpath("//table[@border='3']//tr["+i+"]/th[1]")).getText();
						System.out.println(headerText);       
					}
					else
					{
						String bodyText=d.findElement(By.xpath("//table[@border='3']//tr["+i+"]/td[1]")).getText();
						System.out.println(bodyText);     
						
					}
						
		

			}
	}
}
