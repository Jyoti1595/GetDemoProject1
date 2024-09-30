
package Listener;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import config.Configuration;

public class Utility22 {

	WebDriver driver;
	String tcID;
	public void takesScreenShot(String tcID, WebDriver driver) throws IOException
	{
	//BaseClass base =new BaseClass();

	//driver=base.driverInit();
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	Date d= new Date();

	String date = d.toString();

	String str = date.replace(":", "_");
   
    File f=new File(Configuration.screenshotPath+"_"+str+".jpg");
    FileHandler.copy(src, f);


}


}

