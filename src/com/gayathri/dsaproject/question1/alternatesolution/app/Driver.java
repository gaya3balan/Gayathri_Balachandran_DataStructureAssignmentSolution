
package com.gayathri.dsaproject.question1.alternatesolution.app;
import com.gayathri.dsaproject.question1.alternatesolution.service.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

	
public class Driver {

    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
        
        System.out.println("enter the total no of floors in the building");
        
        int NoOfFloors = input.nextInt();
        
        List<Integer> floors = new LinkedList<Integer>();
        
        List<Integer> floorsTemp = new LinkedList<Integer>();
        
        FloorsPrint object = new FloorsPrint();
        
        boolean printFlag=false;
        
        for( int i = 0; i<NoOfFloors; i++){
        	
            System.out.println("enter the floor size given on day : " + (i+1));
            
            floors.add(input.nextInt());
        }
        
        input.close();
        
        System.out.println( );
        
        System.out.println("The order of construction is as follows");
        
        System.out.println( );
        
        int maxFloor = NoOfFloors;  

        for(int j=0;j<NoOfFloors;j++){
        	
        	System.out.println("Day: " + (j+1) );
        	
        	printFlag=false;
        	
        	if (floors.get(j) != maxFloor)
        	{
        		floorsTemp.add(floors.get(j));
        		
        		System.out.println( );
        		
        		continue;    		
        	
        	}
        	       	
        	if (floors.get(j) == maxFloor)
        	{
        		printFlag=true;
        		
        		maxFloor = object.methodOne(floors, floorsTemp, maxFloor, j);
        		
        	}
            
             maxFloor=object.methodTwo(floorsTemp, maxFloor, printFlag); 	
            
        }
        
    }

  }

	

	
    
