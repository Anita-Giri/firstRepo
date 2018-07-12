package com.jug.qa.IncubationTest;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jug.qa.base.TestBase;
import com.jug.qa.pages.MMIncDashboardPage;
import com.jug.qa.pages.MMIncGrantsFundingPage;

import com.jug.qa.pages.MMIncLogindropdownPage;
import com.jug.qa.pages.MMIncMyOpportunityPage;

import com.jug.qa.util.TestUtil;

public class MMIncGrantsfundingPageTest extends TestBase {

	
	MMIncLogindropdownPage loginpage;

    MMIncDashboardPage incdashboardpage;
    MMIncGrantsFundingPage grantspage;
    MMIncMyOpportunityPage opportunitypage;
	
	
	TestUtil testUtil;

	@BeforeMethod
	public void setUp() throws Exception {
		initialization();
		testUtil = new TestUtil();
		loginpage = new MMIncLogindropdownPage();
		incdashboardpage = new MMIncDashboardPage();
		opportunitypage=new  MMIncMyOpportunityPage();
		grantspage=new  MMIncGrantsFundingPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		incdashboardpage.myopportunity();
		opportunitypage.incubationgrantstab();
		
}
	
	
	public MMIncGrantsfundingPageTest() {
		super();
	}

	

	
	@Test(priority = 1)
	public void Incubationgrantsttitle() throws Exception {
		grantspage.incubationgrantstitle();
	
		
		}
	
	@Test(priority = 2)
	public void Incubationprojectview() throws Exception {
		grantspage.incubationgrantsview();
	
		
		}
	
	@Test(priority = 3)
	public void IncubationGrantsdelete() throws Exception {
		
		grantspage.incubationgrantsdelete();
		
		}
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

	
}
