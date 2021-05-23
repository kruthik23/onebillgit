package com.onebill;

public class Dances {
	int price =40;
	String color ="black";
	public static void main(String args[]) {
		System.out.println("main starts");
		Dances d =new Dances();
		d.style();
		System.out.println("main ends");
		
	}
	void style() {
		System.out.println("dances" + " " +color + " "  + price);
	}

}
