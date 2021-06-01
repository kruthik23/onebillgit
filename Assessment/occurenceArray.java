package com.onebill.array;

import java.util.Scanner;

public class occurenceArray {

	public static void main(String[] args) {
		
		
		int[] abc= {1,2,23,3,3};
		int count =0;
		int num;
		Scanner sc = new Scanner(System.in);
	System.out.println("enter");
		num=sc.nextInt();
		for(int i =0;i<=4;i++) 
		{
			
				if(abc[i]==num) {
					count++;
				}
			
			if(count>0) {
				System.out.println(count +":times");
			}else 
				System.out.println("not found");
		}
	
	}

}
