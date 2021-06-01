package com.onebill.constructor;
class  Samples1{
	int x;
	Samples1(int x){
		this.x=x;
		System.out.println("samples1");
	}
}
class Samples2 extends Samples1{
	double y;
	Samples2(double y,int x){
		super(x);
		System.out.println("samples2");
		this.y=y;
	}
}
public class ExplicitCallConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Samples2 ss = new Samples2(88,9);
System.out.println(ss.x);
System.out.println(ss.y);
	}

}
