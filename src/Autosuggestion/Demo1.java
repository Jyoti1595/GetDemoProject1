package Autosuggestion;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import config.Configuration;

	public class Demo1 {
		
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",Configuration.driverPath);
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();

			driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("apple mobile");
			Thread.sleep(3000);
			
			List<WebElement> list = driver.findElements(By.xpath("//div[@class='autocomplete-results-container']/div"));
			Thread.sleep(5000);
			
			System.out.println(list.size());
			for(int i=0;i<=list.size()-1;i++) 
			{
				System.out.println(list.get(i).getText());
				
				String lstElement= list.get(i).getText();
				
				if(lstElement.equals("apple mobile")) 
				{
					list.get(i).click();
					break;
				
				}
			}

		}
}
		
		
