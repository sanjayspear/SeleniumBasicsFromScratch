package com.seleniumPractice2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWaitConcept {

	public static void main(String[] args) throws InterruptedException {
		
		      System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		      WebDriver driver=new ChromeDriver();
		      driver.get("https://www.rediff.com/");
		      driver.manage().window().maximize();
		      driver.manage().deleteAllCookies();
		      
		      //Waits until complete page will load. If page load less then 10 seconds then it ignores the rest
		      //of the waiting time.Hence, we call its as dynamic wait.
		      driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		      
		      //Waits for until each & every web elements will load.If page load less then 10 seconds then it ignores the rest
		      //of the waiting time.Hence, we call its as dynamic wait.
		      driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		      
		      WebElement signIn=driver.findElement(By.xpath("//a[text()='Sign in']"));
		      
		      clickOn(driver,signIn,20);
		      
		      WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
		      
		      clickOn(driver,submit,20);
		      
		      Thread.sleep(5000);
		      
		      Alert alert = driver.switchTo().alert();
		      String text = alert.getText();
		      if(text.equals("Please enter a valid user name")){
		    	  System.out.println("Correct alert message");
		      }
		      else
		      {
		    	  System.out.println("Invalid alert message");
		      }
		      
		      alert.accept();//ok
		      
		      
		      driver.quit();
		      
	}
	
	      public static void clickOn(WebDriver driver, WebElement locator, int timeout) {
	    	  
	    	  new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class)
	    	  .until(ExpectedConditions.elementToBeClickable(locator));
	    	  locator.click();
	      }

}
