package com.jug.qa.SIGTest;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jug.qa.base.TestBase;

import com.jug.qa.pages.MMSLoginPage;
import com.jug.qa.pages.MMSdashboardPage;

public class MMSLoginPageTest extends TestBase{
	
	MMSLoginPage loginpage;
	
	MMSdashboardPage sigdashboard;

	public MMSLoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new MMSLoginPage();
		sigdashboard= new MMSdashboardPage();
		
	}



	@Test(priority = 1)
	public void loginTest() {
	sigdashboard = loginpage.loginn(prop.getProperty("username"), prop.getProperty("password"));
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}


}
