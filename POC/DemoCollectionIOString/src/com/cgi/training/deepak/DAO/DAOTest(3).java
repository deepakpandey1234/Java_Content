package com.cgi.training.deepak.DAO;

import java.util.ArrayList;
import java.util.List;

import com.cgi.training.deepak.model.Employee;

public class DAOTest {
public static void main(String[] args) {
	EmployeeDAO employeeDAO=new EmployeeDAO();
	//ArrayList<Employee> info=employeeDAO.getEmployeeInfo();
	ArrayList<Employee> salary=employeeDAO.getEmployeeSalary();
	System.out.println(salary);
	//System.out.println(info);
}
}
