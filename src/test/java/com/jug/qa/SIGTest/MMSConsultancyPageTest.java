package com.jug.qa.SIGTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.jug.qa.base.TestBase;
import com.jug.qa.pages.MMSConsultancyPage;
import com.jug.qa.pages.MMSLoginPage;
import com.jug.qa.pages.MMSMyOpportunity;
import com.jug.qa.pages.MMSProjectpage;
import com.jug.qa.pages.MMSdashboardPage;
import com.jug.qa.util.TestUtil;

public class MMSConsultancyPageTest extends TestBase {
	
	MMSLoginPage loginpage;
	MMSdashboardPage sigdash;
	MMSMyOpportunity opportunity;
	MMSProjectpage projectpage;
	MMSConsultancyPage consultancypage;
	String sheetName="SIGConsultancy";
	String sheetName1="SIGConsUpdateProgress";
   
	public MMSConsultancyPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws Exception {
		initialization();
		
		loginpage = new MMSLoginPage();
		sigdash = loginpage.loginn(prop.getProperty("username"), prop.getProperty("password"));
		opportunity= new MMSMyOpportunity();	
		sigdash.myOpportunityLink();
		consultancypage=new MMSConsultancyPage();
		opportunity.consultancytab();
		
	
	}
	
	@DataProvider
	public Object[][] getJFTestData(){
		
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}

	
	@DataProvider
	public Object[][] getJFGTestData(){
		
		Object data[][] = TestUtil.getTestData(sheetName1);
		return data;
	}

	@Test(priority=1)
	public void verifyconsultancyTitle() throws Exception{
		consultancypage.consultancyviewbutton();
	}
	
	@Test(priority=2)
	public void Consultancyviewbutton() throws Exception{
		consultancypage.consultancyviewbutton();
	}
	
	@Test(priority=3, dataProvider="getJFTestData")
	public void Consultancychaticon(String messagess) throws Exception{
		consultancypage.consultancychatclick(messagess);
		
	}
	
	@Test(priority=4, dataProvider="getJFGTestData" )
	public void Consultancyupdate(String milesname,String desc) throws Exception{
		consultancypage.consultancyupadteprogress(milesname, desc);
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	

}
