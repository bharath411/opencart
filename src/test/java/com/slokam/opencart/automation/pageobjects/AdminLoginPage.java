package com.slokam.opencart.automation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminLoginPage extends BasePage {

	@FindBy(id="input-username")
	WebElement userEle ;
	
	@FindBy(id="input-password")
	WebElement passEle;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submitEle;
	
	@FindBy(xpath="//a[text()='Forgotten Password']")
	WebElement forgottenEle;
	
	public void login(String username, String password) {
		// login to admin app
		userEle.sendKeys(username);
		passEle.sendKeys(password);
		submitEle.click();
	}

	public void clickForgottenPasswordLink() {
		forgottenEle.click();
	}
	
	
}
