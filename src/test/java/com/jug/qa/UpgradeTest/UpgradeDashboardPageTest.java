package com.jug.qa.UpgradeTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jug.qa.base.TestBase;

import com.jug.qa.pages.UpgradeDashboardPage;
import com.jug.qa.pages.upgradeLoginPage;

public class UpgradeDashboardPageTest  extends TestBase{
	
	upgradeLoginPage loginpage;
	UpgradeDashboardPage  upgradedashpage;
	public UpgradeDashboardPageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setUp() throws Exception {
		initialization();
		
		loginpage = new upgradeLoginPage();
		upgradedashpage=new UpgradeDashboardPage();
			
       loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
       
	
	}
	


	@Test(priority=1)
	public void upgradedash() throws Exception{
		
		upgradedashpage.contactbtnlink();
		
		}
	
	@Test(priority=2)
	public void upgradedashprofilebtn() throws Exception{
		
		upgradedashpage.logout();
		
		}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
