package com.seleniumPractice;

public class LargestSmallest {

	public static void main(String[] args) {
       int a[] = new int[] {1, 2, 90, 30, 45, 78, 33, 101, 200};
       
       int min = a[0];
       int max = a[0];	
       
       for(int i = 1; i < a.length; i++) {
    	   if(a[i] > max) {
    		   max = a[i];
    	   }
    	   
    	   if(a[i] < min) {
    		   min = a[i];
    	   }
       }
       System.out.println("Largest Number in a given array is : " + max);
		System.out.println("Smallest Number in a given array is : " + min);
       }

}
