package com.slokam.opencart.automation.testscripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.slokam.opencart.automation.pageobjects.AdminLoginPage;
import com.slokam.opencart.automation.pageobjects.AdminProductsPage;
import com.slokam.opencart.automation.pageobjects.DashboardPage;

public class TestProductPrice2 extends BaseTestCase{

	
	@Test
	public void verifyProductPriceTest() {
		launchAdminApp();
		AdminLoginPage adminLoginPage = new AdminLoginPage();
		adminLoginPage.login("user","user123");
		
		DashboardPage dashboardPage = new DashboardPage();
		dashboardPage.clickOnProducts();
		
		AdminProductsPage adminProductsPage = new AdminProductsPage();
		adminProductsPage.filterProudct("iMac");
		String price = adminProductsPage.getFirstRowPrice();
		System.out.println(price);
	}
	
	public void launchAdminApp() {
		driver.get("https://localhost:448/opencart/admin/");
	}
	

	@Test
	public void testPF() {
		launchAdminApp();
		AdminLoginPage adminLoginPage = new AdminLoginPage();
		PageFactory.initElements(driver, adminLoginPage);
		adminLoginPage.login("user", "user123");
	}
}
