package com.deepak.test;

public class TestStack {

}
class Node{
	Node next;
	private int data;
	
	Node(int data){
		this.data=data;
		next=null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
}
class Stack{
	Node top;
	int size;
	
	public void push(){
		
	}
	public int pop(){
		return -1;
	}
}