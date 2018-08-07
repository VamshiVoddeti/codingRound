/**
 * 
 */
package com.tv.codingroundtests;

import org.testng.annotations.Test;

import com.tv.codingroundpages.SignInPage;
import com.tv.core.BaseTest;

/**
 * @author vvodd
 *
 */
public class SignInTest extends BaseTest {
	private SignInPage signIn;
	
	public  SignInTest() {
		signIn = new SignInPage(getDriver());
	}
	
	
	@Test
	public void shouldThrowAnErrorIfSignInDetailsAreMissing() {
		getDriver().get("https://www.cleartrip.com");
		signIn.clickOnYourTrips();
		
		
	}

}
