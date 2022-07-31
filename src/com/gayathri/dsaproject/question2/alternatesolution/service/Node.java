package com.gayathri.dsaproject.question2.alternatesolution.service;

import java.util.LinkedList;

public class Node {
	
		public int data;
		public Node left;
		public Node right;
		
		public Node(int data){
			this.data=data;
		}
		
		public Node() {
			// TODO Auto-generated constructor stub
		}
		
		
		public void inOrder(Node node) {
			
	            if (node == null)
	              return;
	            
	            inOrder(node.left);
	            System.out.print(node.data + " ");
	            inOrder(node.right);    
	            
	          }
		
		
		
		//* In order to test below 2 methods- preOrder/ postOrder- please uncomment from my Main.java
		//* Although not asked in the Lab 3 Question2, I have added this to cross check that my tree is indeed right skewed.
		//* These methods are purely for my validation that I have added
	        
	      public  void preOrder(Node node) {
	            if (node == null)
	              return;
	            
	           
	            System.out.print(node.data + " ");
	            preOrder(node.left);
	            preOrder(node.right);
	            
	            
	          }
	        
	        public void postOrder(Node node) {
	            if (node == null)
	              return;
	            
	            postOrder(node.left);
	            postOrder(node.right);
	            System.out.print(node.data + " ");
	            
	          }
               
	        
	        
	       public static Node NewNode(int data)
	        {
	            Node temp = new Node();
	            temp.data = data;
	            temp.left = null;
	            temp.right = null;
	            return temp;
	        }
	       
	       
	        
	       public void delinkLeftRightNodes(Node root)  //de-link left and right nodes from the root temporarily
			 {
			     if (root!=null){
			         delinkLeftRightNodes(root.left);
			         root.left = null;
			         delinkLeftRightNodes(root.right);
			         root.right = null;
			     }
			     
			 }
	       
	       
	       
	        public static Node assignRightNodes(Node root, int valueToAssign)
	        {
	            if (root == null)
	                return NewNode(valueToAssign);
	                root.right = assignRightNodes(root.right, valueToAssign);
	                root.left=null;
	            return root;
	        }
	        
	        
	        
	        public void relinkNodesToRST(Node currentNode, LinkedList<Integer> inorderList) {
	        	
	        	if (currentNode == null)
	      	      return; 
	        	
	        	currentNode.data= inorderList.get(0);  //set root's data  as the ascending order first element 
	        
	        	for( int i=1; i<inorderList.size() ; i++)
	        		
	        	   {    
	        		 assignRightNodes(currentNode,inorderList.get(i));
	        		 currentNode.left=null;               //set all left nodes to null in my right skewed BST
	        		 	
	        		}
	        	}
	}

