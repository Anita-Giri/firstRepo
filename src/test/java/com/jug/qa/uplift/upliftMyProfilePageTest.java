package com.jug.qa.uplift;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.jug.qa.base.TestBase;

import com.jug.qa.util.TestUtil;
import com.jug.qa.pages.UpliftDashboard;
import com.jug.qa.pages.upliftLoginPage;

import com.jug.qa.pages.upliftMyProfilePage;

public class upliftMyProfilePageTest extends TestBase {
	
	upliftLoginPage upliftlogin;
    
	  com.jug.qa.pages.UpliftDashboard dashboard;
	  com.jug.qa.pages.upliftMyProfilePage profilepage;
	  String sheetName="Sheet8";
	  String sheetName1="Sheet9";
		 TestUtil testUtil;
		
		
	  

		@BeforeMethod
		public void setUp() {
			initialization();
			testUtil = new TestUtil();
			
			upliftlogin=new upliftLoginPage();
		
			dashboard=new UpliftDashboard();
			profilepage=new upliftMyProfilePage();
		    upliftlogin.loginn(prop.getProperty("username"), prop.getProperty("password"));
		    dashboard.myprofile();
		
		    
			}
		
		@DataProvider
		public Object[][] getJFTestData(){
			Object data[][] = TestUtil.getTestData(sheetName);
			return data;
		}

		
		 
			public upliftMyProfilePageTest() {
				super();
			}
			
		
			

			
			@Test(priority = 1, dataProvider="getJFTestData" )
		public void grampa(String areaofpanch, String majorcrop, String majorSource, String population) throws Exception  {
				profilepage.upliftgram(areaofpanch, majorcrop, majorSource, population);
			}
			
			@DataProvider
			public Object[][] getJGFTestData(){
				Object data[][] = TestUtil.getTestData(sheetName);
				return data;
			}
			@Test(priority = 2, dataProvider="getJGFTestData" )
			
			public void coordinatordetails(String name, String mobilno, String coomailid, String cooaadharno) throws Exception  {
				profilepage.institutecoordinator(name, mobilno, coomailid, cooaadharno);
				}
		
			
		
		
		
		@AfterMethod
		public void teardown() {
			driver.quit();
		}


}
