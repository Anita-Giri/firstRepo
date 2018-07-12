package com.jug.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jug.qa.base.TestBase;



public class upliftLoginPage extends TestBase {
	

	

	// Page Factory - OR:
	@FindBy(name = "email")
	

	
	WebElement email;

	@FindBy(name = "password")
	

	WebElement password;

	@FindBy(xpath = "//*[@id='login']/div/form/div[4]/button[1]")
	WebElement loginBtn;
	
	
 
	public upliftLoginPage(){
			PageFactory.initElements(driver, this);
		}

	// Actions
	
	
	
	
	public void loginn(String un, String pwd) {
		driver.get(prop.getProperty("upliftloginurl"));
		email.sendKeys(un);
		password.sendKeys(pwd);
	    loginBtn.click();
		
	}



}
