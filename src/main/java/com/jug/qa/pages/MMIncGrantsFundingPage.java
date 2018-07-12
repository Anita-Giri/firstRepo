package com.jug.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jug.qa.base.TestBase;

public class MMIncGrantsFundingPage extends TestBase {
	
	@FindBy(xpath = "//*[@id='incubation_grantid']/tbody[1]/tr/td[2]/a/p")
	WebElement grantstitle;
	
	@FindBy(xpath = "//*[@id='incubation_grantid']/tbody[1]/tr/td[5]/p/a[1]")
	WebElement grantsview;
	
	@FindBy(xpath = "//*[@id='incubation_grantid']/tbody[1]/tr/td[5]/p/a[2]/i")
	WebElement grantsdelete;
	
	

	public MMIncGrantsFundingPage() {
		PageFactory.initElements(driver, this);
	}
	
	// Actions

	public void incubationgrantstitle() throws Exception {
		Thread.sleep(5000);
		grantstitle.click();


	}
	
	public void incubationgrantsview() throws Exception {
		Thread.sleep(5000);
		 grantsview.click();


	}
	
	public void incubationgrantsdelete() throws Exception {
		Thread.sleep(5000);
		grantsdelete.click();
		
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
