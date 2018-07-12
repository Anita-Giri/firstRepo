package com.jug.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.jug.qa.base.TestBase;

public class MMIncMyProfilePage extends TestBase {
	
	@FindBy(xpath = "//*[@id='myprofile']/div/div/div/div/div[1]/div/a[2]")
	WebElement incheaddetails;
	
	@FindBy(xpath = "//*[@id='personal-details']/div/div/div[1]/div/div[1]/h4/a/b")
	WebElement incupdateheaddetails;
	
	@FindBy(xpath = "//*[@id='personals']/div/form/div[5]/button")
	WebElement headsavebtn;
	
	@FindBy(xpath = "//*[@id='myprofile']/div/div/div/div/div[1]/div/a[3]")
	WebElement coordetails;
	
	@FindBy(xpath = "//*[@id='coordinator-details']/div/div/div[1]/div/div[1]/h4/a/b")
	WebElement updatecoodetails;
	
	@FindBy(xpath = "//*[@id='coordinator']/div/form/div[5]/button")
	WebElement coorsavebtn;
	
	
	@FindBy(xpath = "//*[@id='myprofile']/div/div/div/div/div[1]/div/a[4]")
	WebElement incincubateeetails;
	
	@FindBy(xpath = "//*[@id='incubatee-details']/div/div/div[1]/div/div[1]/h4/a/b")
	WebElement incupdateincubateedetails;
	
	@FindBy(name = "incuname")
	WebElement incubateename;
	
	
	@FindBy(xpath = "//*[@id='incubatee']/div/form/div[2]/select")
	WebElement incubateeprofile;
	
	@FindBy(name = "team")
	WebElement noteam;
	
	@FindBy(xpath = "//*[@id='incubatee']/div/form/div[4]/input")
	WebElement date1;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[3]/div/div/div/div/div[2]/div/div[4]/div/div/div[1]/div/div[2]/div/form/div[4]/ul/li[2]/span/button[1]")
	WebElement date2;
	
	@FindBy(xpath = "//*[@id='incubatee']/div/form/div[5]/select")
	WebElement legalstatus;
	
	@FindBy(xpath = "//*[@id='incubatee']/div/form/div[6]/button")
	WebElement btnsubmit;
	
	@FindBy(xpath = "//*[@id='incubatee-details']/div/div/div[2]/form/a/i")
	WebElement incubateeupdateicon;
	
	@FindBy(xpath = "html/body/div[2]/div/div/div[2]/form/div[7]/button")
	WebElement incubateebtnsubmit;
	
	@FindBy(xpath = "//*[@id='myprofile']/div/div/div/div/div[1]/div/a[5]")
	WebElement miletonebutton;
	
	@FindBy(xpath = "//*[@id='techmology']/div/div/div[1]/div/div[1]/h4/a/b")
	WebElement updatemiletonebutton;
	
	@FindBy(xpath = "//*[@id='inputsm']")
	WebElement datemile;
	
	
	@FindBy(name = "dates")
	WebElement date3;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[3]/div/div/div/div/div[2]/div/div[5]/div/div/div[1]/div/div[2]/div/form/div[1]/ul/li[2]/span/button[1]")
	WebElement date4;
	
	
	@FindBy(name = "milestonename")
	WebElement miletonename;
	
	
	@FindBy(xpath = "//*[@id='myskill']/div/form/div[3]/select")
	WebElement miletonetype;
	
	
	@FindBy(xpath = "//*[@id='myskill']/div/form/div[4]/textarea")
	WebElement miletonedesc;
	
	@FindBy(xpath = "//*[@id='myskill']/div/form/div[5]/button")
	WebElement miletonebtnsave;
	
	@FindBy(xpath = "//*[@id='techmology']/div/div/div[2]/form/a/i")
	WebElement miletoneupdateicon;
	
	@FindBy(xpath = "html/body/div[2]/div/div/div[2]/form/div[5]/button")
	WebElement miletoneeditbtnsave;
	
	@FindBy(xpath = "//*[@id='myNavbar']/ul[2]/li[5]/a/i")
	WebElement logoutbtn;
	
	@FindBy(xpath = "//*[@id='myNavbar']/ul[2]/li[5]/ul/li/a[2]/div/table/tbody/tr[4]/td/a")
	WebElement signbtn;
	
	
	

	public MMIncMyProfilePage() {
		PageFactory.initElements(driver, this);
	}
	
	// Actions

	public void incubateeheadDetails() throws Exception {
		Thread.sleep(5000);
		incheaddetails.click();
		Thread.sleep(5000);
		incupdateheaddetails.click();
		Thread.sleep(5000);
		headsavebtn.click();

	}
	
	public void incubationCoordinatorDetails() throws Exception {
		Thread.sleep(5000);
		
		coordetails.click();
		Thread.sleep(5000);
		updatecoodetails.click();
		Thread.sleep(5000);
		coorsavebtn.click();

	}
	
	public void incubateeDetails(String name,String noofteam) throws Exception {
		Thread.sleep(5000);
		incincubateeetails.click();
		Thread.sleep(5000);
		incupdateincubateedetails.click();
		Thread.sleep(5000);
		incubateename.sendKeys(name);
		 Select select = new Select(incubateeprofile);// SIG group type
		select.selectByVisibleText("POC Phase (Proof of Concept)");
		noteam.sendKeys(noofteam);
		date1.click();
		date2.click();
		Select select1 = new Select(legalstatus);// SIG group type
		select1.selectByVisibleText("Unregistered Beginner");
		Thread.sleep(5000);

		btnsubmit.click();
	}
	
	public void updateicon() throws Exception {
		Thread.sleep(5000);
		incincubateeetails.click();
		Thread.sleep(5000);
		incubateeupdateicon.click();
		Thread.sleep(5000);
		incubateebtnsubmit.click();
		
		
		

	}
	
	public void IncMilestone(String name, String description) throws Exception {
		Thread.sleep(5000);
		 miletonebutton.click();
		 Thread.sleep(5000);
		 updatemiletonebutton.click();
		 Thread.sleep(3000);
		// date3.click();
		//date4.click();
		 Thread.sleep(3000);
		 miletonename.sendKeys(name);
		 Thread.sleep(3000);
		 Select select = new Select(miletonetype);// SIG group type
			select.selectByVisibleText("POC");
			 Thread.sleep(3000);
			miletonedesc.sendKeys(description);
			Thread.sleep(5000);
			miletonebtnsave.click();
		

	}
	
	public void updateediticon() throws Exception {
		
		Thread.sleep(5000);
		 miletonebutton.click();
		Thread.sleep(5000);
		miletoneupdateicon.click();
		Thread.sleep(5000);
		 miletoneeditbtnsave.click();
	
		
		
		
		

	}
	
	public void incLogout() throws Exception {
		Thread.sleep(3000);
		
		logoutbtn.click();
		signbtn.click();
		
	
		
		
		
		

	}
		
}
