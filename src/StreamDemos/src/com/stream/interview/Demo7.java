package com.stream.interview;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo7 {
	public static void main(String[] args) {
		
		String input1="Boy is Bad girl is good";
		
		System.out.println("INPUT STRING WILL BE : " +input1);
		
		//count each word occurrence
		
	Map<String,Long> count 	= Arrays.stream(input1.split(" ")).
			                   
			                   collect(Collectors.groupingBy(String::toLowerCase,
			                       
			                		 Collectors.counting()));
	
	System.out.println("OUTPUT WILL BE : " +count);
	
		
	}

}
