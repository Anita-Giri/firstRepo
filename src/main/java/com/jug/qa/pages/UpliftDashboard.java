package com.jug.qa.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jug.qa.base.TestBase;


public class UpliftDashboard extends TestBase {

	@FindBy(xpath = "//*[@id='myopportunity']")
	WebElement upliftopportunity;

	@FindBy(xpath = "//*[@id='profilemy']")

	WebElement profile;

	
	
	public UpliftDashboard() {
		PageFactory.initElements(driver, this);
	}

	// Actions

	public void myopportunity() {
		
		upliftopportunity.click();
	}
		
	public void myprofile() {
		
		profile.click();
	}
	



}
