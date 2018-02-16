package com.rt.cloning;
//Employee Class Changes done from diff acc now
public class Employee implements Cloneable{
	
	int eid;
	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Department getDep() {
		return dep;
	}
	public void setDep(Department dep) {
		this.dep = dep;
	}
	String ename;
	Department dep;
	public Employee(int eid, String ename, Department dep) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.dep = dep;
	}
	public Employee(Employee e1) {
		this.eid=e1.eid;
		this.ename=e1.ename;
		this.dep=new Department(e1.dep);
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee id: "+eid+" Employee Name: "+ename+" Dep Name:"+dep.getDname()+" Dep Id:"+dep.getDid();
	}
	
	@Override
	protected Employee clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Employee temp=(Employee)super.clone();
				temp.setDep(this.getDep().clone());
				
//				temp.dep=this.dep.clone();
		
		return temp;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Employee temp=(Employee) obj;
		if(this.getEid()==temp.getEid())
			return true;
		else 
			return false;
		
//		return super.equals(obj);
	}
	
	

}
