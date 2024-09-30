package TestNgpgm;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class demoAssert {
	@Test
	public void Tc01()
	{
		SoftAssert soft=new SoftAssert();
		String s="Hiii";
		String s1="Hello";
		
		soft.assertEquals(s, s1);   //failed
		soft.assertEquals(true, false);
		//soft.assertEquals(15, 58);
		//soft.assertEquals('J', 'V');
		boolean status=false;
		soft.assertTrue(status);     //failed
		soft.assertNotEquals(s, s1); //pass
		System.out.println("After Assertion");
		soft.assertAll();
		
		
	}

}
