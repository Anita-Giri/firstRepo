package com.jug.qa.SIGTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jug.qa.base.TestBase;
import com.jug.qa.pages.MMSLoginPage;
import com.jug.qa.pages.MMSdashboardPage;
import com.jug.qa.pages.MyProfilePage;
import com.jug.qa.pages.SIGLogout;


public class SIGLogoutTest extends TestBase {
	
	MMSLoginPage loginpage;
	MMSdashboardPage sigdash;
	MyProfilePage profilepage;
	SIGLogout logout;
	
	public SIGLogoutTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setUp() throws Exception {
		initialization();
		
		loginpage = new MMSLoginPage();
		sigdash = loginpage.loginn(prop.getProperty("username"), prop.getProperty("password"));
        logout= new SIGLogout();
	    sigdash.userbutton();
		
	
	}
	


	@Test(priority=1)
	public void loggoutt() throws Exception{
		logout.SIGlogoutclick();
		}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}
