package com.stream.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class DuplicateRemoveDemo {
	public static void main(String[] args) {
		
		 String[] array = {"apple", "banana", "apple", "orange", "banana", "grape"};
		 
	//remove array duplicate
		 
	String[] removeArray	 = Arrays.stream(array).//
				          
				              distinct(). //remove duplicate
				             
				                toArray(String[]:: new);//create new array
	
              System.out.println("remove duplicate of arrray: " +Arrays.toString(removeArray));//toString use to print string value instead of hash
	
	//remove with set
         
              Set<String>set  = Arrays.stream(array).
        		    
        		             collect(Collectors.toSet());//collect in set and set is not consist duplicate
	
              System.out.println("remove with set: " +set);
   
     //remove list  duplicate          
              
              List<String> list = Arrays.asList("app", "bana", "app", "oran", "bana", "grape");

              List<String> distinctList = list.stream()
                  
            		  .distinct()  // Remove duplicates
                       
            		    .collect(Collectors.toList());  // Collect results into a List
              
              System.out.println("remove duplicate from list : " +distinctList);
	
	} 

}
