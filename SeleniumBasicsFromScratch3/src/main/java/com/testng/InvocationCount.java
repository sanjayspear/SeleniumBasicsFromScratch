package com.testng;

import org.testng.annotations.*;

public class InvocationCount {
   
	//Below test will run 10 times
	@Test(invocationCount=10)
	public void sum() {
		int i=10, j=20, sum;
		sum=i+j;
		System.out.println(sum); 
	}
}
