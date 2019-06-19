package com.windowHandels;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://www.naukri.com/");
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	      
	      String parent = driver.getWindowHandle();
	      
	      Set<String> child = driver.getWindowHandles();
	      
	      for(String ele:child)
	      {
	    	  if(!parent.equals(child)) 
	    	  {
	    		  driver.switchTo().window(ele);
	    		  System.out.println(driver.getTitle());
	    		  driver.close();	
	    	  }
	      }
	}

}
