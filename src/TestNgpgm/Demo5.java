package TestNgpgm;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo5 {
	
	@Test
	public void login()
	{
		System.out.println("Login to application");
		Assert.fail();
	}
	@Test(dependsOnMethods="login")
	
	public void logout()
	{
		System.out.println("logout from application");
	}
	
}

