package com.jug.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jug.qa.base.TestBase;

public class MMSMyOpportunity extends TestBase {

	
	@FindBy(xpath= "//*[@id='myopportunity']")
	WebElement SIGopportunityTab;
	
	@FindBy(xpath = "//*[@id='myTab3']/li[1]/a")
	WebElement SIGMyopportunityprojecttab;

	@FindBy(xpath = "//*[@id='ProjectTable']/tbody/tr/td[3]/a")
	WebElement SIGprojecttitle;
	
	@FindBy(linkText = "GRANTS AND FUNDING")
	WebElement SIGGrantsfundingtab;
	
	@FindBy(linkText = "CONSULTANCY")
	WebElement SIGConsultancytab;
	
	@FindBy(linkText = "HACKATHONS")
	WebElement SIGHackathontab;
	
	public MMSMyOpportunity(){
		PageFactory.initElements(driver, this);
	}

	
	public MMSProjectpage projectTabLink() throws Exception {
		Thread.sleep(5000);
		SIGMyopportunityprojecttab.click();
		Thread.sleep(5000);
		return new MMSProjectpage();
	

	}

	
	public MMSGrantsfundingpage grantsfundingtab() throws Exception {
		
		Thread.sleep(5000);
		SIGGrantsfundingtab.click();
		Thread.sleep(5000);
		return new MMSGrantsfundingpage();
		}

	public MMSConsultancyPage consultancytab() throws Exception {
		
		Thread.sleep(5000);
		SIGConsultancytab.click();
		Thread.sleep(5000);
		return new MMSConsultancyPage();
		}


	public MMShackathonsPage hackathontab() throws Exception {
		
		Thread.sleep(5000);
		SIGHackathontab.click();
		Thread.sleep(5000);
		return new MMShackathonsPage();
		}
	
	
}
