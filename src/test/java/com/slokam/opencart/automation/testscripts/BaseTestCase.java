package com.slokam.opencart.automation.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.slokam.opencart.automation.commons.data.PropertyHandler;

public class BaseTestCase {
	PropertyHandler appProps = null;
	public static WebDriver driver = null;
	Actions actions = null;
	String adminUrl = "";
	String appUrl = "";
	String username = "";
	String password = "";

	@BeforeMethod
	public void launchBrowser() {
		appProps = new PropertyHandler();
		String browser = appProps.getProperty("browser");
		appUrl = appProps.getProperty("appurl");
		username = appProps.getProperty("username");
		password = appProps.getProperty("password");
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./src/test/resources/drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equals("ie")) {
			System.setProperty("webdriver.ie.driver",
					"./src/test/resources/drivers/chromedriver.exe/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else {
			Assert.fail("Browser not matched");
		}

		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		actions = new Actions(driver);
	}

	public void launchAdminApp() {
		adminUrl = appProps.getProperty("adminurl");
		driver.get(adminUrl);
	}

	public void launchApp() {
		adminUrl = appProps.getProperty("appurl");
		driver.get(adminUrl);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
