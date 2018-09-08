package com.slokam.opencart.automation.testscripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.slokam.opencart.automation.pageobjects.AdminLoginPage;
import com.slokam.opencart.automation.pageobjects.DashboardPage;

public class TestCustomerStats extends BaseTestCase {

	
	AdminLoginPage loginPage = null;
	DashboardPage dashboardPage = null;
	
	@Test
	public void verifyCustomerStats() {
		launchAdminApp();
		loginPage = PageFactory.initElements(driver, AdminLoginPage.class);
		loginPage.login(username, password);
		dashboardPage =  PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.clickOnCustomers();
	}
			
}
