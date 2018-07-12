package com.jug.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.jug.qa.base.TestBase;

public class IdeasSigTabPage extends TestBase{
	
	@FindBy(xpath="//*[@id='IdeaTable']/tbody[1]/tr/td[3]/p/a")
	WebElement Ideastitle;
	
	@FindBy(xpath="//*[@id='IdeaTable']/tbody[1]/tr/td[6]/p/a")
	WebElement mysupport;
	
	@FindBy(xpath="//*[@id=\"iresp\"]")
	WebElement dropdown;
	
	public IdeasSigTabPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	public void  ideasdetail() {
		
		Ideastitle.click();
		
		
	}
	
	public void mysupport() throws Exception {
		
		mysupport.click();
		Thread.sleep(5000);
		Select sgender = new Select(dropdown);
		

		sgender.selectByValue("IT Support");
		
		
    
		
		
}


	

}
