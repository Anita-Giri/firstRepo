package com.jug.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.jug.qa.base.TestBase;

public class MMInstMyOpportunityPage  extends TestBase{
	
	@FindBy(xpath = "//*[@id='projects']")
	WebElement projecttab;
	
	@FindBy(xpath = "//*[@id='consultancys']")
	WebElement consultancytab;
	
	@FindBy(xpath = "//*[@id='granfunding']")
	WebElement grantsfundTab;
	
	@FindBy(xpath = "//*[@id='hackathonss']")
	WebElement hackathontab;
	
	@FindBy(xpath = "//*[@id='login-institute']/div/form/div[4]/button[1]")
	WebElement btnlogin;
	
	@FindBy(xpath="//*[@id='iresp']")
	WebElement dropdown;

	
	public MMInstMyOpportunityPage() {
		PageFactory.initElements(driver, this);
	}
	// Actions


	public void Instituteproject() throws Exception  {
		
		Thread.sleep(8000);
		projecttab.click();
		
		}
	
	
	public void InstituteConsultancy() throws Exception {
		Thread.sleep(5000);
		
		consultancytab.click();
	}
	
	public void InstituteGrantsfunding() throws Exception {
		Thread.sleep(5000);
		
		 grantsfundTab.click();
	}

public void InstituteHackathon() throws Exception {
		Thread.sleep(5000);
	hackathontab.click();
	}

	
	

}
