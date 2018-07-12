package com.jug.qa.SIGTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.jug.qa.base.TestBase;
import com.jug.qa.pages.MMSLoginPage;
import com.jug.qa.pages.MMSdashboardPage;
import com.jug.qa.pages.MyProfilePage;


public class MyProfilePageTest  extends TestBase {

	
	MMSLoginPage loginpage;
	MMSdashboardPage sigdash;
	MyProfilePage profilepage;
  
	
	
	//String sheetName1="SIGConsUpdateProgress";
   
	public MyProfilePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws Exception {
		initialization();
		
		loginpage = new MMSLoginPage();
		sigdash = loginpage.loginn(prop.getProperty("username"), prop.getProperty("password"));
        profilepage=new MyProfilePage();
	    sigdash.profiletab();
		
	
	}
	


	@Test(priority=1)
	public void leaderbutton() throws Exception{
		profilepage.SIGLeaderDetails();
		}
	
@Test(priority=2)
	public void profilecoordinator() throws Exception{
		profilepage.SIGCoordinatorDetils();
		
	}
	@Test(priority=3 )
	public void profilemilestone() throws Exception{
		profilepage.Milestoneclick();
		
	}
	
	
	@Test(priority=4 )
	public void profiletechnologyclick() throws Exception{
		profilepage.technologyclick();
		
	}
	

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}
