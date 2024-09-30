package TestNg1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx {
	
	@Test(dataProvider="LoginDataProvider")
	public void loginTest(String email,String pass)
	{
		System.out.println(email+" "+pass);
	}
	
	@DataProvider(name="LoginDataProvider")
	public Object[][] getdata()
	{
		Object[][] obj= {{"abc@gmail.com","acb"},{"xyz@gmail.com","xyz"}};
		return obj;
	}
	
	
}

