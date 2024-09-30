package TestNgpgm;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FDemo {
	
	@BeforeMethod
	public void loginToApp()
	{
		Reporter.log("Application login successful",true);
	}
	
	@AfterMethod
	public void logout()
	{
		Reporter.log("Logout from application",true);
	}

	@BeforeClass
	public void lunchBrowser()
	{
		Reporter.log("Launch browser ",true);
	}
	
	
	
	
	@Test
	public void tc1()
	{
		Reporter.log("TC1 executed");
	}
	
	@Test
	public void tc2()
	{
		Reporter.log("TC2 executed");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("Close browser",true);
	}


	
	@Test
	public void tc3()
	{
		Reporter.log("TC3 executed");
	}
	
	
	
	
	
	
}
