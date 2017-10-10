package com.slokam.opencart.automation.pageobjects;

import org.openqa.selenium.By;

public class DashboardPage extends BasePage{

	public void logout() {
		
	}
	
	public void profileDetails() {
		
	}
	
	public void clickOnProducts() {
		driver.findElement(By.xpath("//a[contains(text(),'Catalog')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Products')]")).click();
	}
}
