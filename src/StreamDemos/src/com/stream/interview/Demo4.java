package com.stream.interview;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo4 {
	public static void main(String[] args) {
		String s1="muskankumari";
		
	LinkedHashMap<Character, Long> repeated=s1.chars().mapToObj(x->(char)x).
	      collect(Collectors.groupingBy
			(Function.identity(),
					LinkedHashMap:: new,
					 Collectors.counting()));
	
	Character firstRepeatedChar =repeated.
			       entrySet().
			           stream().
			            filter(x->x.getValue()>1).
			              map(x->x.getKey()).
			                findFirst().get();
	
	System.out.println("first repeted charceter will be :" +firstRepeatedChar);
	
	}

}
