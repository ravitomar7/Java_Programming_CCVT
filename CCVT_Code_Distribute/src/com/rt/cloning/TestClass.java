package com.rt.cloning;

public class TestClass {
//changes done
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
//	e2.setEid(3);
	e2.setEname("Shyam");
	e2.getDep().setDid(8);
	e2.getDep().setDname("Acc");
	System.out.println(e1);
	System.out.println(e2);
//new Employee().getEid();
	System.out.println(e1 instanceof Cloneable);
	System.out.println(e1.clone()!=e1);
	System.out.println(e2.getClass()==e1.getClass());
	System.out.println(e1.equals(e2));
	}

}
