package com.jug.qa.InstituteTest;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jug.qa.base.TestBase;
import com.jug.qa.pages.MMInstLoginPage;
import com.jug.qa.pages.MMInstideasFromInstitutePage;
import com.jug.qa.util.TestUtil;

public class MMInstideasFromInstitutePageTest extends TestBase {
	
MMInstLoginPage loginpage;
MMInstideasFromInstitutePage ideaspage;

TestUtil testUtil;
	


    
	@BeforeMethod
	public void setUp() throws Exception {
		initialization();
		testUtil=new TestUtil();
		loginpage=new MMInstLoginPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		ideaspage=new MMInstideasFromInstitutePage();
		
		
		}
	
	public MMInstideasFromInstitutePageTest() {
		super();
	}

	@Test(priority = 1)
	public void insttitle() throws Exception  {
		ideaspage.InstituteIdeas();
		
		}
	
	@Test(priority = 2)
	public void instmysupport() throws Exception  {
		ideaspage.InstituteMySupport();
		
		}
	
	
	@AfterMethod
	public void teardown() {
     driver.quit();
	}



}
