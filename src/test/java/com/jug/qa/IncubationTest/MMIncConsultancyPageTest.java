package com.jug.qa.IncubationTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jug.qa.base.TestBase;
import com.jug.qa.pages.MMIncConsultancyPage;
import com.jug.qa.pages.MMIncDashboardPage;

import com.jug.qa.pages.MMIncLogindropdownPage;
import com.jug.qa.pages.MMIncMyOpportunityPage;
import com.jug.qa.util.TestUtil;

public class MMIncConsultancyPageTest extends TestBase {
	
	MMIncLogindropdownPage loginpage;

    MMIncDashboardPage incdashboardpage;
    MMIncConsultancyPage consultancypage;
    MMIncMyOpportunityPage opportunitypage;
	
	
	TestUtil testUtil;

	@BeforeMethod
	public void setUp() throws Exception {
		initialization();
		testUtil = new TestUtil();
		loginpage = new MMIncLogindropdownPage();
		incdashboardpage = new MMIncDashboardPage();
		opportunitypage=new  MMIncMyOpportunityPage();
		consultancypage=new  MMIncConsultancyPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		incdashboardpage.myopportunity();
		opportunitypage.incubationconsultancytab();
		
}
	
	
	public MMIncConsultancyPageTest() {
		super();
	}

	

	
	@Test(priority = 1)
	public void IncubationConsultancytitle() throws Exception {
		consultancypage.incubationConsultancystitle();
	
		
		}
	
	@Test(priority = 2)
	public void IncubationConsultancyview() throws Exception {
		consultancypage.incubationConsultancyview();
	
		
		}
	
	@Test(priority = 3)
	public void IncubationConsultancydelete() throws Exception {
		
		consultancypage.incubationConsultancydelete();
		
		}
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

	
	

}
