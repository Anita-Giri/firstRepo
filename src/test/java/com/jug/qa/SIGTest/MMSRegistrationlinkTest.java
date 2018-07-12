package com.jug.qa.SIGTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.jug.qa.base.TestBase;

import com.jug.qa.pages.MMSLoginPage;

import com.jug.qa.pages.MMSRegistrationlinkPage;
import com.jug.qa.util.TestUtil;

public class MMSRegistrationlinkTest extends TestBase {
	
	public MMSRegistrationlinkTest() {
		super();
	}

	MMSLoginPage loginpage;
	MMSRegistrationlinkPage sigregisterlink;

	String sheetName = "Sheet1";
	
	TestUtil testUtil;
	


    
	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil=new TestUtil();
		 loginpage = new MMSLoginPage();
		 sigregisterlink=new MMSRegistrationlinkPage();
		
		
	}

	
	@DataProvider
	public Object[][] getJFTestData(){
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	
	@Test(priority = 1, dataProvider="getJFTestData")
	public void sigRegisterlinkclick(String ftname,String aos,String typ1,String Part,String sigleader,String Sigmobileno,String emailid, String adharr, String coordinatorname,String sigmobileno, String emailidd, String adharnum, String address,
			String cityy,String pincodee) throws Exception {
		
		sigregisterlink.Registertioclick();
		
	Thread.sleep(8000);
		
		sigregisterlink.Registertionclick( ftname,aos, typ1, Part, sigleader,Sigmobileno, emailid, adharr, coordinatorname,sigmobileno,emailidd,adharnum,address,cityy,pincodee);
		
}
	

	
	@AfterMethod
	public void teardown() {
	driver.quit();
	}


}
