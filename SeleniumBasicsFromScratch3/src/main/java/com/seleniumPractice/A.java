package com.seleniumPractice;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       B b = new B();
       System.out.println("Enter your first girl friend name:");
       String girlName=sc.nextLine();
       b.setName(girlName);
       b.saying();
       

	}

}
