package com.onebill;

import java.util.Scanner;

class BoxVolume{
	int length;
	int breadth;
	int width;
	double vol;
	int radius;
	
	
	BoxVolume(){
		this.length=0;
		this.breadth=0;
		this.height=0;
		this.radius=0;
		this.vol=0;
	}
	BoxVolume(int length, int breadth,int height ){
		this.length=length;
		this.breadth=breadth;
		this.height=height;
		this.vol=calc(this.length,this.breadth,this.height);
		
	}
	 BoxVolume(int radius){
		 this();
		 this.radius=radius;
		 this.vol=calc(this.radius);
	 }
	double calc(int length,int breadth,int height) {
		return length*breadth*height;
	}
	double calc(int radius) {
		return 4/3*3.14*radius;
	}
 }

 public class Box{
	public static void main(String args[]) {
	
	Scanner sc =new Scanner(System.in);
	System.out.println("enter length:");
	int length= sc.nextInt();
	System.out.println("enter breadth:");
	int breadth = sc.nextInt();
	System.out.println("enter height:");
	int height =sc.nextInt();
	BoxVolume v =new BoxVolume(length,breadth,height);
	System.out.println("enter radius:");
	int radius = sc.nextInt();
	BoxVolume b=new BoxVolume(radius);
	
	
	}

}
