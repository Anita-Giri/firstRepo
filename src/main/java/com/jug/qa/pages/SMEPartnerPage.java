package com.jug.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jug.qa.base.TestBase;

public class SMEPartnerPage extends TestBase {
	
	@FindBy(xpath = "//*[@id='SMEPartnersTable']/tbody[1]/tr/td[6]/p/a")
	WebElement mysmepartnerview;

	
	
	public SMEPartnerPage() {
		PageFactory.initElements(driver, this);
	}
	
	// Actions

	public void Instituteviewlistsme() throws Exception {
		Thread.sleep(5000);
		mysmepartnerview.click();

	}

	

}
