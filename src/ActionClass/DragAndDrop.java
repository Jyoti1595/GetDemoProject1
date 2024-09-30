
package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import config.Configuration;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				Configuration.driverPath);
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.globalsqa.com/demo-site/draganddrop");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().frame(2);
		Thread.sleep(2000);
		System.out.println("step 1");
		WebElement src = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement dest = driver.findElement(By.xpath("//div[@id='trash']"));
		Actions a = new Actions(driver);
		a.dragAndDrop(src, dest).perform();
	}

}
