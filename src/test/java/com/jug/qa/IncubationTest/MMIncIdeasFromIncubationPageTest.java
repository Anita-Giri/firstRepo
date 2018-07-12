package com.jug.qa.IncubationTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jug.qa.base.TestBase;
import com.jug.qa.pages.MMIncDashboardPage;
import com.jug.qa.pages.MMIncIdeaFromIncubationPage;
import com.jug.qa.pages.MMIncLogindropdownPage;

import com.jug.qa.util.TestUtil;

public class MMIncIdeasFromIncubationPageTest extends TestBase{
	
	
	MMIncLogindropdownPage loginpage;

    MMIncDashboardPage incdashboardpage;
    MMIncIdeaFromIncubationPage incubationpage;
	
	
	TestUtil testUtil;

	@BeforeMethod
	public void setUp() throws Exception {
		initialization();
		testUtil = new TestUtil();
		loginpage = new MMIncLogindropdownPage();
		

		incdashboardpage = new MMIncDashboardPage();
		incubationpage=new  MMIncIdeaFromIncubationPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		
}
	
	
	public MMIncIdeasFromIncubationPageTest() {
		super();
	}

	

	
	@Test(priority = 1)
	public void Incubationideas() throws Exception {
		incubationpage.ideasfromincubation();
	
		
		}
	
	@Test(priority = 2)
	public void Incubationmysupport() throws Exception {
		incubationpage.incmysupport();
	
		
		}
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

	

}
