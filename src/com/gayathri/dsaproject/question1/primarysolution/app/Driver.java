
package com.gayathri.dsaproject.question1.primarysolution.app;
import com.gayathri.dsaproject.question1.primarysolution.service.*;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
	
public class Driver {

    public static void main(String[] args) {
        
        Stack<Integer> floors = new Stack<Integer>();
        Queue<Integer> floorsTemp = new LinkedList<>();  
        SortQueueInDescending queueObject = new SortQueueInDescending();
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("enter the total no of floors in the building");
        
        int NoOfFloors = in.nextInt();
               
        boolean checkPrint=false;
        
        for( int index1 = 0; index1 < NoOfFloors; index1++){
        	
            System.out.println("enter the floor size given on day : " + (index1+1));
            
            floors.add(in.nextInt());
        }
        
        in.close();
        
        System.out.println( );
        
        System.out.println("The order of construction is as follows ");
        
        System.out.println( );
        
        int biggestFloorValue = NoOfFloors;  

        for(int index2=0;index2<NoOfFloors;index2++){
        	
        	System.out.println("Day: " + (index2+1) +" ");
        	
        	checkPrint=false;
        	
        	if (floors.get(index2) != biggestFloorValue)
        	{
        		floorsTemp.add(floors.get(index2));
        		
        		System.out.println( );
        		
        		continue;
        		        	
        	}
        	
        	
        	if (floors.get(index2) == biggestFloorValue)
        	{
        		System.out.print(floors.get(index2) + " ");
        		
        		queueObject.sortMyQueue(floorsTemp);
        		
        		checkPrint=true;
        		
        		biggestFloorValue--;
        	}
        	
            while(checkPrint==true)
            { 
               
            		if (floorsTemp.contains(biggestFloorValue)) {
            			
            			System.out.print( floorsTemp.peek()+ " ");
            			
            			floorsTemp.poll();
            			
            			queueObject.sortMyQueue(floorsTemp);
            			
            			checkPrint=true;
            			
                		biggestFloorValue--;
            		}
            		else {
            			
            			checkPrint=false;
            			
            			System.out.println( );
            			 
            		}      			
      
             }
            
        }
        
    }

  }

	

	
    
