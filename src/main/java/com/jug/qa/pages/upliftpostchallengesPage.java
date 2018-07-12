package com.jug.qa.pages;

import org.openqa.selenium.Alert;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.jug.qa.base.TestBase;


public class upliftpostchallengesPage extends TestBase{
	
	@FindBy(xpath = "//*[@id='myidea']/div/div/div[1]/form/button")
	WebElement submitchallenges;

	@FindBy(xpath = "//*[@id='titlechallenge']")

	WebElement titleofchallenges;

	@FindBy(xpath="//*[@id='submit_new_idea']/div/div/div[2]/div[2]/input")
	WebElement challengeslocation;

	@FindBy(xpath = "//*[@id='submit_new_idea']/div/div/div[2]/div[3]/select")
	WebElement challengetype;

	@FindBy(xpath = "//*[@id='challengedesc']")
	WebElement challengesdesc;

	@FindBy(xpath = "//*[@id='submit_new_idea']/div/div/div[3]/button[1]")
	WebElement submitbtn;
	
	@FindBy(xpath = "//*[@id='ChallengeTable']/tbody[3]/tr/td[5]/p/a[1]")
	WebElement response;
	
	@FindBy(xpath = "//*[@id='view-sig-record']/div/table/tbody/tr/td[5]/a")
	WebElement viewprofile;
	
	
	@FindBy(xpath = "html/body/div[2]/div/div/div[2]/form[2]/div/button[1]")
	WebElement acceptbtn;
	
	@FindBy(xpath = "html/body/div[2]/div/div/div[1]/a")
	WebElement backbtn;
	
	
	@FindBy(xpath = "//*[@id='view-sig-record']/div/table/tbody/tr/td[6]/a/i")
	WebElement chaticon;
	
	@FindBy(xpath = "//*[@id='btn-input']")
	WebElement chatmess;
	
	@FindBy(xpath = "//*[@id='btn-chat']")
	WebElement chatbtnsend;
	
	public upliftpostchallengesPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions

	public void submitupliftchallenges(String title, String location,String ChallengeType, String desc) throws Exception {

		submitchallenges.click();
		Thread.sleep(5000);
		titleofchallenges.sendKeys(title);
		challengeslocation.sendKeys(location);
		/*
		 * Select select = new
		 * Select(driver.findElement(By.xpath("//*[@id='sigtype']")));// SIG
		 * group type select.selectByValue(typ1);
		 */
		Select select = new Select(challengetype);// SIG group type
		select.selectByVisibleText(ChallengeType);
		challengesdesc.sendKeys(desc);
		submitbtn.click();
		
		Alert ok = driver.switchTo().alert();
		System.out.println(ok.getText());
		ok.accept();
		

	}
	
	

	public void viewresponse() {
		
		 response.click();
		 
			
		
	}


	
	

}
