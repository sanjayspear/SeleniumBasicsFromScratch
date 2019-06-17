package com.testng;

import org.testng.annotations.*;

public class dependsOnMethods {

	@Test(priority=1)
	public void loginTest() {
		System.out.println("Login to facebook");
		int i = 100/0;
	}
	
	@Test(priority=2, dependsOnMethods="loginTest")
	public void homePageTest() {
		System.out.println("Go to home page");
	}
	
	@Test(priority=3, dependsOnMethods="homePageTest")
	public void updateProfie() {
		System.out.println("Search your profile");
	}
	
	@Test(priority=4, dependsOnMethods="homePageTest")
	public void searchFriends() {
		System.out.println("Search friends");
	}
	
}
