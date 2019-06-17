package com.seleniumPractice2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//What is the difference b/w get() method and navigate().to() method?

//Answer: Both are used to launch the url. But, navigate().to() used to launch the external URL 
//(I mean one web site to another).

public class Navigations {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://www.google.com/");
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      //Waits until complete page will load. If page load less then 10 seconds then it ignores the rest
	      //of the waiting time.Hence, we call its as dynamic wait.
	      driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	      
	      //Waits for until each & every web elements will load.If page load less then 10 seconds then it ignores the rest
	      //of the waiting time.Hence, we call its as dynamic wait.
	      driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	      
	      driver.navigate().to("https://www.amazon.com/");
	      Thread.sleep(5000);
	      driver.navigate().back();
	      Thread.sleep(5000);
	      driver.navigate().forward();
	      Thread.sleep(5000);
	      driver.navigate().back();
	      driver.navigate().refresh();
	      Thread.sleep(5000);
	      driver.quit();
	     
	      
	}

}
