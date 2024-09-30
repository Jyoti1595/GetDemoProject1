package New2024PGM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker {

	public static void main(String[] args) {
		WebDriver d= new ChromeDriver();
		 d.get("https://bookonwardticket.com/dummy-ticket/");
		 //d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 d.manage().window().maximize();
		 d.findElement(By.xpath("//input[@id='dummy-departure-date']")).click();
		 Select month=new Select(d.findElement(By.xpath("//select[@aria-label='Select month']")));
		 month.selectByVisibleText("Feb");
		 
		 Select year=new Select(d.findElement(By.xpath("//select[@aria-label='Select year']")));
		 year.selectByVisibleText("2024");
		 
		 String date="16";
		 
		 List<WebElement> alldates = d.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]"));
		 for(WebElement d1: alldates)
		 {
			 String s=d1.getText();
			 if(s.equals(date)) 
			 {
				 d1.click();
				 break;
		     }
		 }
		 
	}

}
