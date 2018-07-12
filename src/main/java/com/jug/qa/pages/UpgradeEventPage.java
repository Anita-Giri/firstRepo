package com.jug.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jug.qa.base.TestBase;

public class UpgradeEventPage extends TestBase {
	
	@FindBy(xpath = "//*[@id='myNavbar']/ul[2]/li[3]/ul/li[1]/a[2]")
	WebElement eventview;
	
	
	@FindBy(xpath = "html/body/div[2]/div/div/li[1]/a")
	WebElement event1;
	

	
	public UpgradeEventPage() {
		PageFactory.initElements(driver, this);
	}
	// Actions


	public void upgradeevent() throws Exception {
		
		eventview.click();
		event1.click();
		
		}
	
	


}
