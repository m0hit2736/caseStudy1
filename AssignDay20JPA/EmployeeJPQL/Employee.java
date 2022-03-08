package com.empJPQL;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empJPQL")
public class Employee {
	@Id
	private int empid;
	@Column(length=15)
	private String empname;
	private int empsal;
	@Column(length=15)
	private String empAdd;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpsal() {
		return empsal;
	}
	public void setEmpsal(int empsal) {
		this.empsal = empsal;
	}
	public String getEmpAdd() {
		return empAdd;
	}
	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsal=" + empsal + ", empAdd=" + empAdd + "]";
	}
	public Employee(int empid, String empname, int empsal, String empAdd) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
		this.empAdd = empAdd;
	}
}
