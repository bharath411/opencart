package com.slokam.automation.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Sample1 {

	@Test
	public void test1() {
		WebDriver driver  = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.quit();
	}
}
