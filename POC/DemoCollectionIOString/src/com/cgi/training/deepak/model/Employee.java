package com.cgi.training.deepak.model;

public class Employee {
private int id;
private String salary,designation,name;
@Override
public String toString() {
	// TODO Auto-generated method stub
	return id+name+designation+salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


}