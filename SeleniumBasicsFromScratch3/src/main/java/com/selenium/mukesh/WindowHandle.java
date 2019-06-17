package com.selenium.mukesh;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class WindowHandle {
	@Test
	public void windowHandle() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		//Open browser
	    WebDriver driver = new FirefoxDriver();  
	   //Maximize browser
	    driver.manage().window().maximize();    
	   //Load app
	    driver.get("https://www.naukri.com/");    
	    //It will return the parent window name as a String
	    String parent = driver.getWindowHandle();
	    System.out.println("Parent Window is "+parent);
	    //It will return the both parent & child window names as a set of String
	    Set<String> allWindows = driver.getWindowHandles();
	    System.out.println("Parent & its child window are "+allWindows);
	    
	    for(String child : allWindows) {
	    	//Only execute the statements only if parent is not 
	    	//equal to child session id
	    	if(!parent.equalsIgnoreCase(child)) {
	    		 
	    		//Here, you don't use driver.quit() because i will close your 
	    		//parent window as well
	    		driver.switchTo().window(child);
	    		System.out.println("Child window title "+driver.getTitle());
	    		driver.close();
	    		Thread.sleep(3000);}
	    	}
	       driver.switchTo().window(parent);
	       System.out.println("Parent window title is "+driver.getTitle());
	       driver.quit();
	    }
	}
