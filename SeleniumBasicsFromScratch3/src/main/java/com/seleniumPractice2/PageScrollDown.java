package com.seleniumPractice2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageScrollDown {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      JavascriptExecutor js = (JavascriptExecutor) driver;
	      driver.get("https://www.rediff.com/");
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      
	      //Waits until complete page will load. If page load less then 10 seconds then it ignores the rest
	      //of the waiting time.Hence, we call its as dynamic wait.
	      driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	      
	      //Waits for until each & every web elements will load.If page load less then 10 seconds then it ignores the rest
	      //of the waiting time.Hence, we call its as dynamic wait.
	      driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	      
	     
	      js.executeScript("window.scrollBy(0,6000)");
	      
	      Thread.sleep(5000);

	}

}
