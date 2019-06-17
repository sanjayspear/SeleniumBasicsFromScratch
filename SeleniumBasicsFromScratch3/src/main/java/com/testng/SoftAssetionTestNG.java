package com.testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssetionTestNG {
	
	/*Soft Assert V/S Hard Assert in TestNG: 
		
		    hard assertion:
			hard validation: if a hard assertion is getting failed: immediately test case 
		    will me marked as failed and test case will be terminated.
		
		    soft assertion : 
			soft validation: if a soft assertion is getting failed: test case will 
		    not be marked as passed as well as next lines will be executed 
		
		
		+assertAll() : is used to mark the test case as failed, if any soft assertion is getting failed 
	*/
    SoftAssert softasset = new SoftAssert();
	
    @Test
	public void test1() {
		System.out.println("Open Browser");
		
		//Assert.assertEquals(false, true);
		
		System.out.println("User Name");
		System.out.println("Password");
		System.out.println("Click on sign in button");
		
		//Assert.assertEquals(false, true);
		
		System.out.println("Validate home page");
		softasset.assertEquals(false, true, "Home page title is missing");
		
		System.out.println("Go to deals page");
		System.out.println("Create a deal");
		softasset.assertEquals(false, true, "not able to create a deal");
		
		System.out.println("Go to contacts page");
		System.out.println("create contact");
		softasset.assertEquals(true, false, "not able to create contact");
		
		softasset.assertAll();
		
		
	}

}
