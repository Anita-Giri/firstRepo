package com.jug.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.jug.qa.base.TestBase;

public class MMShackathonsPage extends TestBase{
  
	
	@FindBy(xpath= "//*[@id='HackthonTable']/tbody/tr/td[3]/p/a")
	WebElement SIGHackathonstitle;
	
	@FindBy(xpath= "//*[@id='HackthonTable']/tbody/tr/td[6]/a[1]")
	WebElement SIGHackathonview;
	
	@FindBy(xpath= "//*[@id='HackthonTable']/tbody/tr/td[6]/a[2]/i")
	WebElement SIGHackathonchaticon;
	
	@FindBy(xpath= "//*[@id='btn-input']")
	WebElement SIGHackathonchatwrite;
	
	@FindBy(xpath= "//*[@id='btn-chat']")
	WebElement SIGHackathonchatsend;
	
	
	@FindBy(xpath= "//*[@id='HackthonTable']/tbody/tr/td[6]/a[3]")
	WebElement SIGHackathonupdateprogress;
	
	
	@FindBy(xpath= "html/body/div[2]/div/div/div/div/form/div/div[1]/div[2]/input")
	WebElement SIGHackathonmilestonename;// milestone name for the consultancy
	
	@FindBy(xpath= "html/body/div[2]/div/div/div/div/form/div/div[1]/div[3]/select")
	WebElement SIGHackathonMilestonetype; // milestone type for the consultancy
	
	@FindBy(xpath= "html/body/div[2]/div/div/div/div/form/div/div[2]/textarea")
	WebElement SIGHackathontextarea; //milestone desc for the consultancy
	
	
	
	
	@FindBy(xpath= "//*[@id='HackthonTable']/tbody/tr/td[6]/a[4]/i")
	WebElement SIGHackathondelete;
	
	

	public MMShackathonsPage(){
		PageFactory.initElements(driver, this);
	}

	
	

	public void hackathontitlelink() throws InterruptedException {
		Thread.sleep(5000);
		SIGHackathonstitle.click();
		Thread.sleep(5000);
		
	}
	
	public void hackathonview() throws InterruptedException {
		
		SIGHackathonstitle.click();
		
		
	}
	
public void Hackathonviewbutton() throws Exception {
		
	SIGHackathonview.click();
	
		
}
	
	public void Hackathonchatclick(String messagess) throws Exception {
		SIGHackathonchaticon.click();
		
		//SIGConsultancychatclick.click();
		SIGHackathonchatwrite.sendKeys(messagess);
		//SIGHackathonchatsend.click();
		}
	
	
	public void Hackathonupadteprogress(String milesname, String desc) throws Exception {
		
		 SIGHackathonupdateprogress.click();
		
		 SIGHackathonmilestonename.sendKeys(milesname);

		Select type1 = new Select(SIGHackathonMilestonetype);
		type1.selectByValue("Funding");
		SIGHackathontextarea.sendKeys(desc);
		
}
	
public void Hackathondelete() throws Exception {
		
	SIGHackathondelete.click();
		
		}

	
	
}
