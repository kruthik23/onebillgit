package com.onebill.ppt;

public class MethodLocalInnerClass {
  int num =20;
  public void demo() {
	  class InnerClass{
		  public void display() {
			  System.out.println("this is inner class");
		  }
	  }
	  InnerClass inClass =new InnerClass();
	  inClass.display();
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodLocalInnerClass m = new MethodLocalInnerClass();
		m.demo();

	}

}
