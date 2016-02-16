package com.deepak.comparatorcomparable;

public class Employee implements Comparable<Object> {
private String id;
private int deptno;

Employee(String id,int deptno){
	this.id=id;
	this.deptno=deptno;
}

@Override
public int compareTo(Object obj) {
	// TODO Auto-generated method stub
	Employee emp=(Employee)obj;
	return Integer.compare(deptno,emp.deptno);
}
@Override
public String toString() {
	return id+" "+deptno;
	
}
}
