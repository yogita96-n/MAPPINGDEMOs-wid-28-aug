package com.stream.map;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapDemo {
	public static void main(String[] args) {
		
		//convert string to integer list with their length
List<String> list = Arrays.asList("hello","world","java","stREam", "api");
List <Integer>l1=list.stream().
                 map(l->l.length()).
                 collect(Collectors.toList());
System.out.println("NEW LIST WITH LENTH WILL BE :" +l1);	

    //convert to squares
List<Integer> list2 = Arrays.asList(1,2,5,7,8);
List<Integer>l2=list2.stream().
                map(n->(n*n)).collect(Collectors.toList());
	System.out.println("NEW LIST WITH SQURES WILL BE:" +l2);
	
	//convert list to upper & lowercase
	List<String> list3 = Arrays.asList("hello","world","java","stream", "api","map");
	List<String>l3=list3.stream().
     		   map(s->s.toUpperCase()).
     		   collect(Collectors.toList());
	System.out.println("UPPERCASE STRINGS:" +l3);
	
	//lower case
	List<String>list4=list.stream().
			   map(s-> s.toLowerCase()).
			   collect(Collectors.toList());
	System.out.println(list4);
	
	//extract first char

	
	List<Character>list5=list.stream().
			  map(s->s.charAt(0)).collect(Collectors.toList());
	System.out.println(list5);
	
	
	//convert numbers to character '1'
	
	List<Integer> num=Arrays.asList(1,2,3,4,5);
	
	List<String>list6=num.stream().
			 map(String::valueOf).collect(Collectors.toList());
	System.out.println(list6);
	
	//Collect in MAP with group them in firstChar
	
	Map<Character,List<String>>m1 =list.stream().
			
			collect(Collectors.groupingBy(s->s.charAt(0)));

	System.out.println("MAP REPRESENTATION:" +m1);
	}

}
