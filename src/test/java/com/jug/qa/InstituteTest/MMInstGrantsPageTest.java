package com.jug.qa.InstituteTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jug.qa.base.TestBase;

import com.jug.qa.pages.MMInstDashboardPage;
import com.jug.qa.pages.MMInstGrantsPage;
import com.jug.qa.pages.MMInstLoginPage;
import com.jug.qa.pages.MMInstMyOpportunityPage;
import com.jug.qa.util.TestUtil;

public class MMInstGrantsPageTest  extends TestBase{
	
MMInstLoginPage loginpage;
	
	MMInstDashboardPage dashboard;
	MMInstMyOpportunityPage opportunity;
    MMInstGrantsPage grantspage;

	TestUtil testUtil;

	@BeforeMethod
	public void setUp() throws Exception {
		initialization();
		testUtil = new TestUtil();
		loginpage = new MMInstLoginPage();
	
         dashboard= new MMInstDashboardPage();
         opportunity= new MMInstMyOpportunityPage();
        grantspage= new MMInstGrantsPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		dashboard.InstMyOpportunity();
	    opportunity.InstituteGrantsfunding();
		

	
	}

	public MMInstGrantsPageTest() {
		super();
	}

	@Test(priority = 1)
	public void instGrantsview() throws Exception  {
    grantspage.InstituteGrantsview();
		
	}

	 @Test(priority = 2)
	 public void instGrantsdelete() throws Exception{
		grantspage.InstituteGrantsDelete(); 
	 }
	

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
