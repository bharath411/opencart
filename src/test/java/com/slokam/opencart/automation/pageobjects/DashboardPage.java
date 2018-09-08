package com.slokam.opencart.automation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{

	public void logout() {
		
	}
	
	public void profileDetails() {
		
	}
	@FindBy(xpath="//a[contains(text(),'Catalog')]")
	WebElement catalog;
	@FindBy(xpath="//a[contains(text(),'Products')]")
	WebElement Products;
	public void clickOnProducts() {
		//catalog.click();
		driver.findElement(By.xpath("//a[contains(text(),'Catalog')]")).click();
		//Products.click();
		driver.findElement(By.xpath("//a[contains(text(),'Products')]")).click();
	}
	
	
	public void clickOnCustomers() {
		//catalog.click();
		driver.findElement(By.xpath("//a[contains(text(),'Customers')]")).click();
		//Products.click();
		driver.findElement(By.xpath("//a[contains(text(),'Products')]")).click();
	}
}
