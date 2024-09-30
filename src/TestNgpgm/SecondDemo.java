package TestNgpgm;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SecondDemo {

	@Test(priority=1)
	public void tc01()
	{
		System.out.println("TC01 executed");
	}
	
	@Test(priority=-1)
	public void tc02()
	{
		Reporter.log("TC02 executed");
	}

	@Test(priority=0,retryAnalyzer = MyRetry.class)
	public void tc03()
	{
		Reporter.log("TC03 executed");
		Assert.fail();
}
}

