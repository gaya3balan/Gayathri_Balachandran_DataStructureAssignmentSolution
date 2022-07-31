package com.gayathri.dsaproject.question2.primarysolution.app;
import com.gayathri.dsaproject.question2.primarysolution.service.*;

public class Driver {
		
	public static void main (String[] args)
	{
		Main tree = new Main();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left= new Node(55);
		
		tree.changeBSTtoSkewedTree(tree.node);
		
		tree.inOrderTraversal(tree.headNode);
		
		System.out.println( );
		
   	   //tree.preOrderTraversal(tree.headNode);
		
		System.out.println( );
		
	   //tree.postOrderTraversal(tree.headNode);
		
		//*Note to Great Learning Reviewer regarding above commented methods : I have added the  methods preOrderTraversal and postOrderTraversal in my Main.java
		//*so that in case if you want to uncomment here in the Driver.java to check and  
		//*traverse to make sure that my tree is indeed right skewed- please go ahead and uncomment and run it .
		//*This is why I have added those methods as commented. Also preorder will be 10 30 50 55 60, post order will be 60 55 50 30 10
		//*This is one way  I have cross checked that my output tree is indeed perfectly Right Skewed.
		
	}

}
