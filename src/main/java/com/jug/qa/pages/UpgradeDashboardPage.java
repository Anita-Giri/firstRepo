package com.jug.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jug.qa.base.TestBase;

public class UpgradeDashboardPage extends TestBase {
	
	@FindBy(xpath="//*[@id='graduatelevel']")
	WebElement graduatetab;
	
	@FindBy(xpath="//*[@id='professionallevel']")
	WebElement professionaltab;
	
	@FindBy(xpath="//*[@id='login']/div/form/div[4]/button[1]")
	WebElement ongoingtab;
	
	
	@FindBy(xpath="//*[@id='myNavbar']/ul[2]/li[1]/a/i")
	WebElement reportbug;
	
	
	@FindBy(xpath="//*[@id='myNavbar']/ul[2]/li[2]/a/i/span")
	WebElement contactbtn;
	
	@FindBy(xpath="//*[@id='myNavbar']/ul[2]/li[3]/a/i")
	WebElement event;
	
	@FindBy(xpath="//*[@id='myNavbar']/ul[2]/li[4]/a/i")
	WebElement Notificationbtn;
	
	@FindBy(xpath="//*[@id='myNavbar']/ul[2]/li[5]/a/i")
	WebElement usernameclick;
	
	
	@FindBy(xpath="//*[@id='myNavbar']/ul[2]/li[5]/ul/li/a[2]/table/tbody/tr[4]/td/a")
	WebElement signout;
	
	public UpgradeDashboardPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void grauate() {
		
		graduatetab.click();
		

}
	
public void professional() {
		
	professionaltab.click();
		

}
	
public void ongoing() {
	
	ongoingtab.click();
	

}	
	


	


public void contactbtnlink() {
	
	contactbtn.click();
	

}	
	

public void eventpagelink() {
	
	event.click();
	

}	
	


public void Notificationlink() {
	
	Notificationbtn.click();
	

}	
	


public void logout() throws Exception {
	
	usernameclick.click();
	signout.click();
	Thread.sleep(3000);

	Alert ok1 = driver.switchTo().alert();
	System.out.println(ok1.getText());
	ok1.accept();

}	
	

	
	
	

}
