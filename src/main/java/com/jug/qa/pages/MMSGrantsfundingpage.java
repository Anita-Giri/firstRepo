package com.jug.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jug.qa.base.TestBase;

public class MMSGrantsfundingpage extends TestBase {
	
	@FindBy(xpath= "//*[@id='GrantTable']/tbody[1]/tr/td[2]/p/a")
	WebElement SIGgrantstab;
	
	@FindBy(xpath= "//*[@id='GrantTable']/tbody[1]/tr/td[5]/a[1]")
	WebElement SIGgrantsview;
	
	@FindBy(xpath= "//*[@id='GrantTable']/tbody[1]/tr/td[5]/a[2]/i")
	WebElement SIGgrantsdelete;
	
	
	public MMSGrantsfundingpage(){
		PageFactory.initElements(driver, this);
	}

	
	public void grantslink() throws Exception {
		Thread.sleep(5000);
		SIGgrantstab.click();
		Thread.sleep(5000);
		
	}
	
	


	public void grantsdelete() {
		
		//SIGgrantsdelete.click();
		// TODO Auto-generated method stub
		
	}


	public void grantsview() {
		
		SIGgrantsview.click();
		// TODO Auto-generated method stub
		
	}
	
	

}
