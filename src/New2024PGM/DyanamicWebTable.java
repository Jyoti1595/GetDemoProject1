package New2024PGM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyanamicWebTable {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://seleniumpractise.blogspot.com/");
		d.manage().window().maximize();
		List<WebElement> allheaders = d.findElements(By.xpath("//table[@id=\"customers\"]//th"));  // all header will capture and display
		System.out.println(allheaders.size()); // no of header can be count
		for(WebElement e:allheaders)  // it will take 1st webele from the list and store in e variable
		{
			String value=e.getText();     // simply capture the all ele and display the console
			System.out.println(value);
			
		}
		d.quit();
	}

}
