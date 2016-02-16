package com.deepak.comparatorcomparable;

public class EmployeeDetails {
private String name;
private String id;
private int deptno;
private int salary;
public EmployeeDetails(String name, String id, int deptno, int salary) {
	super();
	this.name = name;
	this.id = id;
	this.deptno = deptno;
	this.salary = salary;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public int getDeptno() {
	return deptno;
}
public void setDeptno(int deptno) {
	this.deptno = deptno;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
}
