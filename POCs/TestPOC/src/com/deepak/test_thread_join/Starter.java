package com.deepak.test_thread_join;

public class Starter extends Thread {
 private int x = 2;
 
 public static void main(String[] args) throws Exception {
	 new Starter().makeItSo();
 }
 public Starter(){
 x = 5;
 start();
 }
 public void makeItSo() throws Exception {
	System.out.println("makeItSo: "+x);
	join();
 	System.out.println("makeItSo: "+x);
 	x = x - 2;
 	System.out.println("makeItSo: "+x);
 }
 public void run() {
	 System.out.println("run :"+x);
	 x *= 2; 
	 System.out.println("run :"+x);
	 }
}
