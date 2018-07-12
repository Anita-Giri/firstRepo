package com.jug.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import com.jug.qa.util.WebEventListener;

public class Testbasse {
	public static WebDriver driver;
	public static Properties prop;
	public  static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	
	public Testbasse(){
		try {
			
			
		
			prop = new Properties();

                                                                   prop1 = new Properties();// new change which need to delete
			FileInputStream ip = new FileInputStream("D://Automation Testing//jugaadfunda//src//main//java//com//jug"+ "//qa//config//config.properties");
					
					/*System.getProperty("user.dir")+ "/src/main/java/com/crm"
					+ "/qa/config/config.properties");*/
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void initialization(){
		String browserName = prop.getProperty("browser");
		
	 if(browserName.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "Resource/geckodriver.exe");	
			driver = new FirefoxDriver(); 
		}
		 else	if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");	
			driver = new ChromeDriver(); 
			}
		
		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
		
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	//	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("weburl"));
		
	}
	

}
