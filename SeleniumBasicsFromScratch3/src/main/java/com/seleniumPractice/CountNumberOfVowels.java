package com.seleniumPractice;

import java.util.Scanner;

public class CountNumberOfVowels {

	public static void main(String[] args) {
		System.out.println("Enter Some String");
        Scanner sc=new Scanner(System.in);
        String ch=sc.nextLine();
        char []character = ch.toCharArray();

        int count=0;
        
        for(char c : character) {
        	
        	switch(c) {
        	case 'a':
        	case 'e':
        	case 'i':
        	case 'o':
        	case 'u':
        	case 'A':
        	case 'E':
        	case 'I':
        	case 'O':
        	case 'U':
        		count++;
        		break;
        	}
        }
        System.out.println("The text "+ch+" "+"Contains total "+count+" Vowels");
        
	}

}
