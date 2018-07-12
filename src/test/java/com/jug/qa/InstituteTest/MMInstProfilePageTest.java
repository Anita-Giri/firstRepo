package com.jug.qa.InstituteTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.jug.qa.base.TestBase;

import com.jug.qa.pages.MMInstDashboardPage;
import com.jug.qa.pages.MMInstLoginPage;
import com.jug.qa.pages.MMInstProfilePage;

import com.jug.qa.util.TestUtil;

public class MMInstProfilePageTest  extends TestBase{
	
	MMInstLoginPage loginpage;

	MMInstDashboardPage dashboard;
	MMInstProfilePage profilepage;
	String sheetName="dept";
	String sheetName1="milestone";
	
	TestUtil testUtil;

	@BeforeMethod
	public void setUp() throws Exception {
		initialization();
		testUtil = new TestUtil();
		loginpage = new MMInstLoginPage();

		dashboard = new MMInstDashboardPage();
		profilepage=new MMInstProfilePage();
		
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		dashboard.InstMyProfile();
	
	

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

	public MMInstProfilePageTest() {
		super();
	}

	@Test(priority = 1)
	public void instprincipal() throws Exception {
		profilepage.principalDetails();
		
		}
	
	@Test(priority = 2)
	public void instcoordinator() throws Exception {
		profilepage.InstitutecoordinatorDetails();
		
		}
	
	@Test(priority = 3, dataProvider="getJFTestData")
	public void instdespartment(String deptname, String hodname, String mobileno, String emailID, String Studentnumber,String description) throws Exception {
		profilepage.Institutedepartment(deptname, hodname, mobileno, emailID, Studentnumber, description);
		
		}
	
	@Test(priority = 4, dataProvider="getJGFTestData")
	public void instmilestone(String milestonename, String description) throws Exception {
		profilepage.InstituteMilestone(milestonename, description);
		
		}

	
	@Test(priority = 5)
	public void profilelogout() throws Exception {
		profilepage.signout();
		
		}
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}


}
