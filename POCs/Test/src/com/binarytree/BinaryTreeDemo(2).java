package com.binarytree;

public class BinaryTreeDemo {
public static void main(String[] args) {
	BinaryTree bt=new BinaryTree();
	bt.insert(5);bt.insert(3);bt.insert(4);bt.insert(9);bt.insert(8);bt.insert(6);bt.insert(10);
	bt.inorder();
	bt.preorder();
	bt.postorder();
	System.out.println(bt.countNodes());
	bt.mirror();
}
}
