package com.jug.qa.InstituteTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jug.qa.base.TestBase;

import com.jug.qa.pages.MMInstLoginPage;
import com.jug.qa.util.TestUtil;

public class MMInstLoginPageTest extends TestBase{
	
MMInstLoginPage loginpage;



	
	TestUtil testUtil;
	


    
	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil=new TestUtil();
		loginpage=new MMInstLoginPage();
		
		
		
		
	}
	
	public MMInstLoginPageTest() {
		super();
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
