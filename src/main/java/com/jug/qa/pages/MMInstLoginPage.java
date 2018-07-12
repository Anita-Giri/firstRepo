package com.jug.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jug.qa.base.TestBase;

public class MMInstLoginPage extends TestBase {
	
	@FindBy(xpath = "//*[@id='navbar3']/ul/li[1]/a")
	WebElement logintab;
	
	@FindBy(linkText = "Login as Institute")
	WebElement logasinstitute;
	
	@FindBy(xpath = "//*[@id='email']")
	WebElement emailid;
	
	@FindBy(xpath = "//*[@id='password']")
	WebElement pass;
	
	@FindBy(xpath = "//*[@id='login-institute']/div/form/div[4]/button[1]")
	WebElement btnlogin;

	
	public MMInstLoginPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions

	
	
	

	/*public void login(String un, String pwd) throws Exception {
		//String un, String pwd
		// TODO Auto-generated method stub
		
	}*/

	public void login(String un, String pwd) throws Exception {
		// TODO Auto-generated method stub
		driver.get(prop.getProperty("siglogin"));
		logintab.click();
		logasinstitute.click();
	
		emailid.sendKeys(un);
	      pass.sendKeys(pwd);
	      Thread.sleep(5000);
		btnlogin.click();
		
		
	}

}
