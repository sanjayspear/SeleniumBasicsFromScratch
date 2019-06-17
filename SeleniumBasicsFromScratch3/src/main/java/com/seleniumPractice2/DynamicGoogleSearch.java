package com.seleniumPractice2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicGoogleSearch {

	public static void main(String[] args) {
		   System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://www.google.com/");
	       driver.manage().window().maximize();
	       driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	       driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	       
	       driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("java");
	       List<WebElement> list =  driver.findElements(By.xpath("//ul[@role='listbox']"
	    		+ "//li/descendant::div[@class='sbtc']"));
	    
		    for(int i=0; i<list.size(); i++) {
		    	System.out.println(list.get(i).getText());
		    	
		    	if(list.get(i).getText().contains("java tutorial")) {
		    		list.get(i).click();
		    		break;
		    	}
		    }

	}

}
