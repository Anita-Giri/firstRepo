package com.jug.qa.UpgradeTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jug.qa.base.TestBase;

import com.jug.qa.pages.UpgradeDashboardPage;
import com.jug.qa.pages.UpgradeEventPage;
import com.jug.qa.pages.upgradeLoginPage;

public class UpgradeEventPageTest extends TestBase {
	
	
upgradeLoginPage loginpage;
UpgradeDashboardPage upgradedashpage;
UpgradeEventPage eventpage;
   
	public UpgradeEventPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws Exception {
		initialization();
		
		loginpage = new upgradeLoginPage();
		upgradedashpage= new UpgradeDashboardPage ();
		eventpage = new UpgradeEventPage();   
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		upgradedashpage.eventpagelink();
		
		
}

	@Test(priority=1)
	public void viewall() throws Exception{
		eventpage.upgradeevent();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	

}
