package com.slokam.opencart.automation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminProductsPage extends BasePage{

	@FindBy(xpath="//a[@data-original-title='Add New']")
	WebElement addNewBtn;
	
	@FindBy(name="filter_name")
	WebElement filterNameEle;
	
	@FindBy(id="button-filter")
	WebElement FilterButtonEle;
	
	@FindBy(xpath="//form[@id='form-product']//tbody//tr/td[5")
	WebElement firstRowPriceEle;
	
	public void filterProudct(String productName) {
		filterNameEle.sendKeys(productName);
		FilterButtonEle.click();
	}
	
	public String getFirstRowPrice() {
		return firstRowPriceEle.getText();
	}
	
	public void clicAddNewProductButton() {
		addNewBtn.click();
	}
	
	public void handleAlert() {
		driver.switchTo().alert().accept();
	}
	public void uploadImage() {
		driver.findElement(By.xpath("//a[text()='Image']")).click();
		driver.findElement(By.xpath("//a[@id='thumb-image']")).click();
		driver.findElement(By.id("button-image")).click();
		driver.findElement(By.id("button-upload")).click();
	}
}
