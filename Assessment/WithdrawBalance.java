package com.onebill.constructor;

public class WithdrawBalance {
	static void withdraw(double acc,double draw) {
		if(acc>draw)
			{acc=acc-draw;
			System.out.println("draw successfull:"+ acc);
			}else { 
				System.out.println("insufficeint:"+acc);
	}
	}
	public static void main(String[] args) {
		 double acc = 737326;
		 double draw=33552;
		withdraw(737326,33552);
		
		
	}

}
