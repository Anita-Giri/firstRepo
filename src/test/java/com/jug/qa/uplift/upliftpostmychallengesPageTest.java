package com.jug.qa.uplift;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.jug.qa.base.TestBase;
import com.jug.qa.pages.upliftLoginPage;
import com.jug.qa.pages.upliftpostchallengesPage;
import com.jug.qa.util.TestUtil;

public class upliftpostmychallengesPageTest  extends TestBase{
	
	  upliftLoginPage upliftlogin;
	    
		upliftpostchallengesPage postchallenges;
		String sheetName="Sheet6";
		String sheetName1="post";
	  

		@BeforeMethod
		public void setUp() {
			initialization();
			
			upliftlogin=new upliftLoginPage();
			postchallenges=new upliftpostchallengesPage();
		    upliftlogin.loginn(prop.getProperty("username"), prop.getProperty("password"));
			}

		
		 
			public upliftpostmychallengesPageTest() {
				super();
			}
			
			@DataProvider
			public Object[][] getJFTestData(){
				Object data[][] = TestUtil.getTestData(sheetName);
				return data;
			}
			
			
			@Test(priority = 1, dataProvider="getJFTestData")
		public void postchallenges(String title, String location, String ChallengeType,String desc) throws Exception {
				postchallenges.submitupliftchallenges(title, location,ChallengeType, desc);
			}
			
			
			@DataProvider
			public Object[][] getJGFTestData(){
				Object data[][] = TestUtil.getTestData(sheetName1);
				return data;
			}
			
			@Test(priority = 2)
		public void upliftviewresponse() throws Exception {
				postchallenges.viewresponse();	
				}
			
		
			
			
		
		
		
		@AfterMethod
		public void teardown() {
			//driver.quit();
		}


}
