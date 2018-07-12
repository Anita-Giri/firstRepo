package com.jug.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jug.qa.base.TestBase;

public class MMIncHackathonPage  extends TestBase{
	
	@FindBy(xpath = "//*[@id='incubationhakathonid']/tbody[1]/tr/td[2]/a/p")
	WebElement hackathontitle;
	
	@FindBy(xpath = "//*[@id='incubationhakathonid']/tbody[1]/tr/td[5]/p/a[1]")
	WebElement hackathonview;
	
	@FindBy(xpath = "//*[@id='incubationhakathonid']/tbody[1]/tr/td[5]/p/a[2]/i")
	WebElement hackathondelete;
	
	

	public MMIncHackathonPage() {
		PageFactory.initElements(driver, this);
	}
	
	// Actions

	public void incubationhackathontitle() throws Exception {
		Thread.sleep(5000);
		hackathontitle.click();


	}
	
	public void incubationhackathonview() throws Exception {
		Thread.sleep(5000);
		hackathonview.click();


	}
	
	public void incubationhackathondelete() throws Exception {
		Thread.sleep(5000);
		hackathondelete.click();
		
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
