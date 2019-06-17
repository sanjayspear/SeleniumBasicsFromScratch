package com.seleniumPractice2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {
	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://www.amazon.in/");
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	      driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	      
	      //In the below code we moved to desired text box and clicked on the text box then entered text in
	      //upper case.
	      Actions actions = new Actions(driver);
	      WebElement move = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
	      actions.moveToElement(move).click().keyDown(Keys.SHIFT).sendKeys("laptops").build().perform();
	      Thread.sleep(3000);
	      move.clear();
	      
	      Thread.sleep(2000);
	      //select entire text using doubleClick()
	      actions.moveToElement(move).click().keyDown(Keys.SHIFT).sendKeys("laptops").doubleClick().build().perform();
	      
	      actions.moveToElement(driver.findElement(By.xpath("//span[text()='Hello, Sign in']"))).contextClick().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
	      

  }
}
