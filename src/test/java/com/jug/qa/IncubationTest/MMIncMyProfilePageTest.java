package com.jug.qa.IncubationTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.jug.qa.base.TestBase;
import com.jug.qa.pages.MMIncDashboardPage;

import com.jug.qa.pages.MMIncLogindropdownPage;

import com.jug.qa.pages.MMIncMyProfilePage;
import com.jug.qa.util.TestUtil;

public class MMIncMyProfilePageTest  extends TestBase{
	

	MMIncLogindropdownPage loginpage;

    MMIncDashboardPage incdashboardpage;
   
    MMIncMyProfilePage profilepage;
    String sheetName="incubatee";
    String sheetName1="milestonesheet";
	
	
	TestUtil testUtil;

	@BeforeMethod
	public void setUp() throws Exception {
		initialization();
		testUtil = new TestUtil();
		loginpage = new MMIncLogindropdownPage();
		incdashboardpage = new MMIncDashboardPage();
		
		profilepage=new   MMIncMyProfilePage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		incdashboardpage.IncubationMyProfile();
		
		
		
}
	
	
	public MMIncMyProfilePageTest() {
		super();
	}

	
	@DataProvider
	public Object[][] getJFTestData(){
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	@DataProvider
	public Object[][] getJGFTestData(){
		Object data[][] = TestUtil.getTestData(sheetName1);
		return data;
	}
	
	
	@Test(priority = 1)
	public void Incubationprofileincubateehead() throws Exception {
		profilepage.incubateeheadDetails();
		
	
		
		}
	
	@Test(priority = 2)
	public void Incubationcoordinator() throws Exception {
		
		profilepage.incubationCoordinatorDetails();
	
		}
	
	@Test(priority = 3, dataProvider="getJFTestData")
	public void Incubationincubateedetails(String name, String noofteam) throws Exception {
		profilepage.incubateeDetails(name, noofteam);
		
		
		
		
		}
	
	@Test(priority = 4)
	public void Incubationupdatedetails() throws Exception {
		profilepage.updateicon();
		
		
		}
	
	@Test(priority = 5, dataProvider="getJGFTestData")
	public void Incubationmilestonedetails(String name, String description) throws Exception {
		profilepage.IncMilestone(name, description);	
		}
	
	@Test(priority = 6)
	public void Incubationeditmilestoneupdatedetails() throws Exception {
		profilepage.updateediticon();
		
		
		}
	
	@Test(priority = 7)
	public void MyprofileLogout() throws Exception {
		profilepage.incLogout();
		
		
		}
	
	
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}


}
