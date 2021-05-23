package com.onebill;

public class TruthTable {
public static void main(String[] args) {
	boolean a,b;
	System.out.println("A\t B\t AND\t OR \t NOT ");
	a=true; b=true;
	System.out.println(a+"\t"+b+"\t"+(a&b)+"\t"+(a|b)+"\t"+(a^b));
	a=true; b=false;
	System.out.println(a+"\t"+b+"\t"+(a&b)+"\t"+(a|b)+"\t"+(a^b));
	a=false; b=true;
	System.out.println(a+"\t"+b+"\t"+(a&b)+"\t"+(a|b)+"\t"+(a^b));
	a=false ; b=false;
	System.out.println(a+"\t"+b+"\t"+(a&b)+"\t"+(a|b)+"\t"+(a^b));
}
}
