package com.seleniumPractice;

import java.util.Scanner;

public class ToCountTotalNumberOfUpperAndLoweCaseInString2 {

	public static void main(String[] args) {
		
		System.out.println("Enter any word with the combination of uppper & lower case & special character");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		char c[] = text.toCharArray();
		
		int count1=0, count2=0, count3=0;
		
		for(char x : c) {
			if(Character.isUpperCase(x)) {
				count1++;
			}
			else if(Character.isLowerCase(x)){
				count2++;
			}
			else
			{
				count3++;
			}
		}
		
		System.out.println("The Given String Contins "+count1+" Upper Case letters & "+count2+" Lower case letters & "+count3+" Special characters");
		
	}

}
