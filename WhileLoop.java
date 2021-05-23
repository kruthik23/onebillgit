package com.onebill;

public class WhileLoop {
	public static void main(String args[]) {
		int power =3 ,base=-3 ,result =1;
		while(power!=0) {
			result=result*base;
			power--;
			
		}
		System.out.println(result);
	}

}
