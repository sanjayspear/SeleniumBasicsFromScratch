package com.seleniumPractice;

public class ToFindLargestAndSmallestValueInArray {

	public static void main(String[] args) {
       int num[] = new int[] {1,1, 2, 3, 4, 5, 6};
       
       
       int smallest=Integer.MAX_VALUE;
       int largest=Integer.MIN_VALUE;
       
       //System.out.println(largest); //2147483647
       //System.out.println(smallest); //-2147483648
       
       for(int number : num) {
    	   if(number > largest) {
    		  largest = number; 
    	   }
       }
       
       for(int number : num) {
    	   if(number < smallest) {
    		  smallest = number; 
    	   }
       }
       
       System.out.println("Largest number is "+largest+" & "+" Smallest number is "+smallest);

	}

}
