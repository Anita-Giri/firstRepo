package com.jug.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jug.qa.base.TestBase;

public class MMInstInternshipPage extends TestBase {
	
	@FindBy(xpath = "//*[@id='internshipTable']/tbody[2]/tr/td[6]/p/a[1]")
	WebElement internshipview;
	
	@FindBy(xpath = "//*[@id='internshipTable']/tbody[2]/tr/td[6]/p/a[2]/i")
	WebElement internshipdelete;
	

	
	public MMInstInternshipPage() {
		PageFactory.initElements(driver, this);
	}
	// Actions


	public void InstituteInternship() throws Exception {
		Thread.sleep(5000);
		internshipview.click();
		
		}
	
	
	public void InstituteDelete() throws Exception {
		Thread.sleep(5000);
		internshipdelete.click();
		Thread.sleep(5000);
		
		Alert ok = driver.switchTo().alert();
		System.out.println(ok.getText());
		ok.accept();
		
		Alert ok1 = driver.switchTo().alert();
		System.out.println(ok1.getText());
		ok1.accept();
	}




}
