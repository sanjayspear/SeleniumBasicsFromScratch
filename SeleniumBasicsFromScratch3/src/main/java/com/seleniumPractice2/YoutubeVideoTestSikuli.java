package com.seleniumPractice2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class YoutubeVideoTestSikuli {

	public static void main(String[] args) throws Exception {
		   System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://www.youtube.com/watch?v=5jJaoqGfxhI");
	       driver.manage().window().maximize();
	       driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	       driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	       
	       Screen s = new Screen();
	           
	       Pattern MaximizeImg = new Pattern("./target/TY_Max_Screen.PNG");
	       s.wait(MaximizeImg, 3000);
	       s.click();
	       s.click();
	              
	       Pattern pauseImg = new Pattern("./target/YT_Pause_Btn.PNG");
	       s.wait(pauseImg, 2000);
	       s.click();
	       
	       Pattern playImg = new Pattern("./target/YT_Play_Btn.PNG");
	       s.wait(playImg, 2000);
	       s.click();
	       
	       Pattern MuteImg = new Pattern("./target/YT_Mute_Btn.PNG");
	       s.wait(MuteImg, 2000);
	       s.click();
	       
	       Pattern UnMuteImg = new Pattern("./target/YT_UnMute_Btn.PNG");
	       s.wait(UnMuteImg, 2000);
	       s.click();
	       
	              
	}

}
