package com.rt.exceptionexamples;

public class Employee {
	
	
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee Id"+id+" Employee Name:"+name;
	}
	
	

}
