package com.jug.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jug.qa.base.TestBase;

public class MMInstDashboardPage extends TestBase {
	
	@FindBy(xpath = "//*[@id='myopportunitys']")
	WebElement opportunitytab;
	
	@FindBy(xpath = "//*[@id='viewlists']")
	WebElement viewlist;
	
	@FindBy(xpath = "//*[@id='instituteprofiles']")
	WebElement myprofile;
	
	@FindBy(xpath = "//*[@id='password']")
	WebElement pass;
	
	@FindBy(xpath = "//*[@id='login-institute']/div/form/div[4]/button[1]")
	WebElement btnlogin;

	
	public MMInstDashboardPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions


	public void InstMyOpportunity() {
		
		opportunitytab.click();
		
	}
	
	
	public void Instviewlist() {
		viewlist.click();
	}

	
	public void InstMyProfile() {
		myprofile.click();
	}


}
