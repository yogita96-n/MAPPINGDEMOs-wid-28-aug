package com.stream.groupby;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByDemo {
public static void main(String[] args) {
//group by length
	
	List<String>list= Arrays.asList("java","api","stream","group","filter","map","man");

	Map<Integer,List<String>>m1 =list.stream().
   
			               collect(Collectors.groupingBy(s->s.length()));
System.out.println(m1);

//group by even odd
 
List<Integer>l2=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
Map<Boolean,List<Integer>>m2=l2.stream().
    
             collect(Collectors.groupingBy(n->n%2==0));
 System.out.println(m2);

//Group by first character
 
List<String>list1= Arrays.asList("java","api","stream","group","filter","map","elephant");

Map<Character,List<String>>m4=list1.stream().
      
                    collect(Collectors.groupingBy(s->s.charAt(0)));

System.out.println("CHARACTER START WITH :" +m4);

//given list in range 1-10, 11-20, 21-30

List<Integer>num=Arrays.asList(1,12,3,14,5,16,7,8,19,10,22,33,24,21);

Map<String,List<Integer>>n1=num.stream().collect(Collectors.groupingBy(n->{
	if(n<=10) {
		return "1-10";
	}else if(n<=20){
		return "11-20";
		}else {
			return "21-30";
		}
}));
System.out.println("Group By RANG" +n1);

//group string into length and their occrrences
 
List<String>str=Arrays.asList("java","api","stream","group","filter","element");

Map<Integer,Long>map=str.stream().
             
           collect(Collectors.groupingBy(s->s.length(),Collectors.counting()));//counting return long value

          System.out.println("GROUP ACC TO LENGTH & OCCURENCES:" +map);
}
}
