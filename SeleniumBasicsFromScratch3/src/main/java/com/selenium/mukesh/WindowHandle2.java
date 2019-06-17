package com.selenium.mukesh;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WindowHandle2 {
	@Test
	public void windowHandle() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");

		// Get all the session id's of window
		Set<String> allWindows = driver.getWindowHandles();

		// Storing all the session id's into array list
		ArrayList<String> tabs = new ArrayList<String>(allWindows);

		// Note: In this case you should know in which
		// order windows are coming
		driver.switchTo().window(tabs.get(3));
		Thread.sleep(3000);
		driver.close();

		driver.switchTo().window(tabs.get(2));
		Thread.sleep(3000);
		driver.close();

		driver.switchTo().window(tabs.get(1));
		Thread.sleep(3000);
		driver.close();

		driver.switchTo().window(tabs.get(0));
		Thread.sleep(3000);
		driver.close();
	}
}
