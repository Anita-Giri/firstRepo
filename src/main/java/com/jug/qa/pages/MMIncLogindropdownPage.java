package com.jug.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jug.qa.base.TestBase;

public class MMIncLogindropdownPage extends TestBase {
	
	@FindBy(xpath = "//*[@id='navbar3']/ul/li[1]/a")
	WebElement logintab;
	
	@FindBy(linkText = "Login as Incubation")
	WebElement logasincubation;
	
	@FindBy(xpath = "//*[@id='email']")
	WebElement emailid;
	
	@FindBy(xpath = "//*[@id='password']")
	WebElement pass;
	
	@FindBy(xpath = "//*[@id='login-incubation']/div/form/div[4]/button[1]")
	WebElement btnlogin;

	public MMIncLogindropdownPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions


	
	

	public void login(String un, String pwd) throws Exception {
		// TODO Auto-generated method stub
		driver.get(prop.getProperty("siglogin"));
		logintab.click();
		logasincubation.click();
	
		emailid.sendKeys(un);
		 pass.sendKeys(pwd);
		 Thread.sleep(5000);
		 btnlogin.click();
		
	}

	
		
	

}
