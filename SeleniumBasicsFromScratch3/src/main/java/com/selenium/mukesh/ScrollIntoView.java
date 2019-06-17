package com.selenium.mukesh;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ScrollIntoView {
	
	@Test
	public void BootstrapDD() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    
	    //Create object of java script executor
	    JavascriptExecutor je = (JavascriptExecutor)driver;
	    
	    //Launch the application
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		
		//Maximize the application
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	    
	    WebElement ele=driver.findElement(By.xpath("(//label[text()='Email address'])[1]"));
	    
	    //Scroll until visibility of element is true
	    je.executeScript("arguments[0].scrollIntoView(true)",ele);
	    
        String text = driver.findElement(By.xpath("(//a[text()='New around here? Sign up'])[1]")).getText();
        System.out.println(text);
     }
   }
