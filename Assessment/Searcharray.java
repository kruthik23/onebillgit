package com.onebill.array;

import java.util.Scanner;

public class Searcharray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5];
		boolean numfound=false;
	    a[0] =1;
	    a[1]=2;
	    a[2]=3;
	    a[3]=4;
	    a[4]=5;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter num");
	    int num =sc.nextInt();
	    for(int i =0; i<=a.length;i++) {
	    	if(a[i]==num) { 
	    		numfound=true;
	    		break;
	    	}
	    } if(numfound==true) {
	    		System.out.println("number found");
	    } else
	    	System.out.println("not found");
	    		
		

	}

}
