package com.jug.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jug.qa.base.TestBase;

public class MMInstConsultancyPage extends TestBase {

	@FindBy(xpath = "//*[@id='ConcultancyTable']/tbody[1]/tr/td[6]/p/a[1]")
	WebElement Consultancyview;

	@FindBy(xpath = "//*[@id='ConcultancyTable']/tbody[1]/tr/td[6]/p/a[2]/i")
	WebElement consultancydelete;

	public MMInstConsultancyPage() {
		PageFactory.initElements(driver, this);
	}
	// Actions

	public void InstituteConsultancyview() {
		Consultancyview.click();

	}

	public void InstituteConsultancyDelete() throws Exception {

		consultancydelete.click();
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
