package com.slokam.opencart.automation.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.slokam.opencart.automation.pageobjects.AppLoginPage;
import com.slokam.opencart.automation.pageobjects.HomePage;
import com.slokam.opencart.automation.pageobjects.RegisterPage;

public class TestRegistration extends BaseTestCase {

	HomePage homePage = null;
	AppLoginPage appLoginPage = null;
	RegisterPage registerPage =null;
	
	@Test(groups="regression")
	public void verifyRegistrationFieldsPrivacyPolicyTest() {
		String expectedErrorMessage = " Warning: You must agree to the Privacy Policy!";
		homePage = new HomePage();
		homePage.clickOnLoginButton();
		
		appLoginPage.clickOnContinueButton();
		
		registerPage.register();
		String actualErrorMessage = registerPage.getErrorMessage();
		
		Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
	}
	
	@Test(groups="regression")
	public void verifyRegistrationFieldsEmailTest() {
		String expectedErrorMessage = "E-Mail Address does not appear to be valid!";
		homePage = new HomePage();
		homePage.clickOnLoginButton();
		appLoginPage.clickOnContinueButton();
		registerPage.register();
		String actualErrorMessage = registerPage.getErrorMessage();
		
		Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
	}
}
