package com.seleniumPractice;

public class BitwiseOperator {

	public static void main(String[] args) {
		// As we know in java every will be stored in the form of 1's and 0's
		int i = 25; // 1 1 0 0 1
		int j = 25; // 1 1 1 1 0
		
		System.out.println(i>30 && j>40); // 24
		System.out.println(i>30 || j<30); // 31
	}

}
