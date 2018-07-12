package com.jug.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jug.qa.base.TestBase;

public class MyProfilePage extends TestBase {
	
	@FindBy(xpath= "//*[@id='leaderdetails']")
	WebElement SIGleader;
	
	
	@FindBy(xpath= "//*[@id='personal-details']/div/div/div[1]/div/div[1]/h4/a/b")
	WebElement SIGupdateLeader;
	
	@FindBy(xpath= "//*[@id='personals']/div/form/div[5]/button")
	WebElement SIGSave;
	
	
	@FindBy(xpath= "//*[@id='coordinatordetails']/i")
	WebElement SIGCoordinator;
	
	
	@FindBy(xpath= "//*[@id='coordinator-details']/div/div/div[1]/div/div[1]/h4/a/b")
	WebElement SIGupdateCoordinator;
	
	@FindBy(xpath= "//*[@id='personalss']/div/form/div[5]/button")
	WebElement SIGcoordinatorsave;
	
	@FindBy(xpath= "//*[@id='milestoneses']")
	WebElement SIGmilestoneclick;
	
	@FindBy(xpath= "//*[@id='milestone']/div/div/div[1]/div/div[1]/h4/a/b")
	WebElement SIGupdatemilestone;
	
	@FindBy(xpath= "//*[@id='technologies']")
	WebElement SIGtechtab;
	
	@FindBy(xpath= "//*[@id='techmology']/div/div/div[1]/div/div[1]/h4/a/b")
	WebElement SIGaddtech;
	
	
	public MyProfilePage(){
		PageFactory.initElements(driver, this);
	}

	
public void SIGLeaderDetails() throws Exception {
	Thread.sleep(5000);
		
	SIGleader.click();
	Thread.sleep(5000);
	SIGupdateLeader.click();
	Thread.sleep(5000);
	SIGSave.click();
	Alert ok = driver.switchTo().alert();
	System.out.println(ok.getText());
	ok.accept();
	
		
}
	
	public void SIGCoordinatorDetils() throws Exception {
		Thread.sleep(5000);
		SIGCoordinator.click();
		Thread.sleep(5000);
		SIGupdateCoordinator.click();
		Thread.sleep(5000);
		SIGcoordinatorsave.click();
		Alert ok = driver.switchTo().alert();
		System.out.println(ok.getText());
		ok.accept();
		
	
		
}
	
	public void Milestoneclick() throws Exception {
		Thread.sleep(5000);
		SIGmilestoneclick.click();
		Thread.sleep(5000);
		SIGupdatemilestone.click();
		
		
		}
	
	public void technologyclick() throws Exception {
		
		Thread.sleep(5000);
		 SIGtechtab.click();
		 Thread.sleep(5000);
		 SIGaddtech.click();
		
		
	
		}
	

}
