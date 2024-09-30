package New2024PGM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGPGMTable {
	@Test
	public void verify() {
		WebDriver d = new ChromeDriver();
		d.get("https://seleniumpractise.blogspot.com/");
		//d.manage().window().maximize();
		List<WebElement> allData = d.findElements(By.xpath("//table[@id=\"customers\"]//td"));  // all header will capture and display
		//Assert.assertEquals(allData.size(),30); // no of header can be count
		boolean Datastatus=false;
		for(WebElement e:allData)  // it will take 1st webele from the list and store in e variable
		{
			String value=e.getText();     // simply capture the all ele and display the console
			System.out.println(value);
			if(value.contains("Ola"))
			{
				Datastatus=true;
				break;

			}
			Assert.assertTrue(Datastatus, "Data is not present");

			
		}
		d.quit();
	}


}

