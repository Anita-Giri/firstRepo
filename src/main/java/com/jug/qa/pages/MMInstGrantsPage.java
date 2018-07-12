package com.jug.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jug.qa.base.TestBase;

public class MMInstGrantsPage extends TestBase {
	@FindBy(xpath = "//*[@id='GrandFundingTable']/tbody[1]/tr/td[5]/p/a[1]")
	WebElement Grantsview;

	@FindBy(xpath = "//*[@id='GrandFundingTable']/tbody[1]/tr/td[5]/p/a[2]/i")
	WebElement Grantsdelete;

	public MMInstGrantsPage() {
		PageFactory.initElements(driver, this);
	}
	
	// Actions

	public void InstituteGrantsview() throws Exception {
		Thread.sleep(5000);
	Grantsview.click();

	}

	public void InstituteGrantsDelete() throws Exception {

		Grantsdelete.click();
		Thread.sleep(5000);
		Alert ok = driver.switchTo().alert();
		System.out.println(ok.getText());
		ok.accept();

		Thread.sleep(5000);
		Alert ok1 = driver.switchTo().alert();
		System.out.println(ok1.getText());
		ok1.accept();
	}


}
