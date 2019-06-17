package com.seleniumPractice2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) {
      
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		
		WebElement day=driver.findElement(By.id("day"));
		Select oSelectDay=new Select(day);
		
		System.out.println(oSelectDay.getFirstSelectedOption().getText());
		oSelectDay.selectByVisibleText("9");
		System.out.println(oSelectDay.getFirstSelectedOption().getText());


		WebElement month=driver.findElement(By.id("month"));
		
		
		Select oSelectMonth=new Select(month);
		
		oSelectMonth.selectByIndex(1);
		oSelectMonth.selectByIndex(2);
		oSelectMonth.selectByIndex(3);
		oSelectMonth.selectByIndex(4);
		
		List<WebElement> allSelectedOptions = oSelectMonth.getAllSelectedOptions();
		
		System.out.println("All selected options are: ");
		
		for(WebElement element:allSelectedOptions) {
			System.out.println("You have selected :: "+element.getText());
		}
		
		System.out.println("Options under month dropdown are");
		
		List<WebElement> optionsMonth = oSelectMonth.getOptions();
		
		for(int i=0; i<optionsMonth.size(); i++) {
			String text=optionsMonth.get(i).getText();
			System.out.println(text);
		}
			
		WebElement year=driver.findElement(By.id("year"));
		Select oSelectYear=new Select(year);
		
		oSelectYear.selectByValue("2010");	
			
	}

}
