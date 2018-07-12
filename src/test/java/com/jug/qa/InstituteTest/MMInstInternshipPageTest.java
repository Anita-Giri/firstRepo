package com.jug.qa.InstituteTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jug.qa.base.TestBase;
import com.jug.qa.pages.MMInstDashboardPage;
import com.jug.qa.pages.MMInstInternshipPage;
import com.jug.qa.pages.MMInstLoginPage;

import com.jug.qa.util.TestUtil;

public class MMInstInternshipPageTest extends TestBase {

	MMInstLoginPage loginpage;
	MMInstInternshipPage internship;
	MMInstDashboardPage dashboard;

	TestUtil testUtil;

	@BeforeMethod
	public void setUp() throws Exception {
		initialization();
		testUtil = new TestUtil();
		loginpage = new MMInstLoginPage();
	
        dashboard= new MMInstDashboardPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		dashboard.InstMyOpportunity();
		internship = new MMInstInternshipPage();

	
	}

	public MMInstInternshipPageTest() {
		super();
	}

	@Test(priority = 1)
	public void instinternship() throws Exception {
		internship.InstituteInternship();

	}

	 @Test(priority = 2)
	 public void instdelete() throws Exception {
	  internship.InstituteDelete();
	 }
	

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
