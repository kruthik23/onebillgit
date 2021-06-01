package com.onebill.constructor;

class Employees{
	private int id;
	private String name;
	private double salary;
	public Employees(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
public class GetterSetter {

	public static void main(String[] args) {
		Employees e = new Employees(332,"rahul",4444);
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getSalary());
		System.out.println("object");
		e.setId(234);
		e.setName("hdgd");
		e.setSalary(9004);
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getSalary());
		
	}

}
