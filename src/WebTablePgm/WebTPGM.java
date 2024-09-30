package WebTablePgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import config.Configuration;

public class WebTPGM {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
			WebDriver d=new ChromeDriver();
			d.get("C:\\jd/pg.html");
			d.manage().window().maximize();
			int row=d.findElements(By.xpath("//table[@border='3']//tr")).size();
			System.out.println(row);  //Table=4
		}

}
