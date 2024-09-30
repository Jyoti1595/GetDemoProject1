
package ActionClass;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

import config.Configuration;

	public class KeyboardAction {
		
		public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
				WebDriver driver =new ChromeDriver();		
				driver.get("https://www.facebook.com/signup");
				driver.manage().window().maximize();
				
				WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
			
				Actions aa = new Actions(driver);
			
				aa.moveToElement(day).click().build().perform();
								for(int i=0; i<=10; i++)
				{
					aa.sendKeys(Keys.ARROW_DOWN).perform();
					Thread.sleep(2000);
				}
				
				
				for(int i=0; i<=10; i++)
				{
					aa.sendKeys(Keys.ARROW_UP).perform();
					Thread.sleep(2000);

				}
				
				
			}

		}


