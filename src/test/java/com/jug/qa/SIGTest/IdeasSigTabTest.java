package com.jug.qa.SIGTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jug.qa.base.TestBase;


import com.jug.qa.pages.IdeasSigTabPage;


import com.jug.qa.pages.MMSLoginPage;
import com.jug.qa.pages.MMSdashboardPage;


public class IdeasSigTabTest extends TestBase {

	public IdeasSigTabTest() {
		super();
	}

	MMSLoginPage loginpage;
	MMSdashboardPage sigdash;
	IdeasSigTabPage ideassigtab;

   

    
	@BeforeMethod
	public void setUp() {
		initialization();
		 loginpage = new MMSLoginPage();
		 sigdash= new MMSdashboardPage();
		 ideassigtab=new IdeasSigTabPage();
		
		 loginpage.loginn(prop.getProperty("username"), prop.getProperty("password"));
	     sigdash.clickonideassig();
	}

	@Test(priority = 1)
	public void SIGifsigTitleTest() {

		ideassigtab.ideasdetail();
	}

	@Test(priority = 2)
	public void viewresponse() throws Exception {
	    ideassigtab.mysupport();
	}
	

	@AfterMethod
	public void teardown() {
		driver.quit();
	}


}
