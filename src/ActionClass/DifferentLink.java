package ActionClass;



	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

import config.Configuration;

	public class DifferentLink {

		public static void main(String[] args) {

			System.setProperty("webdriver.chrome.driver",
					Configuration.driverPath);
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();

			List<WebElement> xyz = driver.findElements(By.xpath("//a"));

			int a = xyz.size();

			System.out.println(a);

			for (int i = 0; i <= a - 1; i++) {
				System.out.println(xyz.get(i).getText());
			}

		}
	}

