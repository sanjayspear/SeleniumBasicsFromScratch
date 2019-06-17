package com.seleniumPractice2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplictlyWait2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		WebElement element = driver.findElement(By.xpath("//a[text()='Sign in']"));
		ClickOn(driver, element, 60);
		
		WebElement login = driver.findElement(By.xpath("//input[@type='text']"));
		sendKeys(driver, login, "sanjayspear@gmail.com", 40);
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		sendKeys(driver, password, "Sanjay#123", 30);
		
		tearDown(driver);

	}

	public static void ClickOn(WebDriver driver, WebElement element, int timeout) {

		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		element.click();

	}

	public static void sendKeys(WebDriver driver, WebElement element, String userValue, int timeout) {
		new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.sendKeys(userValue);
	}

	public static void tearDown(WebDriver driver) {
		driver.quit();
	}

}
