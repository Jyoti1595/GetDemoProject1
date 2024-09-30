package Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo {
	
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibhav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//ChromeOptions co=new ChromeOptions();
		//co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Samsung");
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='G43f7e']//li"));
		Thread.sleep(2000);
		System.out.println(list.size());
		for(int i=0;i<=list.size();i++)
		{
			System.out.println(list.get(i).getText());
			
			String listElemt=list.get(i).getText();
			if(listElemt.equals("Samsung s22 ultra"))
			{
				list.get(i).click();
				break;
				
			}
			
		}	
	}

}
