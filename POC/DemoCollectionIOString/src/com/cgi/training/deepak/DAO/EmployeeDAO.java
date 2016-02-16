package com.cgi.training.deepak.DAO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import com.cgi.training.deepak.model.Employee;

public class EmployeeDAO {
	BufferedReader br = null;
	String temp;
	public ArrayList<Employee> getEmployeeInfo(){
		try{
			String str=null;
			ArrayList<Employee> listEmp=new ArrayList<Employee>();			
			Employee employee=null;				
			br=new BufferedReader(new FileReader("D:\\Java\\POC\\DemoCollectionIOString\\src\\employeeInfo.txt"));
			while((str=br.readLine())!=null)
			{
				employee=new Employee();
				String[] temp=str.split(",");
				employee.setId(Integer.parseInt(temp[0]));
				employee.setName(temp[1]);
				employee.setDesignation(temp[2]);
				listEmp.add(employee);
			}
			return listEmp;
		}
		catch(IOException e){
			e.printStackTrace();
			return null;
		}
		finally {
			try {
				if (br != null)br.close();
				} catch (IOException ex) {
				ex.printStackTrace();
				return null;
				}
		}
		}
	
		public ArrayList<Employee> getEmployeeSalary(){
			String str=null;
			ArrayList<Employee> listEmpSal=new ArrayList<Employee>();
			Employee employee=null;
			try{
				br=new BufferedReader(new FileReader("D:\\Java\\POC\\DemoCollectionIOString\\src\\employeeSalary.txt"));
			while((str=br.readLine())!=null){
				employee=new Employee();
				String[] temp=str.split(",");
				employee.setSalary(temp[1]);
				listEmpSal.add(employee);
			}	
				return listEmpSal;
			}catch (IOException e) {
				e.printStackTrace();
				return null;
		}
		finally {
			try {
				if (br != null)br.close();
				} catch (IOException ex) {
				ex.printStackTrace();
				return null;
				}
		}
}
}


