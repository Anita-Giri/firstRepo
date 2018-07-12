package com.jug.qa.SIGTest;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import com.jug.qa.base.TestBase;
import com.jug.qa.pages.MMSConsultancyPage;
import com.jug.qa.pages.MMSGrantsfundingpage;
import com.jug.qa.pages.MMSLoginPage;
import com.jug.qa.pages.MMSMyOpportunity;
import com.jug.qa.pages.MMSProjectpage;
import com.jug.qa.pages.MMSdashboardPage;

public class MMSMyOpportunityTest extends TestBase {
	
    MMSLoginPage loginpage;
	
	MMSdashboardPage sigdash;
	
	MMSMyOpportunity opportunity;
	MMSProjectpage projectpage;
	MMSGrantsfundingpage granfundpage;
	MMSConsultancyPage consultancy;
	
   
	public MMSMyOpportunityTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		
		loginpage = new MMSLoginPage();
		sigdash = loginpage.loginn(prop.getProperty("username"), prop.getProperty("password"));
		opportunity= new MMSMyOpportunity();	
		sigdash.myOpportunityLink();
	
	}

	




	

	@AfterMethod
	public void teardown() {
		driver.quit();
	}


}
