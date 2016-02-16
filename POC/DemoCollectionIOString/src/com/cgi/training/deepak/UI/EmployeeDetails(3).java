package com.cgi.training.deepak.UI;


public class EmployeeDetails {
private int id;
private String name,salary,designation;
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
public String getSalary() {
	return salary;
}
public void setSalary(String salary) {
	this.salary = salary;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "id: "+id+"Name: "+name+"Salary: "+salary+"Designation "+designation;
}

}
