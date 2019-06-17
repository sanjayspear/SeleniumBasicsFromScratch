package com.seleniumPractice2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GoogleAutoSuggestion {

	@Test
	public void autoSuggest() {
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("test");
		
		List<WebElement> options = driver.findElements(By.xpath("//ul//li//div[@class='suggestions-inner-container']"));
		
		System.out.println("Totalnumber of suggestions in google search::::==> "+options.size());
		
		for(int i=0; i<options.size(); i++) {
			//String value=ele.getText();
			
			System.out.println(	options.get(i).getText());
			
			String suggestions=options.get(i).getText();
			
			/*if(suggestions.equalsIgnoreCase("java interview questions")) {
			   
				options.get(i).click();	
			}
			*/
			if(suggestions.contains("test case template")) {
				   
				options.get(i).click();	
				break;
			}
		}
	}

}
