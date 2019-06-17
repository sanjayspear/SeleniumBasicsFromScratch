package com.seleniumPractice2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightElement {

	public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://facebook.com");
       driver.manage().window().maximize();
       driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
       driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
       
       WebElement element = driver.findElement(By.xpath("//label[@id='loginbutton']"));
       
       flashElement(driver, element);
       
       tearDown(driver);
       
	}
	
	   public static void flashElement(WebDriver driver, WebElement element) {
		   JavascriptExecutor je = (JavascriptExecutor)driver;
		   //Here, we storing default color of the button
		   String bgColor = element.getCssValue("backgroundColor");
		   
		   //switch between user defined & default color 100 times
		   for(int i = 0; i < 5; i++) {
			   changeColor("rgb(0,200,0)", element, driver); //user defined color
			   changeColor(bgColor, element, driver);  //default color
		   }
		   
	   }
	   
	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}

	}
	   
	   public static void tearDown(WebDriver driver) {
		   driver.quit();
	   }

}
