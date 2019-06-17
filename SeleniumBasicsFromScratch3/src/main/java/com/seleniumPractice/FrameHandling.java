package com.seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",".//drivers/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		//driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com");
         
		
		
	}

}
