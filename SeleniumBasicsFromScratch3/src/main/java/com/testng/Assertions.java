package com.testng;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assertions {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		   System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	       driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	       driver.manage().deleteAllCookies();
	       driver.get("https://www.google.com");
	}
	
	@Test()
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		
		assertEquals(title, "Google123", "Title not matched");
	}
	
	@Test()
	public void imageTest() {
		Boolean  img = driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
		assertTrue(true);
	}
	
	
	@AfterMethod
	public void tesarDown() {
		driver.quit();
	}
	
	
}
