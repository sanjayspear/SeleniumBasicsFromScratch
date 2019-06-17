package com.selenium.mukesh;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownDemo {

	@Test
	public void dropdown() throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_elem_select");

		Select tools = new Select(driver.findElement(By.name("cars")));
		List<String> actualList = new ArrayList<String>();
		List<WebElement> myTools = tools.getOptions();

		for (WebElement ele : myTools) {
			String data = ele.getText();
			actualList.add(data);
		}

		List<String> temp = new ArrayList<String>();
		temp.addAll(actualList);
		Collections.sort(temp);
		assertTrue(actualList.equals(temp));
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
				
		
		

	}
}
