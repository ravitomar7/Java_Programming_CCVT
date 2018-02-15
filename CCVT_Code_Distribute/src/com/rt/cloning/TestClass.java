package com.rt.cloning;

public class TestClass {

	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
	Department d1=new Department(7, "HR");
	Employee e1=new Employee(1, "Ram",d1);
	Employee e2= e1.clone();
	

	
	System.out.println(e1);
	System.out.println(e2);
	e2.setEid(3);
	e2.setEname("Shyam");
	e2.getDep().setDid(8);
	e2.getDep().setDname("Acc");
	System.out.println(e1);
	System.out.println(e2);

	System.out.println(e1 instanceof Cloneable);

	}

}
