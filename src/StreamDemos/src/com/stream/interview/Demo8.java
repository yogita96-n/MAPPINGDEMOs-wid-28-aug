package com.stream.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Demo8 {
	public static void main(String[] args) {
		
		 List<String> list = Arrays.asList("raj", "somma","raj","raj","somma");

		 //convert list to set
		 
		Set<String> set= list.stream().
		     
				           collect(Collectors.toSet());
		 
		System.out.println("Convert List to Set: " +set);
		 
		 //convert list to map
		
		 Map<String, String> collect =list.stream().
		        
				                                distinct().
		                                              
				                                  collect(Collectors.toMap(e->e, e->e,(existing, replacement) -> existing));
		
		            //This is the merge function, which specifies what to do in case of key collisions. In this case,
		                 
		            //it keeps the existing value and discards the new one.
		 
		 System.out.println("Convert to map : " +collect);
	}

}
