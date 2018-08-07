package com.tv.codingroundpages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tv.core.BasePage;

/**
 * @author vvodd
 *
 */
public class SignInPage extends BasePage{
	
	@FindBy(linkText="Your trips")
	private WebElement linktext_yourtrips;

	public SignInPage(WebDriver driver) {
		super(driver);
	}
	
	public void clickOnYourTrips() {
		try {
			linktext_yourtrips.click();
			System.out.println("Successfully clicked on YourTrips");
		}catch(NoSuchElementException e) {
			System.out.println("No Such Element - YourTrips");
		}catch(Exception e) {
			System.out.println(""+e);
		}
		
	}

}
