package com.testng;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utility.TestUtil;

public class HalfEbayTest {

WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		   System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	       driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	       driver.manage().deleteAllCookies();
	       driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");
	}
	
	@DataProvider
	public Iterator<Object[]> getTestData() {
		ArrayList<Object[]> testData = TestUtil.getTestDataFromExcel();
		return testData.iterator();
	}
	
	@Test(dataProvider="getTestData", priority=1) 
	public void halfEbayRegTest(String Firstname, String Lastname, String Email, String Password){
		driver.findElement(By.xpath("//input[@name='firstname']")).clear();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(Firstname);
		
		driver.findElement(By.xpath("//input[@name='lastname']")).clear();
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(Lastname);
		
		driver.findElement(By.xpath("//input[@name='email']")).clear();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Email);
		
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).clear();
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys(Password);
	}
	
	
	@AfterMethod
	public void tesarDown() {
		driver.quit();
	}
	
	
}
