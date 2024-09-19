package com.stream.interview;

import java.util.Map;
import java.util.Optional;

import java.util.stream.Collectors;

public class Demo {
	public static void main(String[] args) {
		
		String s1="yooogitangar";
		Map<Character, Long> collectList =s1.chars().//for changing  to character stream
				
				mapToObj(s->(char)s).
				
				//converting each int to its corresponding char bcoz we can not apply collect,flatMap(), reduce(), 
				//or groupingBy() on primitive data Type
		
				collect(Collectors.groupingBy(x->x,//for character
				
						Collectors.counting()));//for occurrence of character
		
		Optional<Map.Entry<Character,Long>> max = collectList.
				                                     
				entrySet().stream().//entry set having all the value of map
				           
				max(Map.Entry.comparingByValue());//Map.Entry.comparingByValue() is a convenient way to compare map 
	                                       	//entries based on their values when using stream 
		
		System.out.println("maximum ocuured character is: " +max);
	}

}
