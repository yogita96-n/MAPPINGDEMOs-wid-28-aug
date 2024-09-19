package com.stream.interview;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Demo6 {
	public static void main(String[] args) {
        
		//reverse each words of paragraph
		
		String input1="Boy is Bad girl is good";
       
        System.out.println("INPUT : " +input1);
        
        String output= Arrays.stream(input1.split(" ")).//convert string to array of string and remove space
        		
        		map(w-> new StringBuilder(w).//create a stringbuilder
        				
        				reverse().toString()).//reverse them and convert it to string
        		           
        		collect(Collectors.joining(" "));//join words with space
        
        
       System.out.println("REVERSE EACH WORDS: " +output);
	
        
	}

}
