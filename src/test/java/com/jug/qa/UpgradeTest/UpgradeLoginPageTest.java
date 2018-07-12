package com.jug.qa.UpgradeTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.jug.qa.base.TestBase;

import com.jug.qa.pages.upgradeLoginPage;
import com.jug.qa.util.TestUtil;

public class UpgradeLoginPageTest extends TestBase {
	
	public UpgradeLoginPageTest() {
		super();
	}

	upgradeLoginPage loginpage;

     TestUtil testUtil;
	


    
	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil=new TestUtil();
		loginpage = new upgradeLoginPage();
		
		
		
	}

	
	
	
	@Test(priority = 1)
	public void loginTest() {
     loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	

	
	@AfterMethod
	public void teardown() {
	driver.quit();
	}


}
