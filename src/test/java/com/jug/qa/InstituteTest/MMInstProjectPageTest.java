package com.jug.qa.InstituteTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jug.qa.base.TestBase;
import com.jug.qa.pages.MMInstDashboardPage;

import com.jug.qa.pages.MMInstLoginPage;
import com.jug.qa.pages.MMInstMyOpportunityPage;
import com.jug.qa.pages.MMInstprojectPage;
import com.jug.qa.util.TestUtil;

public class MMInstProjectPageTest extends TestBase {
	
	MMInstLoginPage loginpage;
	
	MMInstDashboardPage dashboard;
	MMInstMyOpportunityPage opportunity;
	MMInstprojectPage projectpage;

	TestUtil testUtil;

	@BeforeMethod
	public void setUp() throws Exception {
		initialization();
		testUtil = new TestUtil();
		loginpage = new MMInstLoginPage();
	
        dashboard= new MMInstDashboardPage();
        opportunity= new MMInstMyOpportunityPage();
        projectpage=new MMInstprojectPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		dashboard.InstMyOpportunity();
	    opportunity.Instituteproject();
		

	
	}

	public MMInstProjectPageTest() {
		super();
	}

	@Test(priority = 1)
	public void instProjectview()  {
		projectpage.Instituteprojectview();
		
	}

	 @Test(priority = 2)
	 public void instdelete() throws Exception{
      projectpage.InstituteProjectDelete();
	 }
	

	@AfterMethod
	public void teardown() {
		driver.quit();
	}


}
