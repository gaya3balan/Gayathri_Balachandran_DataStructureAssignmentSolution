package com.gayathri.dsaproject.question2.primarysolution.service;

public class Main
{
	public Node lastNode = null;
	public Node node;
	public Node headNode = null;

	
	public void changeBSTtoSkewedTree(Node root
								)
	{
		if(root == null)
		{
			return;
		}
	
		changeBSTtoSkewedTree(root.left);
		
		Node rightNode = root.right;
	
		 
		if(headNode == null)
		{
			headNode = root;
			root.left = null;
			lastNode = root;
		}
		else
		{
			lastNode.right = root;
			root.left = null;
			lastNode = root;
		}
	
	
			changeBSTtoSkewedTree(rightNode);
		
	}

	
	public void inOrderTraversal(Node node) {
        if (node == null)
          return;
        
        inOrderTraversal(node.left);
        System.out.print(node.val + " ");
        inOrderTraversal(node.right);    
        
      }
	
	//* In order to test below 2 methods- preOrderTraversal/ postOrderTraversal- please uncomment from my Driver.java
	//* Although not asked in the Lab 3 Question2, I have added this to cross check that my tree is indeed right skewed.
	//* These methods are purely for my validation that I have added
    
    public void preOrderTraversal(Node node) {
        if (node == null)
          return;
        
        System.out.print(node.val + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
        
        
      }
    
    public void postOrderTraversal(Node node) {
        if (node == null)
          return;
        
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.val + " ");
        
      }

	
}


