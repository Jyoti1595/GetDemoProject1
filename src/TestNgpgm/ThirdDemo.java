package TestNgpgm;

import org.testng.annotations.Test;

public class ThirdDemo {
	
	@Test
	public void tc01()
	{
		System.out.println("Test case 01 running");
	}
	
	@Test(priority=-1,invocationCount=2,enabled=false)
	public void tc02()
	{
		System.out.println("Test case 02 running");
	}
	
	@Test(enabled=false)
	public void tc03()
	{
		System.out.println("Test case 03 running");
	}
	
}
