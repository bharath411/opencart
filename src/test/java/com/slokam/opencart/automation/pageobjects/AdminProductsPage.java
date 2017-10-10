package com.slokam.opencart.automation.pageobjects;

import org.openqa.selenium.By;

public class AdminProductsPage extends BasePage{

	
	public void filterProudct(String productName) {
		driver.findElement(By.name("filter_name")).sendKeys(productName);
		driver.findElement(By.id("button-filter")).click();
	}
	
	public String getFirstRowPrice() {
		return driver.findElement(By.xpath("//form[@id='form-product']//tbody//tr/td[5]")).getText();
	}
}
