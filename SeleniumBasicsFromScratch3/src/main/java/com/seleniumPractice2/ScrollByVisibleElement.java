package com.seleniumPractice2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollByVisibleElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      JavascriptExecutor js = (JavascriptExecutor) driver;
	      driver.get("https://www.guru99.com/");
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      
	      //Waits until complete page will load. If page load less then 10 seconds then it ignores the rest
	      //of the waiting time.Hence, we call its as dynamic wait.
	      driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	      
	      //Waits for until each & every web elements will load.If page load less then 10 seconds then it ignores the rest
	      //of the waiting time.Hence, we call its as dynamic wait.
	      driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	      
	      
	      
	      WebElement element1 = driver.findElement(By.xpath("//a[text()='Backlog']"));
	      
	      WebElement element2 = driver.findElement(By.xpath("//a[@class='maximenuck ']/child::span[text()='Testing' and @class='titreck']"));
	      
	      // //This will scroll the page till the element1 is found	
	      js.executeScript("arguments[0].scrollIntoView();", element1);  
	      clickOn(driver,element1,40);
	      driver.navigate().back();
	      
	     //This will scroll the page till the element2 is found	
	      js.executeScript("arguments[0].scrollIntoView();", element2);
	      clickOn(driver,element2,40);
	      driver.navigate().back();
	      
         }
	
	public static void clickOn(WebDriver driver, WebElement locator, int timeout) {
  	  
  	  new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class)
  	  .until(ExpectedConditions.elementToBeClickable(locator));
  	  locator.click();
    }


}

   
