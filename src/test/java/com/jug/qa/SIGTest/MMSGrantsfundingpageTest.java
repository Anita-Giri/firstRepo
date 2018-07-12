package com.jug.qa.SIGTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jug.qa.base.TestBase;
import com.jug.qa.pages.MMSGrantsfundingpage;
import com.jug.qa.pages.MMSLoginPage;
import com.jug.qa.pages.MMSMyOpportunity;
import com.jug.qa.pages.MMSProjectpage;
import com.jug.qa.pages.MMSdashboardPage;

public class MMSGrantsfundingpageTest extends TestBase {
	
	MMSLoginPage loginpage;
	MMSdashboardPage sigdash;
	MMSMyOpportunity opportunity;
	MMSProjectpage projectpage;
	MMSGrantsfundingpage grantsfunding;

   
	public MMSGrantsfundingpageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws Exception {
		initialization();
		
		loginpage = new MMSLoginPage();
		sigdash = loginpage.loginn(prop.getProperty("username"), prop.getProperty("password"));
		opportunity= new MMSMyOpportunity();	
		sigdash.myOpportunityLink();
		 grantsfunding=new MMSGrantsfundingpage();
		 opportunity.grantsfundingtab();
		
	
	}

	@Test(priority=1)
	public void verifygrantsTitle() throws Exception{
		grantsfunding.grantslink();
	}
	
	@Test(priority=2)
	public void verifygrantsview() throws Exception{
		grantsfunding.grantsview();
	}
	
	/*@Test(priority=2)
	public void verifygrantsdelete() throws Exception{
		grantsfunding.grantsdelete();
	}*/
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	

}
