package com.onebill.constructor;
 class Base{
	 String name;
	 Base(){
		 this("");
		 System.out.println("no arg base");
	 }
	public Base(String name) {
		
		this.name = name;
		System.out.println("arg with base");
	}
	 
 }
public class usingSuperCons extends Base {

	usingSuperCons(){
		
		System.out.println("non para without base");
	}
	
	
	public usingSuperCons(String name) {
		super(name);
		System.out.println("arg without base");
		// TODO Auto-generated constructor stub
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		usingSuperCons u  = new usingSuperCons("abhishek");
		usingSuperCons u1 = new usingSuperCons();
	}

}
