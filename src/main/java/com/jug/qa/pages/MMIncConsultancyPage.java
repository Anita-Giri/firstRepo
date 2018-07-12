package com.jug.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jug.qa.base.TestBase;

public class MMIncConsultancyPage extends TestBase {
	
	@FindBy(xpath = "//*[@id='incubationcounsultancyid']/tbody[1]/tr/td[2]/a/p")
	WebElement consultancytitle;
	
	@FindBy(xpath = "//*[@id='incubationcounsultancyid']/tbody[1]/tr/td[5]/p/a[1]")
	WebElement consultancyview;
	
	@FindBy(xpath = "//*[@id='incubationcounsultancyid']/tbody[1]/tr/td[5]/p/a[2]/i")
	WebElement consultancydelete;
	
	

	public MMIncConsultancyPage() {
		PageFactory.initElements(driver, this);
	}
	
	// Actions

	public void incubationConsultancystitle() throws Exception {
		Thread.sleep(5000);
		consultancytitle.click();


	}
	
	public void incubationConsultancyview() throws Exception {
		Thread.sleep(5000);
		consultancyview.click();


	}
	
	public void incubationConsultancydelete() throws Exception {
		Thread.sleep(5000);
		consultancydelete.click();
		
		Thread.sleep(5000);
		Alert ok = driver.switchTo().alert();
		System.out.println(ok.getText());
		ok.accept();
		
		Thread.sleep(5000);
		Alert ok1 = driver.switchTo().alert();
		System.out.println(ok1.getText());
		ok1.accept();


	}


}
