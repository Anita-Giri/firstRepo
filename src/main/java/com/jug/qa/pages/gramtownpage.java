package com.jug.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jug.qa.base.TestBase;

public class gramtownpage extends TestBase{
	
	
	
	
	@FindBy(xpath= "//*[@id='GramTable']/tbody/tr/td[3]/p/a")
	WebElement SIGGramtitle;
	
	
	@FindBy(xpath= "//*[@id='GramTable']/tbody/tr/td[5]/a[1]")
	WebElement SIGGramviewApply;
	
	@FindBy(xpath= "html/body/div[2]/div/div/div[2]/div[2]/div/div[6]/a[1]")
	WebElement SIGGramApply;
	
	
	@FindBy(xpath= "//*[@id='GramTable']/tbody/tr/td[5]/a[2]/i")
	WebElement SIGGramchatclick;
	
	
	@FindBy(xpath= "//*[@id='btn-input']")
	WebElement SIGGramchattext;
	
	@FindBy(xpath= "//*[@id='btn-chat']")
	WebElement SIGGramchatsend;
	
	public gramtownpage(){
		PageFactory.initElements(driver, this);
	}

	
public void Gramlink() throws Exception {
	Thread.sleep(5000);
		
		SIGGramtitle.click();
	
		
}
	
	public void Gramviewbutton() throws Exception {
		
		Thread.sleep(5000);
		SIGGramviewApply.click();
		SIGGramApply.click();
		Alert ok = driver.switchTo().alert();
		System.out.println(ok.getText());
		ok.accept();
		
	
		
}
	
	public void Gramchatclick(String messagess) throws Exception {
		
		Thread.sleep(5000);
		SIGGramchatclick.click();
		
		//SIGConsultancychatclick.click();
		 SIGGramchattext.sendKeys(messagess);
		//SIGConsultancychatsend.click();
		}
	
	

}
