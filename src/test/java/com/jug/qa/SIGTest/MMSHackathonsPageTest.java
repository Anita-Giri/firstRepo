package com.jug.qa.SIGTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.jug.qa.base.TestBase;

import com.jug.qa.pages.MMSLoginPage;
import com.jug.qa.pages.MMSMyOpportunity;

import com.jug.qa.pages.MMSdashboardPage;
import com.jug.qa.pages.MMShackathonsPage;
import com.jug.qa.util.TestUtil;
public class MMSHackathonsPageTest extends TestBase {
	MMSLoginPage loginpage;
	MMSdashboardPage sigdash;
	MMSMyOpportunity opportunity;
    MMShackathonsPage hackathonpage;
	String sheetName="HackathonMessage";
	String sheetName1="Hackathonupdateprogress";
   
	public MMSHackathonsPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws Exception {
		initialization();
		
		loginpage = new MMSLoginPage();
		sigdash = loginpage.loginn(prop.getProperty("username"), prop.getProperty("password"));
		opportunity= new MMSMyOpportunity();	
		sigdash.myOpportunityLink();
		hackathonpage=new MMShackathonsPage();
        opportunity.hackathontab();
		
	
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

public void verifyhackathonsTitle() throws Exception{
	hackathonpage.hackathontitlelink();
	}

@Test(priority=2)
public void Hackathonviewbutton() throws Exception{
	hackathonpage.Hackathonviewbutton();
}

@Test(priority=3, dataProvider="getJFTestData")
public void Hackathonchaticon(String messagess) throws Exception{
	hackathonpage.Hackathonchatclick(messagess);
	
}

@Test(priority=4, dataProvider="getJFGTestData" )
public void Hackathonupdate(String milesname,String desc) throws Exception{
	hackathonpage.Hackathonupadteprogress(milesname, desc);
	
}

@AfterMethod
public void tearDown(){
	driver.quit();
}


	
	
	}
