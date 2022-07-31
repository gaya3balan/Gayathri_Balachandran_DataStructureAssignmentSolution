package com.gayathri.dsaproject.question2.alternatesolution.app;
import com.gayathri.dsaproject.question2.alternatesolution.service.*;

import java.util.LinkedList;

class Main{

	Node node;

        static void addNodesToList(Node currentNode, LinkedList<Integer> inorderList) {
	  
	      if (currentNode == null) 
	      return;
 
	 	addNodesToList(currentNode.left , inorderList);
		
		inorderList.add(currentNode.data);

		addNodesToList(currentNode.right, inorderList);
		
	     }     
       
     public static void main(String[] args){
      
    	 Main tree = new Main();
                                                    //create my Binary Search Tree
    	 tree.node = new Node(50);
    	 tree.node.left = new Node(30);
    	 tree.node.right = new Node(60);
    	 tree.node.left.left = new Node(10);
    	 tree.node.right.left= new Node(55);
    	 
    	 Node object = new Node();
		
		 LinkedList<Integer> inorderList = new LinkedList<>();   //create my lookup arraylist to add the tree nodes for sum check 
		
		 Main.addNodesToList(tree.node, inorderList); // call method to traverse the tree to copy node values to arraylist by passing root node and array list 
		 
		 object.delinkLeftRightNodes(tree.node);  //de-link left and right child of root
		
		 object.relinkNodesToRST(tree.node, inorderList); //re-link right nodes to root with values from arraylist by passing arraylist and root node 
		 	 
		 object.inOrder(tree.node);  //do the in-order traversal of the tree 
		 
		 System.out.println();
		 
		 //object.preOrder(tree.node);
		 
		 System.out.println();
		 
		 //object.postOrder(tree.node); 
		 
		 
		//*Note to Great Learning Reviewer regarding above commented methods : I have added the  methods preOrde and postOrder in my Node.java
		//*so that in case if you want to uncomment here in the Main.java to check and  
		//*traverse to make sure that my tree is indeed right skewed- please go ahead and uncomment and run it .
		//*This is why I have added those methods as commented. Also pre-order will be 10 30 50 55 60, post order will be 60 55 50 30 10
		//*This is one way  I have cross checked that my output tree is indeed perfectly Right Skewed.
			
 
     }

}