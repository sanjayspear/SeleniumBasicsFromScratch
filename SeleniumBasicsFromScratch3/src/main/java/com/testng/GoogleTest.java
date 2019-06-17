package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class GoogleTest {
	WebDriver driver;
	//Note @Test are executed according to alphabetical order of test method. Not randomly.
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
	
	@Test(priority=2)
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Test(priority=3)
	public void imageTest() {
		Boolean  img = driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
	}
	
	@Test(priority=2)
	public void linkTest() {
		Boolean link = driver.findElement(By.linkText("mail")).isDisplayed();
	}
	
	@AfterMethod
	public void tesarDown() {
		driver.quit();
	}
	
}
