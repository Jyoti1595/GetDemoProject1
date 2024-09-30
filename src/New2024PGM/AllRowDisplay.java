package New2024PGM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AllRowDisplay {

	@Test
	public void verify1() {
		WebDriver d = new ChromeDriver();
		d.get("https://seleniumpractise.blogspot.com/");
		d.manage().window().maximize();
		List<WebElement> allRows = d.findElements(By.xpath("//table[@id=\"customers\"]//tr"));  // all header will capture and display
		//Assert.assertEquals(allRows.size(), 7,"match"); // no of row can be count
		boolean status= false;

		for(WebElement e:allRows)  // it will take 1st webele from the list and store in e variable
		{
			String value=e.getText();     // simply capture the all ele and display the console
			System.out.println(value);
			if(value.contains("Ola"))
			{
				status=true;
				System.out.println(status);
				break;
			}
			Assert.assertTrue(status, "Header is not match");

		}
		//d.quit();
	}

}

