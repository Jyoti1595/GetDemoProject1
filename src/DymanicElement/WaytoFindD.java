package DymanicElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import config.Configuration;

public class WaytoFindD {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
		WebDriver d=new ChromeDriver();
		d.get("http://www.half.ebay.com");
		//d.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("Java");
		//d.findElement(By.xpath("//input[@type='text']")).sendKeys("Java");
		//d.findElement(By.xpath("//input[@type='submit']")).click();
		//d.findElement(By.id("gh-ac")).sendKeys("java");
		 d.findElement(By.xpath("//input[contains(@class, 'gh-tb ui-autocomplete-input')]")).sendKeys("java");
		 d.findElement(By.xpath("//a[contains(text(), 'Sell')]")).click();	 
		 
		 List<WebElement> linkList= d.findElements(By.tagName("a"));
		 System.out.println(linkList.size());
		 
		 for(int i=0;i<linkList.size();i++)
		 {
			 String linkText=linkList.get(i).getText();
			 System.out.println(linkText);
		 }
		 
		 
	}

}
