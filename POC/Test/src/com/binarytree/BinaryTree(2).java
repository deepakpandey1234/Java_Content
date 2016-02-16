package com.binarytree;

public class BinaryTree {
BTNode root=null;

public boolean isEmpty()
{
    return root == null;
}
//insert function
public void insert(int data)
{
    root = insert(root, data);
}
//recursive insertion
private BTNode insert(BTNode node, int data)
{
    if (node == null)
        node = new BTNode(data);
    else
    {
        if (node.getRight() == null)
            node.right = insert(node.right, data);
        else
            node.left = insert(node.left, data);             
    }
    return node;
}     
//function to count
public int countNodes()
{
    return countNodes(root);
}
//Function to count number of nodes recursively
private int countNodes(BTNode r)
{
    if (r == null)
        return 0;
    else
    {
        int l = 1;
        l += countNodes(r.getLeft());
        l += countNodes(r.getRight());
        return l;
    }
}
//Function to search value in Binary tree
public boolean search(int val)
{
    return search(root, val);
}
/* Function to search for an element recursively */
private boolean search(BTNode root, int val)
{
    if (root.getData() == val)
        return true;
    if (root.getLeft() != null){
        if (search(root.getLeft(), val))
            return true;
    }
    if (root.getRight() != null){
        if (search(root.getRight(), val))
            return true;
    }
    return false;         
}
//inorder traversal
public void inorder()
{
    inorder(root);
}
private void inorder(BTNode r)
{
    if (r != null)
    {
        inorder(r.getLeft());
        System.out.print(r.getData() +" ");
        inorder(r.getRight());
    }
   }
public void preorder()
{
    preorder(root);
}
private void preorder(BTNode r)
{
    if (r != null)
    {
        System.out.print(r.getData() +" ");
        preorder(r.getLeft());             
        preorder(r.getRight());
    }
    
}
/* Function for postorder traversal */
public void postorder()
{
    postorder(root);
}
private void postorder(BTNode r)
{
    if (r != null)
    {
        postorder(r.getLeft());             
        postorder(r.getRight());
        System.out.print(r.getData() +" ");
    }
    
}    
void mirror() 
{
	mirror(root);
	}
BTNode mirror(BTNode node){
	  BTNode temp;  
 if(node==null){
	  return node;
  }
	else
    mirror(node.left);
    mirror(node.right);
  
    temp = node.left;
    node.left  = node.right;
    node.right = temp;
    return node;
}
}

