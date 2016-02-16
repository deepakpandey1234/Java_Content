package com.java.binarytree;

public class Node {

int key;
String name;

Node leftchild;
Node rightchild;

public Node(int key,String name){
	this.key=key;
	this.name=name;
}
@Override
public String toString() {
	
	return name+"has a key:"+key;
}

}
