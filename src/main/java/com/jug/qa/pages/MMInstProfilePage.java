package com.jug.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.jug.qa.base.TestBase;

public class MMInstProfilePage extends TestBase {
	
	@FindBy(xpath = "//*[@id='principle-detail']")
	WebElement instprincipal;
	
	@FindBy(xpath = "//*[@id='personal-details']/div/div/div[1]/div/div[1]/h4/a/b")
	WebElement instprincipalclick;
	
	
	@FindBy(xpath = "//*[@id='personals']/div/form/div[5]/button")
	WebElement instprincipalbtnsubmit;
	
	
	@FindBy(xpath = "//*[@id='coordinator-details']/div/div/div[1]/div/div[1]/h4/a/b")
	WebElement instcoordinatorclick;
	
	
	@FindBy(xpath = "//*[@id='insticoordinator']")
	WebElement instcoordinator;
	
	
	@FindBy(xpath = "//*[@id='co-ordinators']/div/form/div[5]/button")
	WebElement instcoordinatoradd;
	

	@FindBy(xpath = "//*[@id='departmenting']")
	WebElement instdepartment;
	
	@FindBy(xpath = "//*[@id='department']/div/div/div[1]/div/div[1]/h4/a/b")
	WebElement instdepartmentadd;
	
	@FindBy(xpath = "//*[@id='deptname']")
	WebElement enterdeptname;
	
	@FindBy(xpath = "//*[@id='nameofhod']")
	WebElement enterhodname;
	
	@FindBy(xpath = "//*[@id='hodmobile']")
	WebElement entermobilenumber;
	
	@FindBy(xpath = "//*[@id='hodemailid']")
	WebElement enteremailID;
	
	@FindBy(xpath = "//*[@id='nostudent']")
	WebElement enternostudent;
	
	
	@FindBy(xpath = "//*[@id='description']")
	WebElement enterdesc;
	
	
	@FindBy(xpath = "//*[@id='educations']/div/form/div[7]/button")
	WebElement deptsave;
	
	
	
	@FindBy(xpath = "//*[@id='technologiess']")
	WebElement milestones;
	
	@FindBy(xpath = "//*[@id='techmology']/div/div/div[1]/div/div[1]/h4/a/b")
	WebElement milestonesclick;
	
	
	@FindBy(xpath = "//*[@id='milestonename']")
	WebElement milestonesname;
	
	@FindBy(xpath = "//*[@id='myskill']/div/form/div[3]/select")
	WebElement milestonestype;
	
	@FindBy(xpath = "//*[@id='briefdescription']")
	WebElement milestonesdesc;
	
	@FindBy(xpath = "//*[@id='milestonedate']")
	WebElement Date1;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[4]/div/div/div/div/div[2]/div/div[5]/div/div/div[1]/div/div[2]/div/form/div[1]/ul/li[2]/span/button[1]")
	WebElement date2;
	
	
	@FindBy(xpath = "//*[@id='myskill']/div/form/div[5]/button")
	WebElement btnsave;

	
	@FindBy(xpath = "//*[@id='myNavbar']/ul[2]/li[4]/a/i/span")
	WebElement btnlogout;
	
	
	
	public MMInstProfilePage() {
		PageFactory.initElements(driver, this);
	}
	
	// Actions

	public void principalDetails() throws Exception {
		Thread.sleep(5000);
		instprincipal.click();
		Thread.sleep(5000);
		instprincipalclick.click();
		
		Thread.sleep(5000);
		instprincipalbtnsubmit.click();

	}

	
	public void InstitutecoordinatorDetails() throws Exception {
		Thread.sleep(5000);
		instcoordinator.click();
		
		Thread.sleep(5000);
		
		instcoordinatorclick.click();
		
		Thread.sleep(5000);
		
		instcoordinatoradd.click();

	}

	
	
	public void Institutedepartment(String deptname, String hodname, String mobileno, String emailID, String Studentnumber, String description) throws Exception {
		Thread.sleep(5000);
		instdepartment.click();
		
		Thread.sleep(5000);
		
		instdepartmentadd.click();
		
		Thread.sleep(5000);
		enterdeptname.sendKeys(deptname);
		enterhodname.sendKeys(hodname);
		entermobilenumber.sendKeys(mobileno);
		enteremailID.sendKeys(emailID);
		enternostudent.sendKeys(Studentnumber);
		 enterdesc.sendKeys(description);
		 Thread.sleep(5000);
		 deptsave.click();
		

	}
	
	public void InstituteMilestone(String milestonename, String description) throws Exception {
		Thread.sleep(5000);
		 
		milestones.click();
		
		Thread.sleep(5000);
		milestonesclick.click();
		Thread.sleep(5000);
		Date1.click();
		 date2.click();
		
		
	
		 milestonesname.sendKeys(milestonename);
		 Select select = new Select(milestonestype);// SIG group type
			select.selectByVisibleText("Faculty Achievement");
		
		 milestonesdesc.sendKeys(description);
		 btnsave.click();
		

	}
	
	public void signout() {
		btnlogout.click();
	}

}
