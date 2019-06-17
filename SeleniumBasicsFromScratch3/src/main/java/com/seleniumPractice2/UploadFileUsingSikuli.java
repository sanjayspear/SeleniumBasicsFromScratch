package com.seleniumPractice2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class UploadFileUsingSikuli {

	public static void main(String[] args) throws FindFailed, InterruptedException {
		   System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://www.gmail.com");
	       driver.manage().window().maximize();
	       //driver.manage().deleteAllCookies();
	       driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	       driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	       
	       driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sanjayspear@gmail.com");
	       driver.findElement(By.xpath("//span[text()='Next']")).click();
	       WebElement locator = driver.findElement(By.xpath("//input[@aria-label='Enter your password']"));
	       
	       EnterInto(driver, locator, 10);
	       
	       
	       Screen s = new Screen();
	           
	       driver.findElement(By.xpath("//span[text()='Next']")).click();
	       driver.findElement(By.xpath("//div[text()='Compose']")).click();
	       
	       Pattern GM_Link = new Pattern("./target/GM_Attach_Link.PNG");
	       s.wait(GM_Link, 3000);
	       s.click();
	       
	       Thread.sleep(3000);
	       
	       Pattern GM_File_Name = new Pattern("./target/GM_File_Name.PNG");
	       s.wait(GM_File_Name, 3000);
	       s.type(GM_File_Name, "G:\\Tutorials\\Anil_3.10 yrs_Automation.docx");
	       
	       Thread.sleep(3000);
	       
	       Pattern GM_Open_Btn = new Pattern("./target/GM_Open.PNG");
	       s.wait(GM_Open_Btn, 3000);
	       s.click();
	       
	       driver.findElement(By.xpath("//div[text()='Recipients']")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("vkg041991@gmail.com");     
	       driver.findElement(By.xpath("//div[@role='button' and @class='T-I J-J5-Ji aoO T-I-atl L3']")).click();
	       driver.switchTo().alert().accept();
	       driver.findElement(By.xpath("//a[contains(@aria-label, 'Sanjay Ym')]")).click();
	       driver.findElement(By.xpath("//a[text()='Sign out']")).click();
	       Thread.sleep(8000);
	       driver.switchTo().alert().accept();
	       tearDown(driver);
	       
	}
	
	public static void EnterInto(WebDriver driver, WebElement locator, int timeout) {
  	  
  	  new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class)
  	  .until(ExpectedConditions.visibilityOf(locator));
  	  locator.sendKeys("Sanjay92#@!");
    }
	
	public static void tearDown(WebDriver driver) {
		driver.quit();
	}
	

}
