package com.deepak.comparatorcomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {
public static void main(String[] args) {
	Employee emp1=new Employee("EMP10",10);
	Employee emp2=new Employee("EMP30",30);
	Employee emp3=new Employee("EMP20",20);
	
	EmployeeDetails empd1=new EmployeeDetails("Deepak", "EMP10", 10, 50000);
	EmployeeDetails empd2=new EmployeeDetails("Akash", "EMP30", 30, 75000);
	EmployeeDetails empd3=new EmployeeDetails("Chandu", "EMP20", 20, 80000);
	
	List<Employee> list1=new ArrayList<Employee>();
	List<EmployeeDetails> list2=new ArrayList<EmployeeDetails>();
	//adding to employee list
	list1.add(emp1);list1.add(emp2);list1.add(emp3);
	//adding to employeeDetails list
	list2.add(empd1);list2.add(empd2);list2.add(empd3);
	
	Collections.sort(list1);
	System.out.println(list1);
}
}
