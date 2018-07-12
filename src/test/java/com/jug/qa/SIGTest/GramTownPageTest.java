package com.jug.qa.SIGTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.jug.qa.base.TestBase;

import com.jug.qa.pages.MMSLoginPage;


import com.jug.qa.pages.MMSdashboardPage;
import com.jug.qa.pages.gramtownpage;
import com.jug.qa.util.TestUtil;

public class GramTownPageTest extends TestBase {

	MMSLoginPage loginpage;
	MMSdashboardPage sigdash;
	
    gramtownpage grampage;
	
	String sheetName="GramMessage";
	//String sheetName1="SIGConsUpdateProgress";
   
	public GramTownPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws Exception {
		initialization();
		grampage=new gramtownpage();
		loginpage = new MMSLoginPage();
		sigdash = loginpage.loginn(prop.getProperty("username"), prop.getProperty("password"));
	
		grampage=new gramtownpage();
	    sigdash.gramtowntab();
		
	
	}
	
	@DataProvider
	public Object[][] getJFTestData(){
		
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}

	
	

	@Test(priority=1)
	public void verifyGramTitle() throws Exception{
		grampage.Gramlink();
		}
	
	@Test(priority=2)
	public void Gramview() throws Exception{
		grampage.Gramviewbutton();
		
	}
	@Test(priority=3, dataProvider="getJFTestData" )
	public void verifyGramchat(String messagess) throws Exception{
		grampage.Gramchatclick(messagess);
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
}


