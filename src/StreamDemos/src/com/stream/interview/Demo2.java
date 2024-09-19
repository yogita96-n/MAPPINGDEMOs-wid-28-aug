package com.stream.interview;

import java.util.Arrays;
import java.util.List;

public class Demo2 {
	public static void main(String[] args) {
		
		//find third highest value
		 List<Integer>lst=Arrays.asList(12,334,45656,787,23425,67658);
		 
		 System.out.println(lst.stream().
		 
				 sorted((a,b)->b-a)//for descending order sorting so highest element comes first
		 
				 .skip(2).//skipping first 2 element
		
				 findFirst().get());// finding only first most element
	}

}
