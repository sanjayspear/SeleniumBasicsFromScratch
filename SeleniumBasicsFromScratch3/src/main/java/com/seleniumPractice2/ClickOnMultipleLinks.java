package com.seleniumPractice2;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnMultipleLinks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("http://www.qaclickacademy.com/practice.php#");
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	      driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	      
	      //driver.findElement(By.xpath("//a[text()='REST API']")).click();
	      
	      WebElement footerdriver=driver.findElement(By.xpath("//div[@id='gf-BIG']/descendant::tr"));
	      int footerLinkCount=footerdriver.findElements(By.tagName("a")).size();
	      System.out.println("Total number links at footer section are :"+footerLinkCount);
	      
	      List<WebElement> ele=footerdriver.findElements(By.tagName("a"));
	      int i;
	      for(i=1; i<footerLinkCount; i++) {
	    	  String clickTabLink=Keys.chord(Keys.CONTROL, Keys.ENTER);
	    	  ele.get(i).sendKeys(clickTabLink);  
	    	  Thread.sleep(5000L);
	      }
	      
	    //1st move to each and every tab and get the title
	    	 Set<String> childids= driver.getWindowHandles();
	    	 Iterator<String> iterator = childids.iterator();
	    	 
	    	 while(iterator.hasNext()) {
	    		{
	    		  driver.switchTo().window(iterator.next());
	   	    	  System.out.println("[TAB] "+i+" Title is ====> "+driver.getTitle());
	    		}
	    	 }
	}

}
