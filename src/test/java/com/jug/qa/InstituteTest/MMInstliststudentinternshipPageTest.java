package com.jug.qa.InstituteTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jug.qa.base.TestBase;
import com.jug.qa.pages.ListofSTudentInternshipPage;
import com.jug.qa.pages.MMInstDashboardPage;
import com.jug.qa.pages.MMInstLoginPage;
import com.jug.qa.pages.SMEPartnerPage;
import com.jug.qa.pages.ViewListPage;
import com.jug.qa.util.TestUtil;

public class MMInstliststudentinternshipPageTest  extends TestBase{
	MMInstLoginPage loginpage;

	MMInstDashboardPage dashboard;
	SMEPartnerPage smepage;
	ViewListPage viewpage;
	ListofSTudentInternshipPage internshippage;

	TestUtil testUtil;

	@BeforeMethod
	public void setUp() throws Exception {
		initialization();
		testUtil = new TestUtil();
		loginpage = new MMInstLoginPage();

		dashboard = new MMInstDashboardPage();
		viewpage = new ViewListPage();
		smepage = new SMEPartnerPage();
		internshippage= new ListofSTudentInternshipPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		dashboard.Instviewlist();
		viewpage.Instituteliststudentintern();
	

	}

	public MMInstliststudentinternshipPageTest() {
		super();
	}

	@Test(priority = 1)
	public void instinternshipview() throws Exception {
		internshippage.Instituteviewstudentinternship();
		
		}
	
	@Test(priority = 2)
	public void inststudentprofileview() throws Exception {
		internshippage.Instituteviewprofileinternship();
		
		}

	

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
