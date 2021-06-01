package com.onebill.constructor;

class Geek0{

	
	public Geek0(String name) {
		super();
		// TODO Auto-generated constructor stub
	System.out.println(name);
	}
	public Geek0(String name,int id) {
		System.out.println(name+" "+id);
	}
	public Geek0(long l) {
		System.out.println(l);
		// TODO Auto-generated constructor stub
	}
	
}
public class WithDiffPara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Geek0 gk1 = new Geek0("mallika");
 Geek0 gk2 = new Geek0("linga",983);
 Geek0 gk3 = new Geek0(897l);
 
	}

}
