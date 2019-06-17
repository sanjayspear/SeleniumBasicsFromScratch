package com.testng;

import org.testng.annotations.*;

public class ExceptionTimeOutTest {

	@Test(expectedExceptions=NumberFormatException.class)
	public void registrationPage() {
		
		String x = "100A";
		Integer.parseInt(x);
	}
	
}
