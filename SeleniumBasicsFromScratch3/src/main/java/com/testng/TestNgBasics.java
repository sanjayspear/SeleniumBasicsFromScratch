package com.testng;

import org.testng.annotations.*;

public class TestNgBasics {
	
	/*Setup system property for chrome
Launch chrome browser
Login to app
enter URL
Google Title Test
Logout from app
enter URL
google logo Test
Logout from app
enter URL
Search Test
Logout from app
Close browser
delete all cookies
	
===============================================
    Default test
    Tests run: 2, Failures: 0, Skips: 0
===============================================
	
	*/

	
	
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
	@Test
	public void googleTitleTest() {
		System.out.println("Google Title Test");
	}
	@Test
	public void searchTest() {
		System.out.println("Search Test");
	}
	
	@Test
	public void logoTest() {
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
