package com.jug.qa.IncubationTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jug.qa.base.TestBase;
import com.jug.qa.pages.MMIncLogindropdownPage;

import com.jug.qa.util.TestUtil;

public class MMIncLoginlinkPageTest extends TestBase{
	
	public MMIncLoginlinkPageTest() {
		super();
	}

	MMIncLogindropdownPage loginpage;



	
	TestUtil testUtil;
	


    
	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil=new TestUtil();
		//loginpage = new upgradeLoginPage();
		loginpage=new MMIncLogindropdownPage();
		
		
		
		
	}

	@Test(priority = 1)
	public void loginTest() throws Exception  {
		
		loginpage.login(prop.getProperty("username"), prop.getProperty("password")); 
	}
	
	
	
		

	

	
	@AfterMethod
	public void teardown() {
    driver.quit();
	}

}
