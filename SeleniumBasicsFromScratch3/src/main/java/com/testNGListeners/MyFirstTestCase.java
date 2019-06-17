package com.testNGListeners;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class MyFirstTestCase {
	@Test
	public void googleTitleVerify() {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void dummyTest() {
		assertTrue(false);
	}
}
