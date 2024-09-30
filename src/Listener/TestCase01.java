package Listener;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.TestResult;

import AssignmentTestNG.BaseClass;


public class TestCase01 {
	
	BaseClass base=new BaseClass();
	WebDriver driver;
	String tcID;
	
	@BeforeMethod
	public void login()
	{
		driver=base.driverInit();
	}
	
	@Test
	public void testcase01()
	{
		tcID="TC001";
		System.out.println("TC01 executed");
	}
	
	@Test
	public void testcase02()
	{
		tcID="TC002";
		System.out.println("TC02 executed");
		Assert.fail();
	}
	
	
	@AfterMethod
	public void logout(ITestResult res) throws IOException
	{
		if(ITestResult.FAILURE==res.getStatus())
		{
			Utility22 uti=new Utility22();
	
			uti.takesScreenShot(tcID, driver);
			
		}
		//driver.close();
		}
	

}

