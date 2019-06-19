package com.handleIFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FrameUtil {

	public static int goToFrame(WebDriver driver1, By by, String frame) 
	{		
		int i;
		
		int num=-1;
		
		int frameCount = driver1.findElements(By.tagName(frame)).size();
		System.err.println("Total number of frames in "+driver1.getTitle()+" are : "+frameCount);
		
		for(i=0; i<frameCount; i++)
		{
			driver1.switchTo().defaultContent();
			
			driver1.switchTo().frame(i);
			
			int count=driver1.findElements(by).size();
			
			if(count > 0)
			{
				num=i;
				break;
			}	
		}
		driver1.switchTo().defaultContent();
		
		return num;
	}
}
