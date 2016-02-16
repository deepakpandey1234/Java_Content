package com.deepak.innerclass;

public class OuterInnerDemo {
	static int x;
	int z;
class Inner{
	int y;
	private void show() {
		// TODO Auto-generated method stub
System.out.println(x+y+z);
	}
	
	
}
	public static void main(String[] args) {
		OuterInnerDemo j=new OuterInnerDemo();
		OuterInnerDemo.Inner i=j.new Inner();
		i.show();
	}
	}

