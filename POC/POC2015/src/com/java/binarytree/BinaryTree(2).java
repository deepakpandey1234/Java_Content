package com.java.binarytree;

public class BinaryTree {
	Node root;
	
	public void inOrderTraverse(Node focusnode){
		
		if(focusnode!=null){
			inOrderTraverse(focusnode.leftchild);
			System.out.println(focusnode);
			inOrderTraverse(focusnode.rightchild);
		}
	}
	
	public void addnode(int key,String name){
		Node newnode=new Node(key,name);
		
		if(root==null){
			root=newnode;
		}
		else{
			Node focusnode=root;
			Node parent;
			
			while(true){
				parent=focusnode;
				if(key<focusnode.key){
					focusnode=focusnode.leftchild;
					if(focusnode==null){
						parent.leftchild=newnode;
						return;
					}
				}
				else{
					focusnode=focusnode.rightchild;
					if(focusnode==null){
						parent.rightchild=newnode;
						return;
					}
				}
			}
		}
	}

}
