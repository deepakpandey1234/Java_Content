package com.deepak.test;

public class Threads2 implements Runnable {

public void run() {
System.out.println("Hello");
 }
public static void main(String[] args) {
 Thread t = new Thread(new Threads2());
 t.start();
 Thread t2=new Thread(new Threads2());
 t2.start();
 System.out.println("End of method.");
 }
}
