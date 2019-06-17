package com.selenium.mukesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectFacebookDropDown {
	
	@Test
	public void selectValues() {
		//Use below code snippet instead of System.setProperty(key, value)
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		WebElement month_dropdown = 
				driver.findElement(By.xpath("//select[@title='Month']"));
		
		Select month_dd = new Select(month_dropdown);
		
	
		}
}
