package com.seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		      System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		      WebDriver driver=new ChromeDriver();
		      driver.get("https://html.com/input-type-file/");
		      driver.manage().window().maximize();
		      driver.manage().deleteAllCookies();
		      /*driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Sanjay YM"
		      		+ "\\Desktop\\Selenium imp videos\\Naveen AutomationLabs\\xpath and css selector.txt");*/
		      
		      driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:/Users/Sanjay YM"
			      		+ "/Desktop/Selenium imp videos/Naveen AutomationLabs/xpath and css selector.txt");
		      
		      Thread.sleep(5000);
		      
		      driver.quit();
	}

}
