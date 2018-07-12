package com.jug.qa.InstituteTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jug.qa.base.TestBase;

import com.jug.qa.pages.ListofStudentProjectPage;
import com.jug.qa.pages.MMInstDashboardPage;
import com.jug.qa.pages.MMInstLoginPage;
import com.jug.qa.pages.SMEPartnerPage;
import com.jug.qa.pages.ViewListPage;
import com.jug.qa.util.TestUtil;

public class MMInstListofStudentAppliedProjectPageTest extends TestBase {
	
	MMInstLoginPage loginpage;

	MMInstDashboardPage dashboard;
	SMEPartnerPage smepage;
	ViewListPage viewpage;
	ListofStudentProjectPage viewprojectpage;
	TestUtil testUtil;

	@BeforeMethod
	public void setUp() throws Exception {
		initialization();
		testUtil = new TestUtil();
		loginpage = new MMInstLoginPage();

		dashboard = new MMInstDashboardPage();
		viewpage = new ViewListPage();
		smepage = new SMEPartnerPage();
		viewprojectpage=new ListofStudentProjectPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		dashboard.Instviewlist();
		viewpage.Instituteliststudentproject();
	

	}

	public MMInstListofStudentAppliedProjectPageTest() {
		super();
	}

	@Test(priority = 1)
	public void instprojectview() throws Exception {
		viewprojectpage.Instituteliststudentproject();
		
		}
	
	@Test(priority = 2)
	public void instprojectstudentprofileview() throws Exception {
		viewprojectpage.Instituteviewstudentprofileproject();
		
		}

	

	@AfterMethod
	public void teardown() {
		driver.quit();
	}


}
