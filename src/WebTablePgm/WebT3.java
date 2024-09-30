package WebTablePgm;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import config.Configuration;

	public class WebT3 {			
		public static void main(String[] args) {
					System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
					WebDriver d=new ChromeDriver();
					d.get("C:\\jd/pg.html");
					
					for(int i=1;i<=3;i++)
					{
						String completeRow=d.findElement(By.xpath("//table[@border='3']//tr[4]/td["+i+"]")).getText();
						System.out.println(completeRow);       
						
					}
					
	

		}
}
