package com.jug.qa.InstituteTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jug.qa.base.TestBase;
import com.jug.qa.pages.MMInstConsultancyPage;
import com.jug.qa.pages.MMInstDashboardPage;
import com.jug.qa.pages.MMInstLoginPage;
import com.jug.qa.pages.MMInstMyOpportunityPage;

import com.jug.qa.util.TestUtil;

public class MMInstConsultancyPageTest  extends TestBase {
	
	MMInstLoginPage loginpage;
	
	MMInstDashboardPage dashboard;
	MMInstMyOpportunityPage opportunity;
	MMInstConsultancyPage consultancypage;

	TestUtil testUtil;

	@BeforeMethod
	public void setUp() throws Exception {
		initialization();
		testUtil = new TestUtil();
		loginpage = new MMInstLoginPage();
	
        dashboard= new MMInstDashboardPage();
        opportunity= new MMInstMyOpportunityPage();
        consultancypage=new MMInstConsultancyPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		dashboard.InstMyOpportunity();
	    opportunity.InstituteConsultancy();
		

	
	}

	public MMInstConsultancyPageTest() {
		super();
	}

	@Test(priority = 1)
	public void instconsultancyview()  {
		consultancypage.InstituteConsultancyview();
		
	}

	 @Test(priority = 2)
	 public void instConsultancydelete() throws Exception{
		 consultancypage.InstituteConsultancyDelete();
	 }
	

	@AfterMethod
	public void teardown() {
		driver.quit();
	}



}
