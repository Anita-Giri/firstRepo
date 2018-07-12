package com.jug.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jug.qa.base.TestBase;

public class upgradeLoginPage extends TestBase {

	@FindBy(xpath="//*[@id='email']")
	WebElement email;
	
	@FindBy(xpath="//*[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//*[@id='login']/div/form/div[4]/button[1]")
	WebElement btnlogin;
	
	public upgradeLoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	
	





	public void login(String un, String pwd) {
		// TODO Auto-generated method stub
		driver.get(prop.getProperty("upgradeurl"));
		email.sendKeys(un);
		password.sendKeys(pwd);
		btnlogin.click();
		
	}
	
}
