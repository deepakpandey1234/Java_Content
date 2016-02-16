package com.cgi.training.deepak.service;

import java.util.ArrayList;

import com.cgi.training.deepak.DAO.EmployeeDAO;
import com.cgi.training.deepak.UI.EmployeeDetails;
import com.cgi.training.deepak.model.Employee;

public class EmployeeService {
	ArrayList<Employee> list1;
	ArrayList<Employee> list2;
	ArrayList<EmployeeDetails> list3=new ArrayList<EmployeeDetails>();
	Employee emp;
	EmployeeDAO empDAO;
	EmployeeDetails employeeDetails=null;
	String str=null;
	
	public ArrayList<EmployeeDetails> getEmployeeInfo(){
		empDAO=new EmployeeDAO();
		list1=new ArrayList<Employee>();
		list2=new ArrayList<Employee>();
		list1=empDAO.getEmployeeInfo();
		list2=empDAO.getEmployeeSalary();
		for(Employee emp:list1){
			employeeDetails=new EmployeeDetails();
			employeeDetails.setId(emp.getId());	
			employeeDetails.setName(emp.getName());
			employeeDetails.setDesignation(emp.getDesignation());
			employeeDetails.setSalary(getSalary(emp.getId()));
			list3.add(employeeDetails);
		}	
		return list3;
	}

	private String getSalary(int i) {
		for(Employee e:list2)
		{
			str=e.getSalary();
		}
		return str;
	}
}
