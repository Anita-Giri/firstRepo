package com.jug.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jug.qa.base.TestBase;


public class upliftMyProfilePage extends TestBase {
	
	@FindBy(xpath = "//*[@id='panchayatgram']")
	WebElement panchayat;
	
	@FindBy(xpath = "//*[@id='personal-details']/div/div/div[1]/div/div[1]/h4/a/b")
	WebElement addpanchayat;
	
	@FindBy(xpath = "//*[@id='areapanchayat']")
	WebElement aop;
	
	@FindBy(xpath = "//*[@id='majorcrop']")
	WebElement macrop;
	
	@FindBy(xpath = "//*[@id='majorsorce']")
	WebElement masource;
	
	@FindBy(xpath = "//*[@id='population']")
	WebElement popu;
	
	@FindBy(xpath = "//*[@id='personals']/div/form/div[5]/button")
	WebElement save;
	
	@FindBy(xpath = "//*[@id='myprofile']/div/div/div/div/div[1]/div/a[3]")
	WebElement coordinator;
	
	@FindBy(xpath = "//*[@id='codetails']/div/div/div[1]/div/div[1]/h4/a/b")
	WebElement addcoordinator;
	
	@FindBy(xpath = "//*[@id='instconame']")
	WebElement cooname;
	
	@FindBy(xpath = "//*[@id='newmobileno']")
	WebElement coomobile;
	
	@FindBy(xpath = "//*[@id='instinewemail']")
	WebElement coomoail;
	
	@FindBy(xpath = "//*[@id='instinewadharno']")
	WebElement cooadhar;
	
	@FindBy(xpath = "//*[@id='co-ordi']/div/form/div[5]/button")
	WebElement savebtn;
	


	public upliftMyProfilePage() {
		PageFactory.initElements(driver, this);
	}

	// Actions

	public void upliftgram(String areaofpanch, String majorcrop, String majorSource, String population) throws Exception {
		
		 Thread.sleep(5000);
		panchayat.click();
	
		 addpanchayat.click();
		 aop.sendKeys(areaofpanch);
		 macrop.sendKeys(majorcrop);
		 masource.sendKeys(majorSource);
		 popu.sendKeys(population);
		save.click();
		Alert ok = driver.switchTo().alert();
		System.out.println(ok.getText());
		ok.accept();
		
		}

	
	public void institutecoordinator(String name, String mobilno, String coomailid, String cooaadharno) throws Exception {
		
		 Thread.sleep(5000);
		 coordinator.click();
	
		 addcoordinator.click();
		 Thread.sleep(5000);
		 cooname.sendKeys(name);
		 coomobile.sendKeys(mobilno);
		 coomoail.sendKeys(coomailid);
		 cooadhar.sendKeys(cooaadharno);
		savebtn.click();
		Alert ok = driver.switchTo().alert();
		System.out.println(ok.getText());
		ok.accept();
		
		}

	
		
	

}
