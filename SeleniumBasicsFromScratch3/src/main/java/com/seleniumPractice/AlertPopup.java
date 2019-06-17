package com.seleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
	
     /*Note 1: If the pop up is part of your browser, such type of pop up is termed as java script pop up.
	           we can handle using Alert class alert() method.
	  Note 2: If the pop up is part of O.S, such type of pop up is termed as window based pop up. 
	 
	  Note 3: There is another type of pop up called window pop up.
	 */
	
	public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.rediff.com/");
      driver.manage().window().maximize();
      Thread.sleep(5000);
      driver.findElement(By.xpath("//a[text()='Sign in']")).click();
      Thread.sleep(5000);
      driver.findElement(By.xpath("//input[@type='submit']")).click();
      Thread.sleep(5000);
      //driver.switchTo().alert().accept();
      Alert alert = driver.switchTo().alert();
      String text = alert.getText();
      if(text.equals("Please enter a valid user name")){
    	  System.out.println("Correct alert message");
      }
      else
      {
    	  System.out.println("Invalid alert message");
      }
      alert.accept();//ok
      //alert.hashCode(); //cancel
      Thread.sleep(5000);
      driver.quit();

      

	}

}
