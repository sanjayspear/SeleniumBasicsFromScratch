package com.seleniumPractice2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextArea {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://team-scale.com/testo/references/inventory/");
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      
	      ArrayList<String> list = new ArrayList<String>();
	      ArrayList<String> list1 = new ArrayList<String>();


	      int n=0; 
	      List<WebElement> ele = driver.findElements(By.xpath("//span[@class='price']"));
	      for(int i=0; i<ele.size(); i++)
	      {
	     list.add(ele.get(i).getText());
	      }
	      
	      for(String x:list)
	      {
	     n=Integer.parseInt(x);
	     if(n>50)
	     {
	     list1.add(Integer.toString(n));
	     }
	      }
	      
	      for(int j=0; j<ele.size(); j++)
	      {
	     for(int p=0; p<list1.size(); p++)
	          {
	        if(ele.get(j).getText().equals(list1.get(p))) 
	        {
	        String val = list1.get(p);
	        int g = Integer.parseInt(val);
	        String stock = driver.findElement(By.xpath("(//span[text()='"+g+"']/ancestor::div/span)[1]")).getText();
	        driver.findElement(By.xpath("//textarea[@id='answer']")).sendKeys(stock+", ");
	        }
	          }     
	      }
	}

}
