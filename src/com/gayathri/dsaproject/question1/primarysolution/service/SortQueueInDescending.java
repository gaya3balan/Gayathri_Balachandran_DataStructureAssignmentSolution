package com.gayathri.dsaproject.question1.primarysolution.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;

public class SortQueueInDescending {
	
	public Queue<Integer> sortMyQueue(Queue<Integer> myQueue)   //method to sort the contents of queue in descending order 
	{
	    ArrayList<Integer> temp = new ArrayList<>();
	    
	    while(myQueue.isEmpty() == false)
	    {
	           temp.add(myQueue.peek());   //add queue contents to arraylist and remove the contents of queue 
	           myQueue.remove();
	    }
	    
	    Collections.sort(temp);              //sort arraylist in descending order by first sort in ascending and applying reverse 
	    Collections.reverse(temp);  
	    
	    for(int i=0;i<temp.size();i++)
	    {
	        myQueue.add(temp.get(i));          //add contents from arraylist back to queue
	       
	    }
	    return myQueue;
	}

}
