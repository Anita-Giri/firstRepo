package com.jug.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.jug.qa.base.TestBase;

public class MMSConsultancyPage extends TestBase{
	
	@FindBy(xpath= "//*[@id='ConsultancyTable']/tbody[1]/tr/td[3]/p/a")
	WebElement SIGConsultancytitle;
	
	
	@FindBy(xpath= "//*[@id='ConsultancyTable']/tbody[1]/tr/td[6]/a[1]")
	WebElement SIGConsultancyview;
	
	@FindBy(xpath= "html/body/div[2]/div/div/div/div/div/div[3]/a[1]")
	WebElement SIGConsultancyapply;
	
	@FindBy(xpath= "//*[@id='ConsultancyTable']/tbody[1]/tr/td[6]/a[2]/i")
	WebElement SIGConsultancychatclick;
	
	
	@FindBy(xpath= "//*[@id='btn-input']")
	WebElement SIGConsultancychattext;
	
	@FindBy(xpath= "//*[@id='btn-chat']")
	WebElement SIGConsultancychatsend;
	
	@FindBy(xpath= "//*[@id='ConsultancyTable']/tbody[1]/tr/td[6]/a[3]")
	WebElement SIGConsultancyupdateprogress;
	
	@FindBy(xpath= "html/body/div[2]/div/div/div/div/form/div/div[1]/div[2]/input")
	WebElement SIGConsultancymilestonename;// milestone name for the consultancy
	
	@FindBy(xpath= "html/body/div[2]/div/div/div/div/form/div/div[1]/div[3]/select")
	WebElement SIGConsultancyMilestonetype; // milestone type for the consultancy
	
	@FindBy(xpath= "html/body/div[2]/div/div/div/div/form/div/div[2]/textarea")
	WebElement SIGConsultancytextarea; //milestone desc for the consultancy
	
	@FindBy(xpath= "//*[@id='ConsultancyTable']/tbody[1]/tr/td[6]/a[4]")
	WebElement SIGConsultancydelete; //milestone desc for the consultancy
	
	
	public MMSConsultancyPage(){
		PageFactory.initElements(driver, this);
	}

	
public void consultancylink() throws Exception {
		
		SIGConsultancytitle.click();
	
		
}
	
	public void consultancyviewbutton() throws Exception {
		
		SIGConsultancyview.click();
		SIGConsultancyapply.click();
	
		
}
	
	public void consultancychatclick(String messagess) throws Exception {
		SIGConsultancychatclick.click();
		
		//SIGConsultancychatclick.click();
		 SIGConsultancychattext.sendKeys(messagess);
		//SIGConsultancychatsend.click();
		}
	
	
	public void consultancyupadteprogress(String milesname, String desc) throws Exception {
		
		SIGConsultancyupdateprogress.click();
		
		SIGConsultancymilestonename.sendKeys(milesname);

		Select type1 = new Select( SIGConsultancyMilestonetype);
		type1.selectByValue("Funding");
		SIGConsultancytextarea.sendKeys(desc);
		
}
	
public void consultancydelete() throws Exception {
		
	SIGConsultancydelete.click();
		
		}
	



}
