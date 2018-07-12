package com.jug.qa.uplift;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.jug.qa.base.TestBase;
import com.jug.qa.pages.UpliftDashboard;
import com.jug.qa.pages.upliftLoginPage;
import  com.jug.qa.pages.upliftMyOpportunityPage;




public class upliftMyOpportunityPageTest extends TestBase {
	

       upliftLoginPage upliftlogin;
    upliftMyOpportunityPage opportunity;
	  UpliftDashboard dashboard;
		
		
		
		
	  

		@BeforeMethod
		public void setUp() {
			initialization();
			
			upliftlogin=new upliftLoginPage();
			opportunity = new upliftMyOpportunityPage();
			dashboard=new UpliftDashboard();
		    upliftlogin.loginn(prop.getProperty("username"), prop.getProperty("password"));
		    dashboard.myopportunity();
		
		    
			}

		
		 
			public upliftMyOpportunityPageTest() {
				super();
			}
			
		
			

			
			@Test(priority = 1)
		public void stateche()  {
				opportunity.state();
			}
			
			
			@Test(priority = 2)
			public void centralche() throws Exception  {
				opportunity.central();
				}
			
			
			@Test(priority = 3)
			public void otherche() throws Exception  {
				opportunity.other();
				}
		
			
		
		
		
		@AfterMethod
		public void teardown() {
			driver.quit();
		}


}
