package com.jug.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.jug.qa.base.TestBase;

public class MMSProjectpage extends TestBase {

	@FindBy(xpath = "//*[@id='ProjectTable']/tbody/tr/td[3]/a")
	WebElement SIGprojecttitle;

	@FindBy(xpath = "//*[@id='ProjectTable']/tbody/tr/td[6]/a[1]")
	WebElement SIGprojectapply;

	@FindBy(xpath = "html/body/div[2]/div/div/div/div/div/div[3]/a[1]")
	WebElement SIGprojectapply_apply;

	@FindBy(xpath = "//*[@id='ProjectTable']/tbody/tr/td[6]/a[2]/i")
	WebElement SIGprojectapply_chat;

	@FindBy(xpath = "//*[@id='btn-input']")
	WebElement SIGprojectmessage;

	@FindBy(xpath = "//*[@id='btn-chat']")
	WebElement SIGMessagesend;

	@FindBy(xpath = "//*[@id='ProjectTable']/tbody/tr/td[6]/a[3]")
	WebElement SIGupdateprogress;

	@FindBy(xpath = "html/body/div[2]/div/div/div/div/form/div/div[1]/div[2]/input")
	WebElement SIGMilestonename;

	@FindBy(xpath = "html/body/div[2]/div/div/div/div/form/div/div[1]/div[3]/select")
	WebElement SIGMilestonetype;

	@FindBy(xpath = "html/body/div[2]/div/div/div/div/form/div/div[2]/textarea")
	WebElement SIGMilestonetextarea;

	@FindBy(xpath = "//*[@id='ProjectTable']/tbody/tr/td[6]/a[4]")
	WebElement SIGprojectdelete;

	public MMSProjectpage() {
		PageFactory.initElements(driver, this);
	}

	public void projectDetails() throws InterruptedException {
		Thread.sleep(5000);
		SIGprojecttitle.click();
	}

	public void projectapply() throws Exception {
		Thread.sleep(5000);
		SIGprojectapply.click();
		// Thread.sleep(5000);
		SIGprojectapply_apply.click();
		Alert ok = driver.switchTo().alert();
		System.out.println(ok.getText());
		ok.accept();

	}

	public void SIGChat(String messages) throws Exception {
		Thread.sleep(5000);
		SIGprojectapply_chat.click();
		SIGprojectmessage.sendKeys(messages);
		// SIGMessagesend.click();
	}

	public void SIGupdate(String milestonename, String desc) throws Exception {

		Thread.sleep(5000);
		SIGupdateprogress.click();

		SIGMilestonename.sendKeys(milestonename);

		Select type1 = new Select(SIGMilestonetype);

		type1.selectByValue("Product Release");
		SIGMilestonetextarea.sendKeys(desc);

	}
	
	public void SIGdelete() throws Exception {
		Thread.sleep(5000);
		SIGprojectdelete.click();
		
	}

}
