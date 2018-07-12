package com.jug.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jug.qa.base.TestBase;

public class ListofSTudentInternshipPage extends TestBase {

	
	@FindBy(xpath = "//*[@id='StudentApplyInternshipTable']/tbody[1]/tr/td[6]/p/a[1]")
	WebElement viewinternship;
	
	@FindBy(xpath = "//*[@id='StudentApplyInternshipTable']/tbody[1]/tr/td[6]/p/a[2]")
	WebElement viewStudentprofile;
	


	
	
	public ListofSTudentInternshipPage() {
		PageFactory.initElements(driver, this);
	}
	
	// Actions

	public void Instituteviewstudentinternship() throws Exception {
		Thread.sleep(5000);
		viewinternship.click();

	}

	public void Instituteviewprofileinternship() throws Exception {
		Thread.sleep(5000);
		viewStudentprofile.click();

	}

	
}
