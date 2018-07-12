package com.jug.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.jug.qa.base.TestBase;

public class MMInstideasFromInstitutePage extends TestBase {
	
	@FindBy(xpath = "//*[@id='IdeaTable']/tbody[1]/tr/td[3]/p/a")
	WebElement ideastitle;
	
	@FindBy(xpath = "//*[@id='IdeaTable']/tbody[1]/tr/td[6]/p/a")
	WebElement mysupport;
	
	@FindBy(xpath = "//*[@id='instituteprofiles']")
	WebElement myprofile;
	
	@FindBy(xpath = "//*[@id='password']")
	WebElement pass;
	
	@FindBy(xpath = "//*[@id='login-institute']/div/form/div[4]/button[1]")
	WebElement btnlogin;
	
	@FindBy(xpath="//*[@id='iresp']")
	WebElement dropdown;

	
	public MMInstideasFromInstitutePage() {
		PageFactory.initElements(driver, this);
	}

	// Actions


	public void InstituteIdeas() {
		
		ideastitle.click();
		
	}
	
	
	public void InstituteMySupport() {
		mysupport.click();
		Select sgender = new Select(dropdown);
		sgender.selectByValue("IT Support");
	}


	
	



}
