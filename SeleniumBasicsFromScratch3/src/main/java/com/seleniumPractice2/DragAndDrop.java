package com.seleniumPractice2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://jqueryui.com/droppable/");
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	      driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	      
	      driver.switchTo().frame(0);
	      
	      Actions actions = new Actions(driver);
	      actions.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']//p[text()='Drag me to my target']")))
	      .moveToElement(driver.findElement(By.xpath("//div[@id='droppable']//p[text()='Drop here']")))
	      .release().build().perform();
	      
     
	     // driver.quit();
	}

}
