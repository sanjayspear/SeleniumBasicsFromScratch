package com.seleniumPractice2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectCalendarSpiceJet {

	public static void main(String[] args) {
		   System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://www.spicejet.com/");
	       driver.manage().window().maximize();
	       driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	       
	       driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]")).click();
	       DatePicker(driver,  "26", "June");	  	   
		 }
	
	   public static void DatePicker(WebDriver driver, String Date, String Month) {
		
		for(int i=0;i<12;i++) {
      		try {
      			//It identify calendar month
      			 driver.findElement(By.xpath("//span[text()='"+Month+"']"));
      			 
      			 //It identify corresponding date of the month then click on that
      			 driver.findElement(By.xpath("//span[text()='"+Month+"']"
      			 		+ "/ancestor::div[2]/following-sibling::table/descendant::td/a[text()='"+Date+"']")).click();
      			 break;
      		}
      		
      		catch(Exception e){
      			driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']"
      					+ "/descendant::span[1]")).click();
      		}
      		finally
      		{
      			System.out.println("In valid month parameter please enter correct month");
      		}
      	}   	
	   }
	
	
	
	
	
	

 }

