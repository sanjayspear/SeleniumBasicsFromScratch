package com.handleIFrames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		//System.out.println("Total number of frames in the webpage are: "+driver.findElements(By.tagName("iframe")).size());
		
		Actions action = new Actions(driver);
		
		//driver.switchTo().frame(0); 
		//driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

		int xFrame = FrameUtil.goToFrame(driver, By.xpath("//div[@id='draggable']"), "iframe");
		driver.switchTo().frame(xFrame);

				
		WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dest = driver.findElement(By.xpath("//div[@id='droppable']"));
		
				
		//action.clickAndHold(src).moveToElement(dest).release().build().perform();
		
		action.dragAndDrop(src, dest).build().perform();
		driver.switchTo().defaultContent();
	}

}
