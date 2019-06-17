package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGGroups {

	//Preconditions annotations : starting with @Before
		@BeforeSuite
	    public void setUp() {
	    	System.out.println("Setup system property for chrome");
	    }
		
		@BeforeTest
		public void launchBrowser() {
			System.out.println("Launch chrome browser");
		}
		
		@BeforeClass
		public void login() {
			System.out.println("Login to app");
		}
		
		@BeforeMethod
		public void enterURL() {
			System.out.println("enter URL");
		}
		
		//Test cases starting with @Test
		@Test(priority=1, groups="Title")
		public void googleTitleTest() {
			System.out.println("Google Title Test");
		}
		@Test(priority=2, groups="Search")
		public void searchTest1() {
			System.out.println("Search Test");
		}
		
		@Test(priority=6, groups="Search")
		public void searchTest2() {
			System.out.println("Search Test");
		}
		
		@Test(priority=3, groups="logo")
		public void logoTest1() {
			System.out.println("google logo Test");
		}
		@Test(priority=4, groups="logo")
		public void logoTest2() {
			System.out.println("google logo Test");
		}
		@Test(priority=5, groups="logo")
		public void logoTest3() {
			System.out.println("google logo Test");
		}
		@Test(priority=7, groups="logo")
		public void logoTest4() {
			System.out.println("google logo Test");
		}
		
		/*
		 * Test Execution Sequence is not fixed may same or change each test executuion
		 * 
		 * @BeforeMethod
		 * @Test -2
		 * @AfterMethod
		 * 
		 * @BeforeMethod
		 * @Test -1
		 * @AfterMethod
		 * 
		 * @BeforeMethod
		 * @Test -3
		 * @AfterMethod
		 *  
		 */
		
		//Post conditions -starting with @After
		@AfterMethod
		public void logout() {
			System.out.println("Logout from app");
		}
		
		@AfterTest
		public void deleteAllCookies() {
			System.out.println("delete all cookies");
		}
		
		@AfterClass
		public void closeBrowser() {
			System.out.println("Close browser");
		}
		
	
}
