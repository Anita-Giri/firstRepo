package com.jug.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.jug.qa.base.TestBase;

public class MMIncMyOpportunityPage extends TestBase {
	

	@FindBy(xpath = "//*[@id='opportinity']/div/div/div/div/div/ul/li[2]/a")
	WebElement grantsfundtab;
	
	@FindBy(xpath = "//*[@id='opportinity']/div/div/div/div/div/ul/li[3]/a")
	WebElement consultancytab;
	
	@FindBy(xpath = "//*[@id='opportinity']/div/div/div/div/div/ul/li[4]/a")
	WebElement Hackathontab;
	
	

	public MMIncMyOpportunityPage() {
		PageFactory.initElements(driver, this);
	}
	
	// Actions

	public void incubationgrantstab() throws Exception {
		
		Thread.sleep(5000);
		
		 grantsfundtab.click();


	}

	
	public void incubationconsultancytab() throws Exception {
		Thread.sleep(5000);
		consultancytab.click();
		 
	
	}

	
	public void incubationHackathontab() throws Exception {
		Thread.sleep(5000);
		
		Hackathontab.click();
	
	}

}
