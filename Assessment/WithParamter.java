package com.onebill.constructor;

class Geek{
	int id;
	String name;
	public Geek(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
public class WithParamter {
	public static void main(String[] args) {
		
	Geek gk1 = new Geek(1007,"idris");
	Geek gk = new Geek(112,"hje");
	gk.id=124;
	gk.name="tom cruise";
	System.out.println(gk.id);
	System.out.println(gk.name);
	System.out.println(gk1.id+ " "+gk1.name);
	}

}
