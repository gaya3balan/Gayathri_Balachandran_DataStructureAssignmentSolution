package com.gayathri.dsaproject.question1.alternatesolution.service;

import java.util.Collections;
import java.util.List;

public class FloorsPrint {
	
   public int methodOne(List<Integer> floors ,List<Integer> floorsTemp, int maxFloor , int j) {
		
		System.out.print(floors.get(j) + " ");
		
		Collections.sort(floorsTemp);                      //sort first ascending and then reverse for getting descending order 
		Collections.reverse(floorsTemp);
		
		maxFloor--;          //point to next highest floor as maxFloor
		
		return maxFloor;
	}
	
	public int methodTwo(List<Integer> floorsTemp, int maxFloor, boolean printFlag) {
		
	while(printFlag==true) {
	
		if (floorsTemp.contains(maxFloor)) {
			
			System.out.print( floorsTemp.get(0)+ " ");
			
			floorsTemp.remove(0);                //remove maxFloor from the temporary list as it has already been printed to console
			
			Collections.sort(floorsTemp);        //sort first ascending and then reverse for getting descending order
			Collections.reverse(floorsTemp);
			
			printFlag=true;
			
    		maxFloor--;                           //point to next highest floor as maxFloor
		}
		else {
			
			printFlag=false;
			
			System.out.println( );
		} 
		
	}
	
	return maxFloor;
	
	}
	

}
