package com.jug.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jug.qa.base.TestBase;

public class ListofStudentProjectPage extends TestBase {
	
	@FindBy(xpath = "//*[@id='StudentApplyProjectTable']/tbody/tr/td[6]/p/a[1]")
	WebElement viewproject;
	
	@FindBy(xpath = "//*[@id='StudentApplyProjectTable']/tbody/tr/td[6]/p/a[2]")
	WebElement viewprojectStudentprofile;

	
	
	public ListofStudentProjectPage() {
		PageFactory.initElements(driver, this);
	}
	
	// Actions

	public void Instituteliststudentproject() throws Exception {
		Thread.sleep(5000);
		viewproject.click();

	}

	
	public void Instituteviewstudentprofileproject() throws Exception {
		Thread.sleep(5000);
		viewprojectStudentprofile.click(); 

	}

}
