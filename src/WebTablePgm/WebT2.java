package WebTablePgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import config.Configuration;

	public class WebT2 {			
		
	public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
				
				
				ChromeOptions co=new ChromeOptions();
				co.addArguments("--remote-allow-origins=*");


				WebDriver d=new ChromeDriver(co);
				d.get("C:\\jd/pg.html");
				int colSize=d.findElements(By.xpath("//table[@border='3']//tr[2]/td")).size();
				System.out.println(colSize);       //3
				
			
				String text =d.findElement(By.xpath("//table[@border='3']//tr[4]/td[2]")).getText();
				System.out.println(text);          //Java
				
				int HeadColSize=d.findElements(By.xpath("//table[@border='3']//tr[1]/th")).size();
				System.out.println(HeadColSize);      //3
				
				String text1 =d.findElement(By.xpath("//table[@border='3']//tr[1]/th[2]")).getText();
				System.out.println(text1);             //Booktype
				
				
			}
}
