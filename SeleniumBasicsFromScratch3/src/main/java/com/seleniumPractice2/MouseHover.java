package com.seleniumPractice2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://book.spicejet.com/");
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	      driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	      Actions actions = new Actions(driver);
	      actions.moveToElement(driver.findElement(By.xpath("//li[@id='header-addons']/a"))).build().perform();
	      driver.findElement(By.linkText("Hot Meals")).click();
	      //driver.quit();
	      
	}

}
