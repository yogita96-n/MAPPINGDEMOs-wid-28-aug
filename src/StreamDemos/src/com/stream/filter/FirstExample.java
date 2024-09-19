package com.stream.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FirstExample {
	public static void main(String[] args) {
		List<String>list=Arrays.asList("apple","all","pineapple","radar","lion","tiger","example","sample","banana","level");
	
		//filter out according to length of string	
	
		List<String> listString=list.stream().
			
				filter(s->s.length()>4).
	          
				collect(Collectors.toList());
	System.out.println("OUTPUT:" +listString);	
//filter out string according to first character
	
	char stratChar='a';
	
	List<String>output=list.stream().
			
			filter(s-> s.startsWith(String.valueOf(stratChar))).
	         
			collect(Collectors.toList());
	//change boolean to string by String.valueOf() method
	System.out.println("OUTWITH WITH START WORD:" +output);
	
	//end with  specific character
	
	char endWord='e';
	
	List<String>output1=list.stream().
			filter(s->s.endsWith(String.valueOf(endWord))).
	          
			collect(Collectors.toList());
	System.out.println("END WORD STRING WILL BE:" +output1);
	
	//start and end with specific character
	
	//char stratChar='a';
	
	//char endWord='e';
	List<String>mixOutput=list.stream().
			
			filter(s->s.startsWith(String.valueOf(stratChar))&&s.endsWith(String.valueOf(endWord))).
			 
			collect(Collectors.toList());
	System.out.println("STRING START AND END SPECIFIC CHARACTER WILL BE" +mixOutput);
	
List<String>o1=list.stream().
            filter(s->s.length()>0 && s.charAt(0)==s.charAt(s.length()-1)).
            //== methods compares value
             collect(Collectors.toList());
	System.out.println("SAME CHARACTER STRAT AND END WITH:" +o1);
	
	//contains e and length would be 4

	List<String>s2=list.stream().
			
			filter(s->s.length()>4 && s.contains("e")).
			 
			collect(Collectors.toList());
	
	System.out.println("WORD CONTAINS e and LENGTH IS GREATER THAN 4:" +s2);
	//filter out acc to substring
	
	String subString = "ll";
	
	List<String>s1=list.stream().
			
			filter(s->s.contains(subString)).
			 collect(Collectors.toList());
	System.out.println("WORD CONTAINS ll:" +s1);
	
	//filter those words which is palidrome means reverse them and remains same
	
		List<String>s3=list.stream().
				
				filter(s->new StringBuilder(s).reverse().toString().equals(s)).
				 
				collect(Collectors.toList());
		
		System.out.println("PALIDROME WORDS:" +s3);
	
	}
}
