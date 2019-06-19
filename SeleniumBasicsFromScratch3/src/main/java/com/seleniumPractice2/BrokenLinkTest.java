package com.seleniumPractice2;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*For checking the broken links, you will need to do the following steps.

1. Collect all the links in the web page based on "a" and "img" tags.
2. Send HTTP request for the link and read HTTP response code.
3. Find out whether the link is valid or broken based on HTTP response code.
4. Repeat this for all the links captured.

*/
public class BrokenLinkTest {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
				
		//1. Get the list of all the links and images
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		linkList.addAll(driver.findElements(By.tagName("img")));
		
		//Get the size of both active and inactive links
		System.out.println("Count of all the links including active and inactive links ===> "+linkList.size());
		
		List<WebElement> activeLinks = new ArrayList<WebElement>();
		
		//2. iterate linkList : exclude all the links/images - which doesn't have any href attribute
		
        for(int i=0; i<linkList.size(); i++)
        {
        	if(linkList.get(i).getAttribute("href")!=null && (!linkList.get(i).getAttribute("href").contains("javascript")))
        	{
        		activeLinks.add(linkList.get(i));
        	}
        }
        
        //Get the size of active links only
		System.out.println("Count of only active links ===> "+activeLinks.size());
		
		//3. Check the href url, with http connection api
		
		//200 -- ok
		//404 -- not found
		//500 -- internal error
		//400 -- bad request
		
		for(int j=0; j<activeLinks.size(); j++)
		{
			HttpURLConnection connection = (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href")).openConnection();
			
			connection.connect();
			String response = connection.getResponseMessage();
			connection.disconnect();
			System.out.println("no. "+j+" --> "+activeLinks.get(j).getAttribute("href") +"=====>"+response);
		}
		

	}

}
