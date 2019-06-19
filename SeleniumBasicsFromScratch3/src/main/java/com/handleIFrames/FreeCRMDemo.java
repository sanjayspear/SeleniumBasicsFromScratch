package com.handleIFrames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FreeCRMDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("sanjayselenium");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("vivek123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		int xFrame = FrameUtil.goToFrame(driver, By.xpath("//a[@title='Contacts']"), "frame");
		driver.switchTo().frame(xFrame);
		
		driver.findElement(By.xpath("//a[@title='Contacts']")).click();
	}

}
