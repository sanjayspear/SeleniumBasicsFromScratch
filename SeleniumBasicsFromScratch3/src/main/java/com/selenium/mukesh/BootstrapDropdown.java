package com.selenium.mukesh;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BootstrapDropdown {

	@Test
	public void BootstrapDD() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    JavascriptExecutor je = (JavascriptExecutor)driver;
	    
	    //Launch the application
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement element = driver.findElement(By.xpath("//button[@id='dropdownMenuButton']"));
		
		je.executeScript("arguments[0].scrollIntoView();", element);
		//je.executeScript("window.scrollBy(0,1200)");
		
		element.click();
		
		Thread.sleep(5000);
		
		List<WebElement> ddList = driver.findElements(By.xpath("(//div[@class='dropdown show']/div)[1]/a"));
		
		for(WebElement ele:ddList) {
			String str = ele.getText();
			if(str.equalsIgnoreCase("Another action")) {
				ele.click();
				break;
			}
		}
		
	}

}
