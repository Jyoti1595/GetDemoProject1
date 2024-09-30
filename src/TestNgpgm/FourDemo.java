package TestNgpgm;

import org.testng.annotations.Test;

public class FourDemo {
	
	@Test
	public void tc01()
	{
		System.out.println("Test case 01 running");
	}
	
	@Test
	public void tc02() throws InterruptedException
	{
		System.out.println("Test case 02 running");
		Thread.sleep(3000);

	}
	
	@Test
	
	public void tc03()
	{
		System.out.println("Test case 03 running");
	}

}
