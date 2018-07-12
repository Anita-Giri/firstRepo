package com.jug.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jug.qa.base.TestBase;

public class SIGLogout extends TestBase {
	@FindBy(xpath= "//*[@id='myNavbar']/ul[2]/li[4]/ul/li/a[2]/table/tbody/tr[4]/td/a")
	WebElement SIGLogoutlink;

	public SIGLogout(){
		PageFactory.initElements(driver, this);
	}

	
public void SIGlogoutclick() throws Exception {
	
	SIGLogoutlink.click();
	Alert ok = driver.switchTo().alert();
	System.out.println(ok.getText());
	ok.accept();
		
}
	
	
	
}
