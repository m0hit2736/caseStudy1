package com.SpringCore;

public class Employee {//beans class or pojo class

	private int empid;
	private String empname;
	private int empsal;
	private String empadd;
	
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) { //100
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {//sathya
		this.empname = empname;
	}
	public int getEmpsal() {
		return empsal;
	}
	public void setEmpsal(int empsal) { //1000
		this.empsal = empsal;
	}
	public String getEmpadd() {
		return empadd;
	}
	public void setEmpadd(String empadd) { //hyd
		this.empadd = empadd;
	}
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String empname, int empsal, String empadd) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
		this.empadd = empadd;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsal=" + empsal + ", empadd=" + empadd + "]";
	}
	
}
