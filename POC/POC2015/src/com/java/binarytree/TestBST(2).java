package com.java.binarytree;

public class TestBST {
public static void main(String[] args) {
	BinaryTree bt=new BinaryTree();
	bt.addnode(101,"Deepak");
	bt.addnode(99,"ABC");
	bt.addnode(100,"Pandey");
	bt.addnode(200,"XYZ");
	bt.addnode(150,"Hello");
	bt.addnode(36,"Jai");
	
	bt.inOrderTraverse(bt.root);
}
}
