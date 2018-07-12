package com.jug.qa.SIGTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.jug.qa.base.TestBase;
import com.jug.qa.pages.MMSLoginPage;
import com.jug.qa.pages.MMSMyOpportunity;
import com.jug.qa.pages.MMSProjectpage;
import com.jug.qa.pages.MMSdashboardPage;
import com.jug.qa.util.TestUtil;

public class MMSProjectPageTest extends TestBase {

	MMSLoginPage loginpage;
	MMSdashboardPage sigdash;
	MMSMyOpportunity opportunity;
	MMSProjectpage projectpage;
String sheetName = "Sheet3";

String sheetName1="Sheet4";
	
	TestUtil testUtil;

   
	public MMSProjectPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws Exception {
		initialization();
		
		loginpage = new MMSLoginPage();
		sigdash = loginpage.loginn(prop.getProperty("username"), prop.getProperty("password"));
		opportunity= new MMSMyOpportunity();	
		sigdash.myOpportunityLink();
		projectpage=new MMSProjectpage();
		
	
	}
	
	
	@DataProvider
	public Object[][] getJFTestData(){
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}

	@Test(priority=1)
	public void verifyProjectTitle() throws InterruptedException{
		projectpage.projectDetails();
	}
	
	@Test(priority=2)
	public void Projectapply() throws Exception{
		projectpage.projectapply();
	}
	
	@Test(priority=3, dataProvider="getJFTestData" )
	public void SIGProjectchat(String messages) throws Exception{
		projectpage.SIGChat(messages);
	}
	
	@DataProvider
	public Object[][] getJFGTestData(){
		Object data[][] = TestUtil.getTestData(sheetName1);
		return data;
	}
	
	@Test(priority=4, dataProvider="getJFGTestData")
	public void SIGProjectupdateprogress(String milestonename, String desc) throws Exception{
		projectpage.SIGupdate(milestonename, desc);
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}
