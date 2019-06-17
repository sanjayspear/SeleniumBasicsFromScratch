package com.testng;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

	WebDriver driver;

	@BeforeMethod
	@Parameters({ "Sysproperty", "driverPath", "Browser", "URL"})
	public void setUp(String Sysproperty, String driverPath, String Browser, String URL) {

		       if(Browser.equalsIgnoreCase("chrome")) {
		    	   System.setProperty(Sysproperty, driverPath);
			       driver = new ChromeDriver();
			       driver.manage().window().maximize();
			       driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
			       driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);	
			       driver.manage().deleteAllCookies();
			       driver.get(URL);
		       }
			   
	}

	@Test
	@Parameters({ "username", "pwd" })
	public void facebookLogin(String username, String pwd) {
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@type='password' and @id='pass']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@AfterMethod
	public void tesarDown() {
		driver.quit();
	}

}
