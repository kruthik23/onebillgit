package com.onebill.constructor;

import java.util.Scanner;

class Student{
	String name;
	long phoneno;
	
	Student(String name){
		this.name=name;
	}
	Student(String n,long p){
		this.name=name;
		this.phoneno=phoneno;
	}
	void details() {
		System.out.println("enter name:"+this.name);
		System.out.println("enter phoneno:"+this.phoneno);
	}
	
}
public class StudentInfo {

	public static void main(String[] args) {
	
		char c;
		Scanner sc = new Scanner(System.in);
				c=sc.next().charAt(0);
				System.out.println("type y or n");
				if(c=='y') {
					System.out.println("enter name");
					String stname=sc.next();
					System.out.println("enter phoneno:");
					long  stphone=sc.nextLong();
				Student s =new Student(String stname, long stphone);
				s.details();
					
				}else {
					System.out.println("enter name");
					String stname=sc.next();
				Student s1=new Student(String stname);
				s1.details();
				}
		
	}

}
