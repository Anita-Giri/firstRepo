package com.jug.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jug.qa.base.TestBase;

public class MMSLoginPage extends TestBase{
	
	@FindBy(xpath="html/body/nav/div/div[1]/a/img")
	WebElement JFLogo;
	

	// Page Factory - OR:
	@FindBy(name = "email")
	

	
	WebElement email;

	@FindBy(name = "password")
	

	WebElement password;

	@FindBy(xpath = "//*[@id='login']/div/form/div[4]/button[1]")
	WebElement loginBtn;
	
	
 
	public MMSLoginPage(){
			PageFactory.initElements(driver, this);
		}

	// Actions
	
	public String validateLoginPageTitle() {
		
		 return driver.getTitle();
	}
	
	
	public boolean validateJFImage(){
		return JFLogo.isDisplayed();
	}
	
	
	public MMSdashboardPage loginn(String un, String pwd) {
		driver.get(prop.getProperty("url1"));
		
		email.sendKeys(un);
		password.sendKeys(pwd);
	    loginBtn.click();
		return new MMSdashboardPage();
	}


}
