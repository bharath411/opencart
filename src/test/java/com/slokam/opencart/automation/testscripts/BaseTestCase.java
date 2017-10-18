package com.slokam.opencart.automation.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;

public class BaseTestCase {

	
	public static WebDriver driver = null;
	Actions actions = null;
	String adminUrl = "http://localhost:88/opencart/admin";

	@BeforeSuite
	public void launchBrowser() {
		String browser = "chrome";
		String appUrl = "http://localhost:88/opencart";

		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\jars\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\jars\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "D:\\jars\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}

		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		actions = new Actions(driver);
	}
}
