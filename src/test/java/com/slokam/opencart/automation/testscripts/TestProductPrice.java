package com.slokam.opencart.automation.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestProductPrice extends BaseTestCase{

	

	@Test
	public void testProductPriceComaprision() {
		
		clickOnMac();
		clickImacImage();
		// Get Product Name
		String productName = getProductName();
		System.out.println(productName);

		// Get product price
		String price = getExPrice();
		System.out.println(price);
		// launch admin app
		launchAdminApp();
		// login to admin app
		login("user", "user123");
		// CLick on catalog
		clickOnCatalog();
		clickOnProducts();
		filterProudct(productName);
		String priceFromAdmin = getPrice();
		System.out.println(priceFromAdmin);
	}
	public void login(String username, String password) {
		// login to admin app
		driver.findElement(By.id("input-username")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	public void clickOnMac() {
		// Mouse Over on Desktops
		WebElement deskTopEle = driver.findElement(By.xpath("//a[text()='Desktops']"));
		actions.moveToElement(deskTopEle).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'Mac (1)')]")).click();
	}

	public void clickImacImage() {
		// Click on Imac Image
		driver.findElement(By.xpath("//img[@title='iMac']")).click();
	}

	public void launchAdminApp() {
		driver.get(adminUrl);
	}
	
	public String getProductName() {
		return driver.findElement(By.xpath("//div[@id='content']//h1")).getText();
	}
	
	public String getExPrice() {
		return driver
				.findElement(By.xpath("//div[@id='content']/div[1]/div[2]//li[contains(text(),'Ex Tax:')]")).getText();
	}
	
	public void clickOnCatalog() {
		driver.findElement(By.xpath("//a[contains(text(),'Catalog')]")).click();
	}
	
	public void clickOnProducts() {
		driver.findElement(By.xpath("//a[contains(text(),'Products')]")).click();
	}
	
	public void filterProudct(String productName) {
		driver.findElement(By.name("filter_name")).sendKeys(productName);
		driver.findElement(By.id("button-filter")).click();
	}
	
	public String getPrice() {
		return driver.findElement(By.xpath("//form[@id='form-product']//tbody//tr/td[5]")).getText();
	}
	
	
}
