package com.jug.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jug.qa.base.TestBase;


public class upliftMyOpportunityPage  extends TestBase{
	
	@FindBy(xpath = "//*[@id='sgs']")
	WebElement sgs;
	
	@FindBy(xpath = "//*[@id='stategovTable']/tbody/tr/td[2]/p/a")
	WebElement sgstitle;

	@FindBy(xpath = "//*[@id='stategovTable']/tbody/tr/td[4]/p/a")
	WebElement sgsview;
	
	@FindBy(xpath = "//*[@id='cgs']")
	WebElement cgs;
	
	@FindBy(xpath = "//*[@id='centralgovTable']/tbody/tr/td[2]/a")
	WebElement cgstitle;
	
	@FindBy(xpath = "//*[@id='centralgovTable']/tbody/tr/td[2]/a")
	WebElement cgsView;
	
	@FindBy(xpath = "//*[@id='ogs']")
	WebElement ogs;
	@FindBy(xpath = "//*[@id='otherschemeTable']/tbody/tr/td[2]/a")
	WebElement ogstitle;
	
	@FindBy(xpath = "//*[@id='otherschemeTable']/tbody/tr/td[4]/p/a")
	WebElement ogsview;

	public upliftMyOpportunityPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions

	public void state() {
		sgs.click();
		

		sgsview.click();
		
		}


	public void central() throws Exception {
		Thread.sleep(5000);
		
		cgs.click();
	
		cgsView.click();	
	}

	public void other() throws Exception {
		Thread.sleep(5000);
		ogs.click();
	
		ogsview.click();
	
		
	}

}
