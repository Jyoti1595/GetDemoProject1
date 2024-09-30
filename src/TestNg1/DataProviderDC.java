package TestNg1;

import org.testng.annotations.DataProvider;

public class DataProviderDC {
	
	@DataProvider(name="LoginDataProvider")
	public Object[][] getdata()
	{
		Object[][] obj= {{"abc@gmail.com","acb"},{"xyz@gmail.com","xyz"}};
		return obj;
	}

}
