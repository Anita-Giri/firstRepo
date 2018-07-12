package com.jug.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.TestNGException;

import com.jug.qa.base.TestBase;

public class MMSRegistrationlinkPage extends TestBase {
	
	@FindBy(xpath="//*[@id='navbar3']/ul/li[2]/a")
	WebElement Registrationlink;
	
	@FindBy(xpath="//*[@id='sname']")
	WebElement fname;
	
	@FindBy(xpath="//*[@id='aspecial']")
	WebElement areaofspecialization;
	
	@FindBy(xpath="//*[@id='Industry']")
	WebElement patner;
	
	@FindBy(xpath="//*[@id='lname']")
	WebElement leader;
	
	@FindBy(xpath="//*[@id='mobileno']")
	WebElement mobile;
	
	@FindBy(xpath="//*[@id='emailid']")
	WebElement email;
	
	@FindBy(xpath="//*[@id='sigregi']/div[6]/div/div/div/button")
	WebElement verifyy;
	
	@FindBy(xpath="//*[@id='adharno']")
	WebElement adhar;
	
	@FindBy(xpath="//*[@id='sigcname']")
	WebElement sigcoo;
	
	@FindBy(xpath="//*[@id='comobileno']")
	WebElement sigcoomobile;
	
	@FindBy(xpath="//*[@id='cemailid']")
	WebElement sigcoemail;
	
	@FindBy(xpath="//*[@id='cadharno']")
	WebElement sigadhar;
	
	@FindBy(xpath="//*[@id='address']")
	WebElement sigaddress;
	
	@FindBy(xpath="//*[@id='address-input']")
	WebElement sigcity;
	
	@FindBy(xpath="//*[@id='pcode']")
	WebElement sigpin;
	
	@FindBy(xpath="//*[@id='check']")
	WebElement sigcheckyes;
	
	@FindBy(xpath="//*[@id=\"Btn_Save\"]")
	WebElement btnsubmit;
	
	
	
	public MMSRegistrationlinkPage(){
			PageFactory.initElements(driver, this);
		}   //close

	// Actions
	
public void  Registertioclick() {
	
	driver.get(prop.getProperty("url1"));
	
     	Registrationlink.click();
    	}  //close


public void  Registertionclick(String ftname,String aos,String typ1,String Part,String sigleader,String Sigmobileno,String emailid, String adharr, String coordinatorname,String sigmobileno, String emailidd, String adharnum, String address,
		String cityy,String pincodee) throws Exception { //String ftName, String ltName, String comp){) {
	
	try
	{
		
		
	driver.findElement(By.linkText("Registration as SIG")).click();
	Thread.sleep(5000);
	fname.sendKeys(ftname);//Sig name
	areaofspecialization.sendKeys(aos);//area of specialization
	Select select = new Select(driver.findElement(By.xpath("//*[@id='sigtype']")));// SIG group type
	select.selectByValue(typ1);
	// entering name for patner
	patner.sendKeys(Part);
	
	//group leader name entered
	
	leader.sendKeys(sigleader);
	mobile.sendKeys(Sigmobileno);
	email.sendKeys(emailid);
	//verifyy.click();
	adhar.sendKeys(adharr);
	sigcoo.sendKeys(coordinatorname);
	sigcoomobile.sendKeys(sigmobileno);
	sigcoemail.sendKeys(emailidd);
	sigadhar.sendKeys(adharnum);
	sigaddress.sendKeys(address);
	JavascriptExecutor j=(JavascriptExecutor) driver;
	  j.executeScript("window.scrollBy(0,600)","");
	  
	  sigcity.sendKeys(cityy);
		sigpin.sendKeys(pincodee);
	  
	  WebElement radio1=driver.findElement(By.name("check"));
	  radio1.click();
	
	sigcheckyes.click();
	btnsubmit.click();
	Alert ok = driver.switchTo().alert();
	System.out.println(ok.getText());
	ok.accept();
	
	}
	catch(TestNGException e)
	{
		System.out.println("Exception cracked"+e);
	}
	
	
	
}  //close Registration click





}
