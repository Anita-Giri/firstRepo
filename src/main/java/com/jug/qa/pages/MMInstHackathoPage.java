package com.jug.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jug.qa.base.TestBase;

public class MMInstHackathoPage extends TestBase {
	@FindBy(xpath = "//*[@id='HackathonTable']/tbody/tr/td[6]/p/a[1]")
	WebElement Hackathonview;

	@FindBy(xpath = "//*[@id='HackathonTable']/tbody/tr/td[6]/p/a[2]/i")
	WebElement Hackathondelete;

	public MMInstHackathoPage() {
		PageFactory.initElements(driver, this);
	}
	
	// Actions

	public void InstituteHackathonview() throws Exception {
		Thread.sleep(5000);
		Hackathonview.click();

	}

	public void InstituteHackathonDelete() throws Exception {

		Hackathondelete.click();
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
