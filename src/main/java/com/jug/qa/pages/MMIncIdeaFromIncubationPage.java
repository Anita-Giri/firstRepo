package com.jug.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import com.jug.qa.base.TestBase;


public class MMIncIdeaFromIncubationPage extends TestBase{
	

	@FindBy(xpath = "//*[@id='myTab3']/li[3]/a")
	WebElement ideas;
	
	@FindBy(xpath = "//*[@id='incuideatable']/tbody[1]/tr/td[5]/p/a")
	WebElement mysupport;
	
	@FindBy(xpath = "//*[@id='iresp']")
	WebElement mysupportviewresponse;
	
	

	public MMIncIdeaFromIncubationPage() {
		PageFactory.initElements(driver, this);
	}
	
	// Actions

	public void ideasfromincubation() throws Exception {
		 ideas.click();
	


	}

	
	public void incmysupport() throws Exception {
		
		   mysupport.click();
		   Thread.sleep(5000);
		 Select select = new Select(mysupportviewresponse);// SIG group type
			select.selectByVisibleText("Stress Management Support");
	
	}

	

}
