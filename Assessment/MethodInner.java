package com.onebill.ppt;

public class MethodInner {
  
			 private int data=30;  
			 class Inner{  
			  void msg(){System.out.println("data is "+data);}  
			 }  
			 public static void main(String args[]){  
			  MethodInner obj=new MethodInner();  
			  MethodInner.Inner in=obj.new Inner();  
			  in.msg();  
			 }  
			
	

}
