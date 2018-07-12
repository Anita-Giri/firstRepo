package com.jug.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.jug.qa.base.TestBase;

public class MMIncProjectPage extends TestBase {
	

	@FindBy(xpath = "//*[@id='incubationproject_id']/tbody[1]/tr/td[5]/p/a[1]")
	WebElement projectview;
	
	@FindBy(xpath = "//*[@id='incubationproject_id']/tbody[1]/tr/td[2]/a/p")
	WebElement projecttitle;
	
	@FindBy(xpath = "//*[@id='incubationproject_id']/tbody[1]/tr/td[5]/p/a[2]/i")
	WebElement projectdelete;
	
	

	public MMIncProjectPage() {
		PageFactory.initElements(driver, this);
	}
	
	// Actions

	public void incubationprojecttitle() throws Exception {
		Thread.sleep(5000);
		projecttitle.click();


	}
	
	public void incubationprojectview() throws Exception {
		Thread.sleep(5000);
		projectview.click();


	}
	
	public void incubationprojectdelete() throws Exception {
		Thread.sleep(5000);
		projectdelete.click();
		
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
