package com.seleniumPractice;

public class TernaryOperator {

	public static void main(String[] args) {
       int i=20, j=10, k=9;
       
       System.out.println(i > j ? (i > k ? i : k) : (j > k ? j : k));
    	  
	}

}
