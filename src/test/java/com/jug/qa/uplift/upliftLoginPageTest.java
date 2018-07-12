package com.jug.qa.uplift;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jug.qa.base.TestBase;


import com.jug.qa.pages.upliftLoginPage;
import com.jug.qa.util.TestUtil;

public class upliftLoginPageTest extends TestBase {
	

	TestUtil testUtil;
	
upliftLoginPage upliftlogin;
	

	public upliftLoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		upliftlogin=new upliftLoginPage(); 
		
		
	}

	/*@Test(priority = 1)
	public void loginPageTitleTest() {
		String title = loginpage.validateLoginPageTitle();
		Assert.assertEquals(title, "Login Page");
	}

	@Test(priority = 2)
	public void JFLogoImageTest() {
		boolean flag = loginpage.validateJFImage();
		Assert.assertTrue(flag);
	}
*/
	@Test(priority = 3)
	public void loginTest() {
	upliftlogin.loginn(prop.getProperty("username"), prop.getProperty("password"));
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}



}
