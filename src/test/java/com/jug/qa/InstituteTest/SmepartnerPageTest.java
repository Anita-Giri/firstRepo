package com.jug.qa.InstituteTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jug.qa.base.TestBase;
import com.jug.qa.pages.MMInstDashboardPage;

import com.jug.qa.pages.MMInstLoginPage;

import com.jug.qa.pages.SMEPartnerPage;
import com.jug.qa.pages.ViewListPage;
import com.jug.qa.util.TestUtil;

public class SmepartnerPageTest extends TestBase {

	MMInstLoginPage loginpage;

	MMInstDashboardPage dashboard;
	SMEPartnerPage smepage;
	ViewListPage viewpage;

	TestUtil testUtil;

	@BeforeMethod
	public void setUp() throws Exception {
		initialization();
		testUtil = new TestUtil();
		loginpage = new MMInstLoginPage();

		dashboard = new MMInstDashboardPage();
		viewpage = new ViewListPage();
		smepage = new SMEPartnerPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		dashboard.Instviewlist();
	

	}

	public SmepartnerPageTest() {
		super();
	}

	@Test(priority = 1)
	public void instsmeview() throws Exception {
		smepage.Instituteviewlistsme();
		
		

	}

	

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
