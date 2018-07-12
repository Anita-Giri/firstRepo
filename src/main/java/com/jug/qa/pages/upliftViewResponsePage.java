package com.jug.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jug.qa.base.TestBase;


public class upliftViewResponsePage extends TestBase {
	@FindBy(xpath = "//*[@id='view-sig-record']/div/table/tbody/tr/td[5]/a")
	WebElement viewprofile;

	@FindBy(xpath = "html/body/div[2]/div/div/div[2]/form[2]/div/button[2]")
	WebElement viewprofiledecline;
	
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

	public upliftViewResponsePage() {
		PageFactory.initElements(driver, this);
	}

	// Actions

	public void upliftviewprofile() {

		viewprofile.click();
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,600)", "");
		acceptbtn.click();
		Alert ok = driver.switchTo().alert();
		System.out.println(ok.getText());
		ok.accept();
		
		

	}
	
	
	public void upliftviewprofileDecline() {
		

		viewprofile.click();
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,600)", "");
		viewprofiledecline.click();
		
	
		Alert ok = driver.switchTo().alert();
		System.out.println(ok.getText());
		ok.accept();
		
		

	}

	public void viewchaticon(String messagess) {
		chaticon.click();
		chatmess.sendKeys(messagess);
		chatbtnsend.click();

	}

}
