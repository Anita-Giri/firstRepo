package com.jug.qa.IncubationTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jug.qa.base.TestBase;
import com.jug.qa.pages.MMIncDashboardPage;
import com.jug.qa.pages.MMIncIdeaFromIncubationPage;
import com.jug.qa.pages.MMIncLogindropdownPage;
import com.jug.qa.pages.MMIncProjectPage;
import com.jug.qa.util.TestUtil;

public class MMIncProjectPageTest extends TestBase {
	
	MMIncLogindropdownPage loginpage;

    MMIncDashboardPage incdashboardpage;
    MMIncIdeaFromIncubationPage incubationpage;
    MMIncProjectPage incubationprojectpage;
	
	
	TestUtil testUtil;

	@BeforeMethod
	public void setUp() throws Exception {
		initialization();
		testUtil = new TestUtil();
		loginpage = new MMIncLogindropdownPage();
		

		incdashboardpage = new MMIncDashboardPage();
		incubationprojectpage=new   MMIncProjectPage();
		incubationpage=new  MMIncIdeaFromIncubationPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		incdashboardpage.myopportunity();
}
	
	
	public MMIncProjectPageTest() {
		super();
	}

	

	
	@Test(priority = 1)
	public void Incubationprojecttitle() throws Exception {
		incubationprojectpage.incubationprojecttitle();
	
		
		}
	
	@Test(priority = 2)
	public void Incubationprojectview() throws Exception {
		incubationprojectpage.incubationprojectview();
	
		
		}
	
	@Test(priority = 3)
	public void Incubationprojectdelete() throws Exception {
		
		incubationprojectpage.incubationprojectdelete();
		
		}
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

	

}
