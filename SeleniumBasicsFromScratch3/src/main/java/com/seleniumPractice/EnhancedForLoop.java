package com.seleniumPractice;

public class EnhancedForLoop {

	public static void main(String[] args) {
      int num[]= {1,2,3,4,5,6,7,8,9,10,7,8,5,43,88};
      int sum=0;
      
      for(int x : num) {
    	  System.out.println(x);
      }
      
      System.out.println("-------------------------");
      
      for(int x : num) {
    	  sum+=x;
      }
      System.out.println("Total Sum Is : "+sum);
      System.out.println("-------------------------");
	}

}
