package com.jug.qa.InstituteTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jug.qa.base.TestBase;
import com.jug.qa.pages.MMInstDashboardPage;

import com.jug.qa.pages.MMInstHackathoPage;
import com.jug.qa.pages.MMInstLoginPage;
import com.jug.qa.pages.MMInstMyOpportunityPage;
import com.jug.qa.util.TestUtil;

public class MMInstHackathonPageTest extends TestBase {
MMInstLoginPage loginpage;
	
	MMInstDashboardPage dashboard;
	MMInstMyOpportunityPage opportunity;
     MMInstHackathoPage hackathonpage;

	TestUtil testUtil;

	@BeforeMethod
	public void setUp() throws Exception {
		initialization();
		testUtil = new TestUtil();
		loginpage = new MMInstLoginPage();
	
         dashboard= new MMInstDashboardPage();
         opportunity= new MMInstMyOpportunityPage();
        hackathonpage=new MMInstHackathoPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		dashboard.InstMyOpportunity();
	    opportunity.InstituteHackathon();
		

	
	}

	public MMInstHackathonPageTest() {
		super();
	}

	@Test(priority = 1)
	public void instconsultancyview() throws Exception  {
    hackathonpage.InstituteHackathonview();
		
	}

	 @Test(priority = 2)
	 public void instConsultancydelete() throws Exception{
	  hackathonpage.InstituteHackathonDelete();
	 }
	

	@AfterMethod
	public void teardown() {
		driver.quit();
	}


}
