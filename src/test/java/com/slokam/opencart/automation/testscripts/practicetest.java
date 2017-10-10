package com.slokam.opencart.automation.testscripts;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class practicetest {
	WebDriver driver = null;
	Actions actions = null;
	String adminUrl = "http://localhost:88/opencart/";
     @Test
	 public void test() {
    	 //clickhome();
 		clickIphone();
 		clickAddToCart();
 		clickonShopingCart();
 		getUnitPrice();
    	 
	 }
     @BeforeClass
 	public void launchBrowser() {
 		String browser = "firefox";
 		String appUrl = "http://localhost:88/opencart";

 		if (browser.equals("chrome")) {
 			System.setProperty("webdriver.chrome.driver", "D:\\jars\\chromedriver.exe");
 			driver = new ChromeDriver();
 		} else if (browser.equals("firefox")) {
 			System.setProperty("webdriver.gecko.driver", "D:\\jars\\geckodriver.exe");
 			driver = new FirefoxDriver();
 		} else if (browser.equals("ie")) {
 			System.setProperty("webdriver.ie.driver", "D:\\jars\\IEDriverServer.exe");
 			driver = new InternetExplorerDriver();
 		}
     }
     public void urlLaunch() {
    	 driver.get(adminUrl);
 		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 		actions = new Actions(driver);
     }
    
 	public void clickIphone() {
 		driver.findElement(By.xpath("//div[@class='caption']/h4/a[contains(text(),'iPhone')]")).click();
 	}
 	public void clickAddToCart() {
 		driver.findElement(By.xpath("//div[@class='form-group']/button")).click();
 	}
 	public void clickonShopingCart() {
 		driver.findElement(By.xpath("//div[@id='top-links']/ul/li[4]")).click();
 	}
 	public void getUnitPrice() {
 		String unitprice=driver.findElement(By.xpath("//div[@class='table-responsive']//tbody/tr/td[5]")).getText();
 		System.out.println(unitprice);
 	}
 	public void totalPrice() {
 		String totalprice=driver.findElement(By.xpath("//div[@id='checkout-cart']//div[@class='row']//tbody/tr[4]/td[2]")).getText();
 		System.out.println(totalprice);
 	}
 	public void clickCheckout() {
 			
 	}
}
     

