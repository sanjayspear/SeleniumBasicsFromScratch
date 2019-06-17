package com.seleniumPractice2;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotConcept {

	public static void main(String[] args) throws IOException {
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://www.google.com/");
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      //Waits until complete page will load. If page load less then 10 seconds then it ignores the rest
	      //of the waiting time.Hence, we call its as dynamic wait.
	      driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	      
	      //Waits for until each & every web elements will load.If page load less then 10 seconds then it ignores the rest
	      //of the waiting time.Hence, we call its as dynamic wait.
	      driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	      
	      File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      String address = "./ScreenShot/googleSnapShot.png";
	      
	      FileUtils.copyFile(src, new File(address));
	      
	      driver.quit();
	   
	      
	      
	}

	

}
