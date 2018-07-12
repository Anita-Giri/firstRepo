package com.jug.qa.IncubationTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jug.qa.base.TestBase;

import com.jug.qa.pages.MMIncDashboardPage;
import com.jug.qa.pages.MMIncHackathonPage;
import com.jug.qa.pages.MMIncLogindropdownPage;
import com.jug.qa.pages.MMIncMyOpportunityPage;
import com.jug.qa.util.TestUtil;

public class MMIncHackathonPageTest extends TestBase {

	
	MMIncLogindropdownPage loginpage;

    MMIncDashboardPage incdashboardpage;
  MMIncHackathonPage hackathonpage;
    MMIncMyOpportunityPage opportunitypage;
	
	
	TestUtil testUtil;

	@BeforeMethod
	public void setUp() throws Exception {
		initialization();
		testUtil = new TestUtil();
		loginpage = new MMIncLogindropdownPage();
		incdashboardpage = new MMIncDashboardPage();
		opportunitypage=new  MMIncMyOpportunityPage();
		hackathonpage= new  MMIncHackathonPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		incdashboardpage.myopportunity();
		opportunitypage.incubationHackathontab();
		
}
	
	
	public MMIncHackathonPageTest() {
		super();
	}

	

	
	@Test(priority = 1)
	public void IncubationHackathonttitle() throws Exception {
		hackathonpage.incubationhackathontitle();
	
		
		}
	
	@Test(priority = 2)
	public void IncubationHackathonview() throws Exception {
		hackathonpage.incubationhackathonview();	
		}
	
	@Test(priority = 3)
	public void IncubationHackathondelete() throws Exception {
		
		hackathonpage.incubationhackathondelete();
		
		}
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
