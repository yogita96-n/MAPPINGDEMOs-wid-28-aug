package com.stream.interview;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo3 {
public static void main(String[] args) {
	
String s1="yoogyitanagarra";

//finding repeated characters

LinkedHashMap<Character,Long> repeated= s1.chars().//convert to stream

                                     mapToObj(a->(char)a).//convert to char stream
                                     
                         collect(Collectors.groupingBy//groupped 
                        		 
		                         (Function.identity(),//key as same char 
		                        		 
		                          LinkedHashMap::new,//used for order preserved
		                          
		                              Collectors.counting()));//counted the occurrences

Character firstNonRepeated= repeated.

                               entrySet().

                                 stream().filter(x->x.getValue()==1).

                                     map(x->x.getKey()).findFirst().get();

System.out.println("first non repeted character will be " +firstNonRepeated);
}
}
