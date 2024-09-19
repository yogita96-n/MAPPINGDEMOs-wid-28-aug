package com.stream.interview;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo9 {

	public static void main(String[] args) {
		
		 String input = "hello world";
		 
		Map<Character, Long> count= input.chars().
				                       
				                             mapToObj(e->(char)e).
				                          
				                               collect(Collectors.groupingBy(x->x,Collectors.counting()));
		 
		System.out.println("COUNT THE CHARACTER WITH SPACE WILL BE : " +count);
		
		Map<Character, Long> charCount = input.chars()
	                             
				                     .mapToObj(c -> (char) c)  // Convert int stream to char stream
	                                      
				                      .filter(c -> c != ' ')    // Filter out spaces
	            
				                         .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

	   System.out.println(charCount);
	}
}
