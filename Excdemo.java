package com.onebill.exceptionhandling;

public class Excdemo {

	public static void main(String[] args) {
		int[] i = new int[3];
		try {
			//before exception
			System.out.println("hi");
			i[4] = 5;
			System.out.println("Hello");
		}
		catch (Exception e) {
			System.out.println("Oops! Index Out of Bound error occured!");
		}
	}

}