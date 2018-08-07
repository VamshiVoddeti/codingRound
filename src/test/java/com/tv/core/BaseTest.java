/**
 * 
 */
package com.tv.core;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * @author vvodd
 *
 */
public class BaseTest {
	
private WebDriver driver;
	
	
	public WebDriver getDriver() {
		
		String browser="Chrome"; //I am assuming here Only Chrome. We can extend code by else statement for remaining browsers 
		if(browser.equalsIgnoreCase("chrome")){
			ChromeOptions options = new ChromeOptions();
			options.addArguments("disable-infobars");
			options.merge(chromeCapabilities());
			driver= new ChromeDriver(options);
		}
		return driver;
		
	}
	
	public DesiredCapabilities chromeCapabilities() {
		DesiredCapabilities capabilities= null;
		try {
			System.setProperty("webdriver.chromedriver", "F:\\GitHub\\workspace\\ChromeDriver\\chromedriver.exe");
			capabilities = DesiredCapabilities.chrome();
			((DesiredCapabilities)capabilities).setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
		}catch(Exception e3) {
			
		}
		
		return capabilities;
		
	}

}
