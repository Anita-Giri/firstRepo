package com.jug.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jug.qa.base.TestBase;

public class ViewListPage extends TestBase {
	
	@FindBy(xpath = "//*[@id='smse']")
	WebElement mysmepartner;

	@FindBy(xpath = "//*[@id='interstudent']")
	WebElement liststuinternship;
	
	@FindBy(xpath = "//*[@id='aplliedstudent']")
	WebElement liststuproject;

	public ViewListPage() {
		PageFactory.initElements(driver, this);
	}
	
	// Actions

	public void Instituteviewlistsme() throws Exception {
		Thread.sleep(5000);
		mysmepartner.click();

	}

	public void Instituteliststudentintern() throws Exception {
		Thread.sleep(5000);
		liststuinternship.click();
		
	}
	
	public void Instituteliststudentproject() throws Exception {
		Thread.sleep(5000);
		liststuproject.click();
		
	}

}
