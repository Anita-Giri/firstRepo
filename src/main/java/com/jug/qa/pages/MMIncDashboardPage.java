package com.jug.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.jug.qa.base.TestBase;

public class MMIncDashboardPage extends TestBase{
	
	@FindBy(xpath = "//*[@id='myTab3']/li[2]/a")
	WebElement incubationopportunity;
	
	@FindBy(xpath = "//*[@id='myTab3']/li[3]/a")
	WebElement incubationprofile;
	
	
	


	
	
	
	public MMIncDashboardPage() {
		PageFactory.initElements(driver, this);
	}
	
	// Actions

	public void myopportunity() throws Exception {
		incubationopportunity.click();


	}

	
	public void IncubationMyProfile() throws Exception {
		
		incubationprofile.click();
	
	}

	
	
	
	


}
