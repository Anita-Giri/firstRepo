package com.jug.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jug.qa.base.TestBase;

public class MMSdashboardPage extends TestBase  {
	
	@FindBy(xpath="/html/body/nav/div/div[2]/ul[1]/img")
	WebElement JFSIGdashLogo;
	
	@FindBy(xpath = "/html/body/nav/div/div[2]/ul[2]/li[4]/a/i/span")
	@CacheLookup
	WebElement userNameLabel;
	
	
	@FindBy(id="ideasig")
	WebElement Ideastab;
	
	@FindBy(xpath="//*[@id='myopportunity']")
	WebElement myOpportunityTabLink;
	
	@FindBy(xpath= "//*[@id='gramopportunity']")
	WebElement SIGGramtab;
	
	@FindBy(xpath= "//*[@id='profilemy']")
	WebElement SIGMyProfiletab;
	
	@FindBy(xpath= "//*[@id='myNavbar']/ul[2]/li[4]/a/i")
	WebElement SIGLogout;
	
	
	
	public MMSdashboardPage(){
		PageFactory.initElements(driver, this);
	}
	 
	
	

	
	
    
	public void  clickonideassig() {
	       Ideastab.click();
      
	
	
	}
	
	public void myOpportunityLink(){
		myOpportunityTabLink.click();
		
		
	}
	
	public void gramtowntab(){
		SIGGramtab.click();

		
	}
	
	public void profiletab(){
		SIGMyProfiletab.click();
		
		
	}
	
	
	public void userbutton(){
		SIGLogout.click();
	
		
	}
	

}
