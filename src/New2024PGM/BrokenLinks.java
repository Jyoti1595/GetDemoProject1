package New2024PGM;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException, IOException {
		 WebDriver d= new ChromeDriver();
		 d.get("https://demo.guru99.com/test/newtours/");
		 d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 List link = d.findElements(By.tagName("a"));// Capture the all links
		 System.out.println("Total number of Links:"+ link.size()); //count the no of links
		 for(int i=0; i<link.size();i++)
		 {
			  WebElement e = (WebElement) link.get(i);
			  String url= e.getAttribute("href");
			  URL links= new URL(url);
			  HttpURLConnection httpconn = (HttpURLConnection) links.openConnection();
			  Thread.sleep(2000);
			  httpconn.connect();
			  int rescode=httpconn.getResponseCode();
			  if(rescode==200)
			  {
				  System.out.println(url+"-"+ "url is valid");
			  }
			  else
			  {
				  System.out.println(url+ "url is broken");
				  
			  }
		 }
		 
		 
	}
	

}
