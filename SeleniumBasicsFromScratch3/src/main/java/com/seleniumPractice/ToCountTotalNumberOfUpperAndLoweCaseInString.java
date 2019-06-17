package com.seleniumPractice;

import java.util.Scanner;

public class ToCountTotalNumberOfUpperAndLoweCaseInString {

	public static void main(String[] args) {
       System.out.println("Enter any string with the conmbination of upper and lowe case letters");
       
       Scanner sc=new Scanner(System.in);
       String text=sc.nextLine();
       char charater[] = text.toCharArray();
       
       int count1=0, count2=0, count3=0;
       
       for(int x : charater) {
    	   
    	   switch(x) {
    	    case 'A':
    	    case 'B':
    	    case 'C':
    	    case 'D':
    	    case 'E':
    	    case 'F':
    	    case 'G':
    	    case 'H':
    	    case 'I':
    	    case 'J':
    	    case 'K':
    	    case 'L':
    	    case 'M':
    	    case 'N':
    	    case 'O':
    	    case 'P':
    	    case 'Q':
    	    case 'R':
    	    case 'S':
    	    case 'T':
    	    case 'U':
    	    case 'V':
    	    case 'W':
    	    case 'X':
    	    case 'Y':
    	    case 'Z':
    	    	count1++;
    	    break;
    	   }
       }
       
for(int x : charater) {
    	   
    	   switch(x) {
    	    case 'a':
    	    case 'b':
    	    case 'c':
    	    case 'd':
    	    case 'e':
    	    case 'f':
    	    case 'g':
    	    case 'h':
    	    case 'i':
    	    case 'j':
    	    case 'k':
    	    case 'l':
    	    case 'm':
    	    case 'n':
    	    case 'o':
    	    case 'p':
    	    case 'q':
    	    case 'r':
    	    case 's':
    	    case 't':
    	    case 'u':
    	    case 'v':
    	    case 'w':
    	    case 'x':
    	    case 'y':
    	    case 'z':
    	    	count2++;
    	    break;
    	   }
       }

for(int x : charater) {
	   
	   switch(x) {
	    case '!':
	    case '@':
	    case '#':
	    case '$':
	    case '%':
	    case '^':
	    case '&':
	    case '*':
	    case '(':
	    case ')':
	    case '_':
	    case '<':
	    case '>':
	    case '{':
	    case '}':
	    case '-':
	    case '+':
	    case '=':
	    case '[':
	    case ']':
	    case ':':
	    case ';':
	    case '"':
	    case '?':
	    case '/':
	    	count3++;
	    break;
	   }
}


       System.out.println("The given String contains "+count1+" upper case letters "+" & "+count2+" lower case letters"+" & "+count3+" special characters");
	}

}
