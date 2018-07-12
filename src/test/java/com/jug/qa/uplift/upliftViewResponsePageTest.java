package com.jug.qa.uplift;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.jug.qa.base.TestBase;
import com.jug.qa.pages.upliftLoginPage;
import com.jug.qa.pages.upliftViewResponsePage;
import com.jug.qa.pages.upliftpostchallengesPage;
import com.jug.qa.util.TestUtil;

public class upliftViewResponsePageTest extends TestBase {
	
	       upliftLoginPage upliftlogin;
	    
			upliftpostchallengesPage postchallenges;
			upliftViewResponsePage view;
			
			
			String sheetName1="Sheet7";
		  

			@BeforeMethod
			public void setUp() {
				initialization();
				
				upliftlogin=new upliftLoginPage();
				postchallenges=new upliftpostchallengesPage();
				view=new upliftViewResponsePage();
			    upliftlogin.loginn(prop.getProperty("username"), prop.getProperty("password"));
			    postchallenges.viewresponse();
			    
				}

			
			 
				public upliftViewResponsePageTest() {
					super();
				}
				
				@DataProvider
				public Object[][] getJFTestData(){
					Object data[][] = TestUtil.getTestData(sheetName1);
					return data;
				}
				
				

				
				@Test(priority = 1)
			public void upliftviewprofile() throws Exception {
				view.upliftviewprofile();
					}
				
				@Test(priority = 2)
				public void upliftviewprofiledecline() throws Exception {
					view.upliftviewprofileDecline();
						}
				
			
				@Test(priority = 3, dataProvider="getJFTestData" )
				public void upliftchaticon(String messagess) throws Exception {
						view.viewchaticon(messagess);	
						}
				
			
			
			
			@AfterMethod
			public void teardown() {
				driver.quit();
			}
	
	

}
