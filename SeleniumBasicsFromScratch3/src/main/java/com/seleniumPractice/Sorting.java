package com.seleniumPractice;

public class Sorting {

	public static void main(String[] args) {
        int i[] = new int[] {5, 6, 1, 4, 2, 3};
        int temp=0;
        for(int x=0; x<i.length; x++) {
        	
        	int flag=0;
        	for(int y=0; y<i.length-1-x; y++) {
        		if(i[y]>i[y+1]) {
        			temp=i[y];
        			i[y]=i[y+1];
        			i[y+1]=temp;
        			flag=1;
        		}
        	}
        	if(flag==0) {
        		break;
        	}
        }
        
        for(int x=0; x<i.length; x++) {
        	System.out.print(i[x]+" ");
        }
	}

}
